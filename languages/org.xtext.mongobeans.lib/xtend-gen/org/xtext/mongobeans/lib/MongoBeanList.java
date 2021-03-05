/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.lib;

import com.mongodb.DBObject;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * Wraps a list of {@link DBObject}s.
 */
@SuppressWarnings("all")
public class MongoBeanList<T extends IMongoBean> implements List<T> {
  private List<DBObject> delegate;
  
  public MongoBeanList(final DBObject owner, final String key) {
    final Object value = owner.get(key);
    if ((value == null)) {
      this.delegate = CollectionLiterals.<DBObject>newArrayList();
      owner.put(key, this.delegate);
    } else {
      this.delegate = ((List<DBObject>) value);
    }
  }
  
  @Override
  public int size() {
    return this.delegate.size();
  }
  
  @Override
  public boolean isEmpty() {
    return this.delegate.isEmpty();
  }
  
  @Override
  public boolean contains(final Object o) {
    return this.delegate.contains(WrappingUtil.unwrap(o));
  }
  
  @Override
  public Iterator<T> iterator() {
    final Function1<DBObject, T> _function = (DBObject it) -> {
      return WrappingUtil.<T>wrapAndCast(it);
    };
    return ListExtensions.<DBObject, T>map(this.delegate, _function).iterator();
  }
  
  @Override
  public T[] toArray() {
    final Function1<DBObject, IMongoBean> _function = (DBObject it) -> {
      return WrappingUtil.wrap(it);
    };
    Object[] _array = ListExtensions.<DBObject, IMongoBean>map(this.delegate, _function).toArray();
    return ((T[]) _array);
  }
  
  @Override
  public <R extends Object> R[] toArray(final R[] a) {
    R[] _xblockexpression = null;
    {
      Object[] _xifexpression = null;
      int _size = ((List<R>)Conversions.doWrapArray(a)).size();
      int _size_1 = this.size();
      boolean _lessThan = (_size < _size_1);
      if (_lessThan) {
        Object _newInstance = Array.newInstance(a.getClass().getComponentType(), this.size());
        _xifexpression = ((Object[]) _newInstance);
      } else {
        _xifexpression = a;
      }
      final Object[] result = _xifexpression;
      final Procedure2<T, Integer> _function = (T elem, Integer idx) -> {
        result[(idx).intValue()] = elem;
      };
      IterableExtensions.<T>forEach(this, _function);
      int _size_2 = ((List<R>)Conversions.doWrapArray(a)).size();
      int _size_3 = this.size();
      boolean _greaterThan = (_size_2 > _size_3);
      if (_greaterThan) {
        result[this.size()] = null;
      }
      _xblockexpression = ((R[]) result);
    }
    return _xblockexpression;
  }
  
  @Override
  public boolean add(final T e) {
    return this.delegate.add(WrappingUtil.unwrap(e));
  }
  
  @Override
  public boolean remove(final Object o) {
    return this.delegate.remove(WrappingUtil.unwrap(o));
  }
  
  @Override
  public boolean containsAll(final Collection<?> c) {
    final Function1<Object, DBObject> _function = (Object it) -> {
      return WrappingUtil.unwrap(it);
    };
    return this.delegate.containsAll(IterableExtensions.<DBObject>toList(IterableExtensions.map(c, _function)));
  }
  
  @Override
  public boolean addAll(final Collection<? extends T> c) {
    boolean _xblockexpression = false;
    {
      for (final T element : c) {
        this.delegate.add(WrappingUtil.unwrap(element));
      }
      boolean _isEmpty = c.isEmpty();
      _xblockexpression = (!_isEmpty);
    }
    return _xblockexpression;
  }
  
  @Override
  public boolean addAll(final int index, final Collection<? extends T> c) {
    boolean _xblockexpression = false;
    {
      final Function1<T, DBObject> _function = (T it) -> {
        return WrappingUtil.unwrap(it);
      };
      List<DBObject> _map = ListExtensions.map(ListExtensions.reverse(IterableExtensions.toList(c)), _function);
      for (final DBObject element : _map) {
        this.delegate.add(index, element);
      }
      boolean _isEmpty = c.isEmpty();
      _xblockexpression = (!_isEmpty);
    }
    return _xblockexpression;
  }
  
  @Override
  public boolean removeAll(final Collection<?> c) {
    final Function1<Object, DBObject> _function = (Object it) -> {
      return WrappingUtil.unwrap(it);
    };
    return this.delegate.removeAll(IterableExtensions.<DBObject>toList(IterableExtensions.map(c, _function)));
  }
  
  @Override
  public boolean retainAll(final Collection<?> c) {
    final Function1<Object, DBObject> _function = (Object it) -> {
      return WrappingUtil.unwrap(it);
    };
    return this.delegate.retainAll(IterableExtensions.<DBObject>toList(IterableExtensions.map(c, _function)));
  }
  
  @Override
  public void clear() {
    this.delegate.clear();
  }
  
  @Override
  public boolean equals(final Object o) {
    return this.delegate.equals(o);
  }
  
  @Override
  public int hashCode() {
    return this.delegate.hashCode();
  }
  
  @Override
  public T get(final int index) {
    return WrappingUtil.<T>wrapAndCast(this.delegate.get(index));
  }
  
  @Override
  public T set(final int index, final T element) {
    return WrappingUtil.<T>wrapAndCast(this.delegate.set(index, WrappingUtil.unwrap(element)));
  }
  
  @Override
  public void add(final int index, final T element) {
    this.delegate.add(index, WrappingUtil.unwrap(element));
  }
  
  @Override
  public T remove(final int index) {
    return WrappingUtil.<T>wrapAndCast(this.delegate.remove(index));
  }
  
  @Override
  public int indexOf(final Object o) {
    return this.delegate.indexOf(o);
  }
  
  @Override
  public int lastIndexOf(final Object o) {
    return this.delegate.lastIndexOf(o);
  }
  
  @Override
  public ListIterator<T> listIterator() {
    final Function1<DBObject, T> _function = (DBObject it) -> {
      return WrappingUtil.<T>wrapAndCast(it);
    };
    return ListExtensions.<DBObject, T>map(this.delegate, _function).listIterator();
  }
  
  @Override
  public ListIterator<T> listIterator(final int index) {
    final Function1<DBObject, T> _function = (DBObject it) -> {
      return WrappingUtil.<T>wrapAndCast(it);
    };
    return ListExtensions.<DBObject, T>map(this.delegate, _function).listIterator(index);
  }
  
  @Override
  public List<T> subList(final int fromIndex, final int toIndex) {
    final Function1<DBObject, T> _function = (DBObject it) -> {
      return WrappingUtil.<T>wrapAndCast(it);
    };
    return ListExtensions.<DBObject, T>map(this.delegate, _function).subList(fromIndex, toIndex);
  }
}
