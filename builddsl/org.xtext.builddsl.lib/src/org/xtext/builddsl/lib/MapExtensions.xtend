package org.xtext.builddsl.lib

import com.google.common.io.Files
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.Map
import java.util.jar.JarOutputStream
import java.util.zip.ZipEntry

class MapExtensions {
	def static void createJarFromFiles(Map<String, File> files, File zipFile) {
		val out =  new JarOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)))
		try {
			out.setMethod(JarOutputStream::DEFLATED)
			for(e : files.entrySet) {
				val ze = new ZipEntry(e.key)
				out.putNextEntry(ze)
				Files::copy(e.value, out)
				out.closeEntry
			}
			out.flush
		} finally {
			out.close
		}
		
	}
}