package com.gamerverse.api.etc;

import org.jetbrains.annotations.NotNull;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CircularArrayList<E> extends AbstractCollection<E> {
    private final ArrayList<E> array;
    private int index;

    public CircularArrayList() {
        this.array = new ArrayList<>();
        this.index = 0;
    }

    @Override
    public boolean add(E element) {
        this.array.add(element);
        return false;
    }

    public void add(E element, int index) {
        this.array.add(index, element);
    }

    public void addFirst(E element) {
        this.array.addFirst(element);
    }

    public void addLast(E element) {
        this.array.add(element);
    }

    public E remove(int index) {
        if (this.indexNotInBounds(index)) {
            throw new IndexOutOfBoundsException("0 <= " + index + " < " + this.size());
        }
        if (indexInBounds(this.index, this.size()-2)) {
            return this.array.remove(index);
        }
        this.index--;
        return this.array.remove(this.index+1);
    }

    public E removeFirst() {
        return this.remove(0);
    }

    public E removeLast() {
        return this.remove(this.size()-1);
    }

    public E removeAtIndex() {
        return this.remove(this.index);
    }

    public void removeAll() {
        this.index = 0;
        this.array.clear();
    }

    public E getAtIndex() {
        return this.array.get(this.index);
    }

    public E getIndexOf(int index) {
        return this.array.get(index);
    }

    public E getFirst() {
        return this.array.getFirst();
    }

    public E getLast() {
        return this.array.getLast();
    }

    public void next(int step) {
        this.index = this.calculateIndex(step);
    }

    public void setIndex(int index) {
        if (this.indexNotInBounds(index)) {
            throw new IndexOutOfBoundsException("0 <= " + index + " < " + this.size());
        }
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    @Override
    public int size() {
        return this.array.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public static boolean indexInBounds(int index, int size) {
        return index >= 0 && index < size;
    }

    public boolean indexInBounds(int index) {
        return indexInBounds(index, this.size());
    }

    public static boolean indexNotInBounds(int index, int size) {
        return !indexInBounds(index, size);
    }

    public boolean indexNotInBounds(int index) {
        return !indexInBounds(index, this.size());
    }

    public int calculateIndex(int step) {
        int result = (this.index + step) % this.size();
        return (result < 0) ? result + this.size() : result;
    }

    public void shuffle() {
        Collections.shuffle(this.array);
    }


    @Override
    public @NotNull Iterator<E> iterator() {
        return array.iterator();
    }
}
