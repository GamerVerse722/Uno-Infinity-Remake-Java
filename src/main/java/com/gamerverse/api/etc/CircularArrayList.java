package com.gamerverse.api.etc;

import org.jetbrains.annotations.NotNull;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CircularArrayList<T> extends AbstractCollection<T> {
    private final ArrayList<T> array;
    private int index;
    private int size;

    public CircularArrayList() {
        this.array = new ArrayList<>();
        this.index = 0;
        this.size = 0;
    }

    @Override
    public boolean add(T element) {
        this.array.add(element);
        this.size++;
        return false;
    }

    public void add(T element, int index) {
        this.array.add(index, element);
        this.size++;
    }

    public void addFirst(T element) {
        this.array.addFirst(element);
        this.size++;
    }

    public void addLast(T element) {
        this.array.add(element);
        this.size++;
    }

    public T remove(int index) {
        if (this.indexNotInBounds(index)) {
            throw new IndexOutOfBoundsException("0 <= " + index + " < " + this.size);
        }
        if (indexInBounds(this.index, this.size-2)) {
            this.size--;
            return this.array.remove(index);
        }
        this.index--;
        this.size--;
        return this.array.remove(this.index);
    }

    public T removeFirst() {
        return this.remove(0);
    }

    public T removeLast() {
        return this.remove(this.size-1);
    }

    public T removeAtIndex() {
        return this.remove(this.index);
    }

    public void removeAll() {
        this.size = 0;
        this.index = 0;
        this.array.clear();
    }

    public T getAtIndex() {
        return this.array.get(this.index);
    }

    public T getIndexOf(int index) {
        return this.array.get(index);
    }

    public void next(int step) {
        this.index = this.calculateIndex(step);
    }

    public void setIndex(int index) {
        if (this.indexNotInBounds(index)) {
            throw new IndexOutOfBoundsException("0 <= " + index + " < " + this.size);
        }
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    @Override
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public static boolean indexInBounds(int index, int size) {
        return index >= 0 && index < size;
    }

    public boolean indexInBounds(int index) {
        return indexInBounds(index, this.size);
    }

    public static boolean indexNotInBounds(int index, int size) {
        return !indexInBounds(index, size);
    }

    public boolean indexNotInBounds(int index) {
        return !indexInBounds(index, this.size);
    }

    public int calculateIndex(int step) {
        int result = (this.index + step) % this.size;
        return (result < 0) ? result + this.size : result;
    }

    public void shuffle() {
        Collections.shuffle(this.array);
    }


    @Override
    public @NotNull Iterator<T> iterator() {
        return array.iterator();
    }
}
