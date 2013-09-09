/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.lib

import com.mongodb.DBObject
import java.lang.reflect.Array
import java.util.Collection
import java.util.List
import java.util.ListIterator

import static extension org.xtext.mongobeans.lib.WrappingUtil.*

/**
 * Wraps a list of {@link DBObject}s.
 */
class MongoBeanList <T extends IMongoBean> implements List<T> {
	
	List<DBObject> delegate
	
	new(DBObject owner, String key) {
		val value = owner.get(key)
		if(value == null) {
			delegate = newArrayList
			owner.put(key, delegate);
		} else {
			delegate = value as List<DBObject>
		}
	}

	override int size() {
		 delegate.size()
	}

	override boolean isEmpty() {
		 delegate.isEmpty()
	}

	override boolean contains(Object o) {
		 delegate.contains(o.unwrap)
	}

	override iterator() {
		delegate.map[<T>wrapAndCast].iterator
	}

	override T[] toArray() {
		 delegate.map[wrap].toArray() as T[]
	}
	
	override <R> toArray(R[] a) { 
		val Object[] result = 
			if(a.size < size) 
				Array.newInstance(a.getClass().componentType, size) as Object[] 
			else 
				a
		forEach [T elem, idx | result.set(idx, elem)]
		if(a.size > size)
			result.set(size, null)
		result as R[]
	}
	
	override boolean add(T e) {
		 delegate.add(unwrap(e))
	}

	override boolean remove(Object o) {
		 delegate.remove(unwrap(o))
	}

	override boolean containsAll(Collection<?> c) {
		 delegate.containsAll(c.map[unwrap].toList)
	}

	override boolean addAll(Collection<? extends T> c) {
		for(element:c)
		 	delegate.add(element.unwrap)
		!c.empty
	}

	override boolean addAll(int index, Collection<? extends T> c) {
		for(element : c.toList.reverse.map[unwrap])
			delegate.add(index, element)
		!c.empty
	}

	override boolean removeAll(Collection<?> c) {
		 delegate.removeAll(c.map[unwrap].toList)
	}

	override boolean retainAll(Collection<?> c) {
		 delegate.retainAll(c.map[unwrap].toList)
	}

	override void clear() {
		delegate.clear()
	}

	override boolean equals(Object o) {
		 delegate.equals(o)
	}

	override int hashCode() {
		 delegate.hashCode()
	}

	override T get(int index) {
		 delegate.get(index).<T>wrapAndCast
	}

	override T set(int index, T element) {
		 delegate.set(index, element.unwrap).<T>wrapAndCast
	}

	override void add(int index, T element) {
		delegate.add(index, element.unwrap)
	}

	override T remove(int index) {
		 delegate.remove(index).<T>wrapAndCast
	}

	override int indexOf(Object o) {
		 delegate.indexOf(o)
	}

	override int lastIndexOf(Object o) {
		 delegate.lastIndexOf(o)
	}

	override ListIterator<T> listIterator() {
		 delegate.map[<T>wrapAndCast].listIterator()
	}

	override ListIterator<T> listIterator(int index) {
		 delegate.map[<T>wrapAndCast].listIterator(index)
	}

	override List<T> subList(int fromIndex, int toIndex) {
		 delegate.map[<T>wrapAndCast].subList(fromIndex, toIndex)
	}
}