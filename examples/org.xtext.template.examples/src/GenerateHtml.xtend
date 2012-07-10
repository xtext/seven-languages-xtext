

class GenerateHtml {
	def static void main(String[] args) {
		val template = new MyWebsite
		println(template.generate [
			author = 'Hans Harz'
			title = 'My Website'
			description = 'A simple Website'
			sections += new Section(
				'First Section',
				'Bli bla blo.',
				'''
					Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor 
					invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam 
					et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est 
					Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed 
					diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. 
					At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea 
					takimata sanctus est Lorem ipsum dolor sit amet.
				'''
			)
			sections += new Section(
				'Second Section',
				'Another description',
				'''
					Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor 
					invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam 
					et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est 
					Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed 
					diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. 
					At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea 
					takimata sanctus est Lorem ipsum dolor sit amet.
				'''
			)
		])
	}
}

@Data class Section {
	String title
	String description
	String body
}