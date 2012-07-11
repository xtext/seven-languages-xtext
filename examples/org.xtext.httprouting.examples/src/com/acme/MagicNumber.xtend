package com.acme

import com.google.inject.Inject
import javax.servlet.http.HttpServletRequest
import java.util.Random

class MagicNumber {
	@Inject HttpServletRequest request
	
	def getNumber() {
		request.session.getAttribute('number') as Integer
	}
	
	def seedNumber() {
		val number = Math::abs(new Random().nextInt % 100)
		request.session.setAttribute('number', number)
	}
	
	def cleanNumber() {
		request.session.removeAttribute('number')
	}
}