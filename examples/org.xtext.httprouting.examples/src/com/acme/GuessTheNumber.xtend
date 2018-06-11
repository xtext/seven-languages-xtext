/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.acme

import com.google.common.io.CharSink
import com.google.inject.Inject
import java.io.OutputStreamWriter
import javax.servlet.http.HttpServletResponse

import static extension java.lang.Integer.*

class GuessTheNumber {
	
	@Inject extension MagicNumber 
	@Inject HttpServletResponse response
	
	def handleGuess(String theGuess) {
		if (theGuess === null || number === null)
			seedNumber
		
		if (theGuess === null) {
			sendAnswer(null)
			return
		}
		
		val guess= try { 
				theGuess?.parseInt
			} catch (NumberFormatException e) {
				sendAnswer('''«theGuess» is not a number.''')
				return
			}
		if (guess == number) {
			sendAnswer('''You did it! The correct number is «guess».''')
			cleanNumber
		} else if (guess < number) {
			sendAnswer('''«guess» is too small.''')
		} else if (guess > number) {
			sendAnswer('''«guess» is too high.''')
		}
	}
	
	def handleAnswerToEverything(){
		sendAnswer('''42 is normally the answer to everything ... «IF 42 == number»and the current number is 42, too!«ELSE» but not in this case! ;-) «ENDIF»''')
	}
	
	def sendAnswer(CharSequence message) {'''
		<html>
			<head>
			</head>
			<body onload="document.guessTheNumber.theGuess.focus();">
				<h1>Guess a Number between 1 and 100</h1>
				«IF message !== null»
					<p>«message»</p>
				«ENDIF»
				<form name="guessTheNumber" action="/guess"><input name="theGuess" type="text" focus="true"></action>
			</body>
		</html>
	'''.send}
	
	
	
	def private void send(CharSequence answer) {
		var CharSink sink = [ new OutputStreamWriter(response.outputStream) ];
		sink.write(answer)
	}
}