/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.tests

import com.google.inject.Inject
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.geometry.Point
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.tortoiseshell.interpreter.TortoiseShellInterpeter
import org.xtext.tortoiseshell.lib.MoveEvent
import org.xtext.tortoiseshell.lib.Tortoise
import org.xtext.tortoiseshell.lib.TurnEvent
import org.xtext.tortoiseshell.tortoiseShell.Program

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(TortoiseShellInjectorProvider)
class InterpreterTest {
	
	@Inject extension TortoiseShellInterpeter
	
	@Inject extension ParseHelper<Program>
	
	@Test def void testTortoiseDefaults() {
		new Tortoise => [
			assertTrue(paint)
			assertEquals(0.0, angle, 0.0)
			assertEquals(new Point(0,0), position)
			assertEquals(200, delay)
			assertEquals(ColorConstants.black, lineColor)
			assertEquals(1, lineWidth)
		]	
	}

	@Test def void testTortoisProgram() {
		val tortoise = new Tortoise => [
			assertTrue(paint)
			assertEquals(0.0, angle, 0.0)
			assertEquals(new Point(0,0), position)
			assertEquals(200, delay)
			assertEquals(ColorConstants.black, lineColor)
			assertEquals(1, lineWidth)
		]
		val program = '''
			begin
				delay = 1
				penUp
				lineWidth = 2
				lineColor = blue
				forward(10)
				turnLeft(10)
			end
		'''.parse
		tortoise.run(program, -10)
		tortoise => [
			assertFalse(paint)
			assertEquals(10.0, angle, 0.0)
			assertEquals(new Point(0,-10), position)
			assertEquals(1, delay)
			assertEquals(ColorConstants.blue, lineColor)
			assertEquals(2, lineWidth)
		]
	}  
	
	@Test def void testSubProgram() {
		val tortoise = new Tortoise
		val program = '''
			begin
				delay = 0
				val angle = 20
				for(i: (0..360).withStep(angle)) {
					turnAndGo(10, angle)
				}
			end
			
			sub turnAndGo
				int dist
				int angle
			begin
				forward(dist) 
				turnLeft(angle)
			end
		'''.parse
		val moveEvents = <MoveEvent>newArrayList
		val turnEvents = <TurnEvent>newArrayList
		tortoise.addListener[
			switch it {
				MoveEvent: moveEvents.add(it) 
				TurnEvent: turnEvents.add(it)
			}
		]
		tortoise.run(program, -10)
		assertEquals(19, moveEvents.size)
		assertEquals(19, turnEvents.size)
	}
	
}