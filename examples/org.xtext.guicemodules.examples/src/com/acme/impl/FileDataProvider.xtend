package com.acme.impl

import com.acme.DataProvider
import com.google.common.base.Charsets
import com.google.inject.Inject
import java.io.File

import static extension com.google.common.io.Files.*

class FileDataProvider implements DataProvider {
	@Inject @DataFile String dataFile

	override getData() {
		new File(dataFile).readLines(Charsets::UTF_8).join('\n')
	}
	
}