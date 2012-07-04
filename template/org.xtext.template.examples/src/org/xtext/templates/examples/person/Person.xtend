package org.xtext.templates.examples.person

import java.util.List
import org.eclipse.xtend.lib.Property

class Person {
	@Property String firstName 	
	@Property String middleName 	
	@Property String lastName
	@Property List<Email> emails = newArrayList
	@Property List<Address> addresses = newArrayList
	@Property List<Phone> phones = newArrayList
}

class Address {
	@Property AddressType type 
	@Property String street
	@Property String postalCode
	@Property String city
	@Property String state
	@Property String country
}

class Phone {
	@Property AddressType type 
	@Property String number
}

class Email {
	@Property AddressType type 
	@Property String email
}