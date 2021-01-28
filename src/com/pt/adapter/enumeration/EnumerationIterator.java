package com.pt.adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

/*
This is a more practical example of the adapter pattern.
This class adapts the older Enumeration interface to work with the
Iterator interface.
 */


public class EnumerationIterator implements Iterator<Object> {
    private final Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(); // Enumeration doesn't support remove
    }
}
