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
 * Wraps a list of {@link DBObjects}.
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
  
  public int size() {
    int _size = this.delegate.size();
    return _size;
  }
  
  public boolean isEmpty() {
    boolean _isEmpty = this.delegate.isEmpty();
    return _isEmpty;
  }
  
  public boolean contains(final Object o) {
    DBObject _unwrap = WrappingUtil.unwrap(o);
    boolean _contains = this.delegate.contains(_unwrap);
    return _contains;
  }
  
  public Iterator<T> iterator() {
    final Function1<DBObject,T> _function = new Function1<DBObject,T>() {
        public T apply(final DBObject it) {
          T _wrapAndCast = WrappingUtil.<T>wrapAndCast(it);
          return _wrapAndCast;
        }
      };
    List _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    Iterator _iterator = _map.iterator();
    return _iterator;
  }
  
  public T[] toArray() {
    final Function1<DBObject,IMongoBean> _function = new Function1<DBObject,IMongoBean>() {
        public IMongoBean apply(final DBObject it) {
          IMongoBean _wrap = WrappingUtil.wrap(it);
          return _wrap;
        }
      };
    List _map = ListExtensions.<DBObject, IMongoBean>map(this.delegate, _function);
    Object[] _array = _map.toArray();
    return ((T[]) _array);
  }
  
  public <R extends Object> R[] toArray(final R[] a) {
    R[] _xblockexpression = null;
    {
      Object[] _xifexpression = null;
      int _size = ((List<R>)Conversions.doWrapArray(a)).size();
      int _size_1 = this.size();
      boolean _lessThan = (_size < _size_1);
      if (_lessThan) {
        Class<? extends Object> _class = a.getClass();
        Class<? extends Object> _componentType = _class.getComponentType();
        int _size_2 = this.size();
        Object _newInstance = Array.newInstance(_componentType, _size_2);
        _xifexpression = ((Object[]) _newInstance);
      } else {
        _xifexpression = a;
      }
      final Object[] result = _xifexpression;
      final Procedure2<T,Integer> _function = new Procedure2<T,Integer>() {
          public void apply(final T elem, final Integer idx) {
            ((List<Object>)Conversions.doWrapArray(result)).set((idx).intValue(), elem);
          }
        };
      IterableExtensions.<T>forEach(this, _function);
      int _size_3 = ((List<R>)Conversions.doWrapArray(a)).size();
      int _size_4 = this.size();
      boolean _greaterThan = (_size_3 > _size_4);
      if (_greaterThan) {
        int _size_5 = this.size();
        ((List<Object>)Conversions.doWrapArray(result)).set(_size_5, null);
      }
      _xblockexpression = (((R[]) result));
    }
    return _xblockexpression;
  }
  
  public boolean add(final T e) {
    DBObject _unwrap = WrappingUtil.unwrap(e);
    boolean _add = this.delegate.add(_unwrap);
    return _add;
  }
  
  public boolean remove(final Object o) {
    DBObject _unwrap = WrappingUtil.unwrap(o);
    boolean _remove = this.delegate.remove(_unwrap);
    return _remove;
  }
  
  public boolean containsAll(final Collection<? extends Object> c) {
    final Function1<Object,DBObject> _function = new Function1<Object,DBObject>() {
        public DBObject apply(final Object it) {
          DBObject _unwrap = WrappingUtil.unwrap(it);
          return _unwrap;
        }
      };
    Iterable<DBObject> _map = IterableExtensions.map(c, _function);
    List<DBObject> _list = IterableExtensions.<DBObject>toList(_map);
    boolean _containsAll = this.delegate.containsAll(_list);
    return _containsAll;
  }
  
  public boolean addAll(final Collection<? extends T> c) {
    boolean _xblockexpression = false;
    {
      for (final T element : c) {
        DBObject _unwrap = WrappingUtil.unwrap(element);
        this.delegate.add(_unwrap);
      }
      boolean _isEmpty = c.isEmpty();
      boolean _not = (!_isEmpty);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
  
  public boolean addAll(final int index, final Collection<? extends T> c) {
    boolean _xblockexpression = false;
    {
      List<?> _list = IterableExtensions.toList(c);
      List<T> _reverse = ListExtensions.<T>reverse(((List<T>) _list));
      final Function1<T,DBObject> _function = new Function1<T,DBObject>() {
          public DBObject apply(final T it) {
            DBObject _unwrap = WrappingUtil.unwrap(it);
            return _unwrap;
          }
        };
      List _map = ListExtensions.<T, DBObject>map(_reverse, _function);
      for (final DBObject element : ((List<DBObject>) _map)) {
        this.delegate.add(index, element);
      }
      boolean _isEmpty = c.isEmpty();
      boolean _not = (!_isEmpty);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
  
  public boolean removeAll(final Collection<? extends Object> c) {
    final Function1<Object,DBObject> _function = new Function1<Object,DBObject>() {
        public DBObject apply(final Object it) {
          DBObject _unwrap = WrappingUtil.unwrap(it);
          return _unwrap;
        }
      };
    Iterable<DBObject> _map = IterableExtensions.map(c, _function);
    List<DBObject> _list = IterableExtensions.<DBObject>toList(_map);
    boolean _removeAll = this.delegate.removeAll(_list);
    return _removeAll;
  }
  
  public boolean retainAll(final Collection<? extends Object> c) {
    final Function1<Object,DBObject> _function = new Function1<Object,DBObject>() {
        public DBObject apply(final Object it) {
          DBObject _unwrap = WrappingUtil.unwrap(it);
          return _unwrap;
        }
      };
    Iterable<DBObject> _map = IterableExtensions.map(c, _function);
    List<DBObject> _list = IterableExtensions.<DBObject>toList(_map);
    boolean _retainAll = this.delegate.retainAll(_list);
    return _retainAll;
  }
  
  public void clear() {
    this.delegate.clear();
  }
  
  public boolean equals(final Object o) {
    boolean _equals = this.delegate.equals(o);
    return _equals;
  }
  
  public int hashCode() {
    int _hashCode = this.delegate.hashCode();
    return _hashCode;
  }
  
  public T get(final int index) {
    DBObject _get = this.delegate.get(index);
    T _wrapAndCast = WrappingUtil.<T>wrapAndCast(_get);
    return _wrapAndCast;
  }
  
  public T set(final int index, final T element) {
    DBObject _unwrap = WrappingUtil.unwrap(element);
    DBObject _set = this.delegate.set(index, _unwrap);
    T _wrapAndCast = WrappingUtil.<T>wrapAndCast(_set);
    return _wrapAndCast;
  }
  
  public void add(final int index, final T element) {
    DBObject _unwrap = WrappingUtil.unwrap(element);
    this.delegate.add(index, _unwrap);
  }
  
  public T remove(final int index) {
    DBObject _remove = this.delegate.remove(index);
    T _wrapAndCast = WrappingUtil.<T>wrapAndCast(_remove);
    return _wrapAndCast;
  }
  
  public int indexOf(final Object o) {
    int _indexOf = this.delegate.indexOf(o);
    return _indexOf;
  }
  
  public int lastIndexOf(final Object o) {
    int _lastIndexOf = this.delegate.lastIndexOf(o);
    return _lastIndexOf;
  }
  
  public ListIterator<T> listIterator() {
    final Function1<DBObject,T> _function = new Function1<DBObject,T>() {
        public T apply(final DBObject it) {
          T _wrapAndCast = WrappingUtil.<T>wrapAndCast(it);
          return _wrapAndCast;
        }
      };
    List _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    ListIterator _listIterator = _map.listIterator();
    return _listIterator;
  }
  
  public ListIterator<T> listIterator(final int index) {
    final Function1<DBObject,T> _function = new Function1<DBObject,T>() {
        public T apply(final DBObject it) {
          T _wrapAndCast = WrappingUtil.<T>wrapAndCast(it);
          return _wrapAndCast;
        }
      };
    List _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    ListIterator _listIterator = _map.listIterator(index);
    return _listIterator;
  }
  
  public List<T> subList(final int fromIndex, final int toIndex) {
    final Function1<DBObject,T> _function = new Function1<DBObject,T>() {
        public T apply(final DBObject it) {
          T _wrapAndCast = WrappingUtil.<T>wrapAndCast(it);
          return _wrapAndCast;
        }
      };
    List _map = ListExtensions.<DBObject, T>map(this.delegate, _function);
    List _subList = _map.subList(fromIndex, toIndex);
    return _subList;
  }
}
