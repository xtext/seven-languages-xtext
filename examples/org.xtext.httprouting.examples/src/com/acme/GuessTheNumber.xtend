package com.acme

import com.google.inject.Inject
import java.io.OutputStreamWriter
import javax.servlet.http.HttpServletResponse

import static extension com.google.common.io.CharStreams.*
import static extension java.lang.Integer.*

class GuessTheNumber {
	
	@Inject extension MagicNumber 
	@Inject HttpServletResponse response
	
	def handleGuess(String theGuess) {
		val guess= try { 
				theGuess?.parseInt
			} catch (NumberFormatException e) {
				sendAnswer(theGuess + " is not a number.")
				return
			}

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
		}
	}
	
	def sendAnswer(String message) {'''
			<html>
				<head>
				</head>
				<body onload="document.guessTheNumber.theGuess.focus();">
					<h1>Guess a Number between 1 and 100</h1>
					«IF message != null»
						<p>«message»</p>
					«ENDIF»
					<form name="guessTheNumber" action="/guess"><input name="theGuess" type="text" focus="true"></action>
				</body>
			</html>
		'''.send
	}
	
	def private send(CharSequence answer) {
		answer.write [|new OutputStreamWriter(response.outputStream)]
	}
}