package com.designpatterns.behavioural.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
