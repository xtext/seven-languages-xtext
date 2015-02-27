/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.lib;

import com.google.common.base.Objects;
import com.mongodb.DBObject;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
import org.xtext.mongobeans.lib.IMongoBean;
import org.xtext.mongobeans.lib.WrappingUtil;

/**
 * Wraps a list of {@link DBObject}s.
 */
@SuppressWarnings("all")
public class MongoBeanList<T extends IMongoBean> implements List<T> {
  private List<DBObject> delegate;
  
  public MongoBeanList(final DBObject owner, final String key) {
    final Object value = owner.get(key);
    boolean _equals = Objects.equal(value, null);
    if (_equals) {
      ArrayList<DBObject> _newArrayList = CollectionLiterals.<DBObject>newArrayList();
      this.delegate = _newArrayList;
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
    DBObject _unwrap = WrappingUtil.unwrap(o);
    return this.delegate.contains(_unwrap);
  }
  
  @Override
  public Iterator<T> iterator() {
    final Function1<DBObject, T> _function = new Function1<DBObject, T>() {
      @Override
      public T apply(final DBObject it) {
        return WrappingUtil.<T>wrapAndCast(it);
      }
    };
    List<T> _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    return _map.iterator();
  }
  
  @Override
  public T[] toArray() {
    final Function1<DBObject, IMongoBean> _function = new Function1<DBObject, IMongoBean>() {
      @Override
      public IMongoBean apply(final DBObject it) {
        return WrappingUtil.wrap(it);
      }
    };
    List<IMongoBean> _map = ListExtensions.<DBObject, IMongoBean>map(this.delegate, _function);
    Object[] _array = _map.toArray();
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
        Class<?> _class = a.getClass();
        Class<?> _componentType = _class.getComponentType();
        int _size_2 = this.size();
        Object _newInstance = Array.newInstance(_componentType, _size_2);
        _xifexpression = ((Object[]) _newInstance);
      } else {
        _xifexpression = a;
      }
      final Object[] result = _xifexpression;
      final Procedure2<T, Integer> _function = new Procedure2<T, Integer>() {
        @Override
        public void apply(final T elem, final Integer idx) {
          result[(idx).intValue()] = elem;
        }
      };
      IterableExtensions.<T>forEach(this, _function);
      int _size_3 = ((List<R>)Conversions.doWrapArray(a)).size();
      int _size_4 = this.size();
      boolean _greaterThan = (_size_3 > _size_4);
      if (_greaterThan) {
        int _size_5 = this.size();
        result[_size_5] = null;
      }
      _xblockexpression = ((R[]) result);
    }
    return _xblockexpression;
  }
  
  @Override
  public boolean add(final T e) {
    DBObject _unwrap = WrappingUtil.unwrap(e);
    return this.delegate.add(_unwrap);
  }
  
  @Override
  public boolean remove(final Object o) {
    DBObject _unwrap = WrappingUtil.unwrap(o);
    return this.delegate.remove(_unwrap);
  }
  
  @Override
  public boolean containsAll(final Collection<?> c) {
    final Function1<Object, DBObject> _function = new Function1<Object, DBObject>() {
      @Override
      public DBObject apply(final Object it) {
        return WrappingUtil.unwrap(it);
      }
    };
    Iterable<DBObject> _map = IterableExtensions.map(c, _function);
    List<DBObject> _list = IterableExtensions.<DBObject>toList(_map);
    return this.delegate.containsAll(_list);
  }
  
  @Override
  public boolean addAll(final Collection<? extends T> c) {
    boolean _xblockexpression = false;
    {
      for (final T element : c) {
        DBObject _unwrap = WrappingUtil.unwrap(element);
        this.delegate.add(_unwrap);
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
      List<? extends T> _list = IterableExtensions.toList(c);
      List<? extends T> _reverse = ListExtensions.reverse(_list);
      final Function1<T, DBObject> _function = new Function1<T, DBObject>() {
        @Override
        public DBObject apply(final T it) {
          return WrappingUtil.unwrap(it);
        }
      };
      List<DBObject> _map = ListExtensions.map(_reverse, _function);
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
    final Function1<Object, DBObject> _function = new Function1<Object, DBObject>() {
      @Override
      public DBObject apply(final Object it) {
        return WrappingUtil.unwrap(it);
      }
    };
    Iterable<DBObject> _map = IterableExtensions.map(c, _function);
    List<DBObject> _list = IterableExtensions.<DBObject>toList(_map);
    return this.delegate.removeAll(_list);
  }
  
  @Override
  public boolean retainAll(final Collection<?> c) {
    final Function1<Object, DBObject> _function = new Function1<Object, DBObject>() {
      @Override
      public DBObject apply(final Object it) {
        return WrappingUtil.unwrap(it);
      }
    };
    Iterable<DBObject> _map = IterableExtensions.map(c, _function);
    List<DBObject> _list = IterableExtensions.<DBObject>toList(_map);
    return this.delegate.retainAll(_list);
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
    DBObject _get = this.delegate.get(index);
    return WrappingUtil.<T>wrapAndCast(_get);
  }
  
  @Override
  public T set(final int index, final T element) {
    DBObject _unwrap = WrappingUtil.unwrap(element);
    DBObject _set = this.delegate.set(index, _unwrap);
    return WrappingUtil.<T>wrapAndCast(_set);
  }
  
  @Override
  public void add(final int index, final T element) {
    DBObject _unwrap = WrappingUtil.unwrap(element);
    this.delegate.add(index, _unwrap);
  }
  
  @Override
  public T remove(final int index) {
    DBObject _remove = this.delegate.remove(index);
    return WrappingUtil.<T>wrapAndCast(_remove);
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
    final Function1<DBObject, T> _function = new Function1<DBObject, T>() {
      @Override
      public T apply(final DBObject it) {
        return WrappingUtil.<T>wrapAndCast(it);
      }
    };
    List<T> _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    return _map.listIterator();
  }
  
  @Override
  public ListIterator<T> listIterator(final int index) {
    final Function1<DBObject, T> _function = new Function1<DBObject, T>() {
      @Override
      public T apply(final DBObject it) {
        return WrappingUtil.<T>wrapAndCast(it);
      }
    };
    List<T> _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    return _map.listIterator(index);
  }
  
  @Override
  public List<T> subList(final int fromIndex, final int toIndex) {
    final Function1<DBObject, T> _function = new Function1<DBObject, T>() {
      @Override
      public T apply(final DBObject it) {
        return WrappingUtil.<T>wrapAndCast(it);
      }
    };
    List<T> _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    return _map.subList(fromIndex, toIndex);
  }
}
