package org.xtext.templates.examples.person

import static org.xtext.templates.examples.person.AddressType.*

class VCardTest {
	def static void main(String[] args) {
		println(new VCard().generate [
			p = new Person => [
				firstName = 'John'
				lastName = 'Doe'
				addresses += new Address => [
					type = HOME
					street = 'Bakerstreet 1'
					city = 'London'
					state = 'London'
					postalCode = '123'
					country = 'United Kingdom'
				]
				phones += new Phone => [
					type = HOME
					number="+1-435789 8098"
				]
				phones += new Phone => [
					type = WORK
					number="+2-423456789"
				]
				emails += new Email => [
					type = HOME
					email = "john@doe.com"
				]
				emails += new Email => [
					type = WORK
					email = "johndoe@work.com"
				]
			]
		])
	}
	
}