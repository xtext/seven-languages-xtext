package org.xtext.builddsl.lib.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.eclipse.xtext.xbase.lib.Exceptions;

import com.google.common.collect.Sets;

public class FileProperties extends Properties {

	private static final long serialVersionUID = -6607137607878495137L;

	private File file;

	private Set<String> order = Sets.newLinkedHashSet();

	public FileProperties(File file) {
		super();
		this.file = file;
		if (file.isFile())
			try {
				FileInputStream stream = new FileInputStream(file);
				try {
					load(stream);
				} finally {
					stream.close();
				}
			} catch (FileNotFoundException e) {
				Exceptions.sneakyThrow(e);
			} catch (IOException e) {
				Exceptions.sneakyThrow(e);
			}
	}

	public File getFile() {
		return file;
	}

	@Override
	public synchronized Enumeration<Object> keys() {
		Set<Object> keys = Sets.newLinkedHashSet();
		for (Enumeration<Object> enumeration = super.keys(); enumeration.hasMoreElements();)
			keys.add(enumeration.nextElement());
		Set<Object> result = Sets.newLinkedHashSet();
		for (Object o : order)
			if (keys.contains(o)) {
				keys.remove(o);
				result.add(o);
			}
		result.addAll(keys);
		final Iterator<Object> it = result.iterator();
		return new Enumeration<Object>() {

			@Override
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			@Override
			public Object nextElement() {
				return it.next();
			}
		};
	}

	@Override
	public synchronized Object put(Object key, Object value) {
		order.add(key.toString());
		return super.put(key, value);
	}

	public void save() {
		FileOutputStream stream;
		try {
			stream = new FileOutputStream(file);
			try {
				store(stream, null);
			} finally {
				stream.close();
			}
		} catch (FileNotFoundException e) {
			Exceptions.sneakyThrow(e);
		} catch (IOException e) {
			Exceptions.sneakyThrow(e);
		}
	}

}
