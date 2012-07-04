package org.xtext.templates.examples

class BeerRunner {
	def static void main(String[] args) {
		println(new BeerGenerator().generate)
	}
}