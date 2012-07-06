package com.acme

import com.google.inject.Inject
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import java.io.OutputStreamWriter
import java.util.Random

import static extension java.lang.Integer.*
import static extension com.google.common.io.CharStreams.*

class GuessTheNumber {
	
	@Inject HttpServletRequest request 
	@Inject HttpServletResponse response
	
	def getGuess() {
		request.getParameter('guess')?.valueOf
	}
	
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
	
	def handleGuess(Integer guess) {
		if (guess == null || number == null) {
			seedNumber
			sendAnswer(null)
		} else if (guess == number) {
			sendAnswer('You did it! The correct number is '+guess)
			cleanNumber
		} else if (guess < number) {
			sendAnswer(guess + ' is too small.')
		} else if (guess > number) {
			sendAnswer(guess + ' is too high.')
		} else {
			'''OOOpps'''.send
		}
	}
	
	def sendAnswer(String message) {'''
			<html>
				<head>
				</head>
				<body>
					<h1>Guess a Number between 1 and 100</h1>
					«IF message != null»
						<p>«message»</p>
					«ENDIF»
					<form action="/guess"><input name="guess" type="text"></action>
				</body>
			</html>
		'''.send
	}
	
	def private send(CharSequence answer) {
		answer.write [|new OutputStreamWriter(response.outputStream)]
	}
}