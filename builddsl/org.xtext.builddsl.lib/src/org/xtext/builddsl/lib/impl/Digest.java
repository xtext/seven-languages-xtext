package org.xtext.builddsl.lib.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.eclipse.xtext.xbase.lib.Exceptions;

import com.google.common.collect.Maps;

public class Digest {
	static final String HEX_DIGITS = "0123456789ABCDEF";

	public static String toHex(byte[] bytes) {
		if (bytes == null)
			return null;
		final StringBuilder hex = new StringBuilder(2 * bytes.length);
		for (final byte b : bytes)
			hex.append(HEX_DIGITS.charAt((b & 0xF0) >> 4)).append(HEX_DIGITS.charAt((b & 0x0F)));
		return hex.toString();
	}

	protected Map<String, String> digest = Maps.newLinkedHashMap();

	public void addFile(File file) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			FileInputStream in = new FileInputStream(file);
			try {
				byte[] buf = new byte[4096];
				int length;
				while ((length = in.read(buf)) >= 0)
					md5.update(buf, 0, length);
			} finally {
				in.close();
			}
			digest.put(file.toURI().toString(), toHex(md5.digest()));
		} catch (NoSuchAlgorithmException e) {
			Exceptions.sneakyThrow(e);
		} catch (FileNotFoundException e) {
			Exceptions.sneakyThrow(e);
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != getClass())
			return false;
		return this.digest.equals(((Digest) obj).digest);
	}

	@Override
	public int hashCode() {
		return digest.hashCode();
	}

	public void load(File file) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			try {
				String line;
				while ((line = br.readLine()) != null) {
					String[] items = line.split("=", 2);
					if (items.length == 2)
						digest.put(items[0].trim(), items[1].trim());
				}
			} finally {
				br.close();
			}
		} catch (FileNotFoundException e) {
			Exceptions.sneakyThrow(e);
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}

	}

	public void saveAs(File file) {
		try {
			FileOutputStream stream = new FileOutputStream(file);
			try {
				stream.write(serialize().getBytes());
			} finally {
				stream.flush();
				stream.close();
			}
		} catch (FileNotFoundException e) {
			Exceptions.sneakyThrow(e);
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}
	}

	public String serialize() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> e : digest.entrySet())
			sb.append(e.getKey()).append(" = ").append(e.getValue()).append("\n");
		return sb.toString();
	}

}
