/**
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.bson.io;

import java.io.IOException;

/**
 * This is a replacement of the original, optimized class that had been copied
 * from PostgreSQL and that was not compatible with the Eclipse Public License.
 * 
 * @see https://dev.eclipse.org/ipzilla/show_bug.cgi?id=4889#c10
 * @author Eike Stepper
 */
class UTF8Encoding {
	public synchronized String decode(final byte[] data, final int offset, final int length) throws IOException {
		return new String(data, offset, length, "UTF-8");
	}
}