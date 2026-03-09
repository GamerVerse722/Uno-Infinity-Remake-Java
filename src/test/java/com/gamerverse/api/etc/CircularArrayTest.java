package com.gamerverse.api.etc;

import com.gamerverse.engine.utils.CircularArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class CircularArrayTest {
    static CircularArrayList<Integer> list;

    @BeforeEach
    void setup() {
        list = new CircularArrayList<>();
        IntStream.range(0, 10).forEach(list::add);
    }

    @Test
    void SizeCheckReturnT() {
        Assertions.assertEquals(10, list.size());
        Assertions.assertFalse(list.isEmpty());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.getIndexOf(10));
    }

    @Test
    void ListEmptyReturnF() {
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    void ListAddLastElementTest() {
        list.add(-1);
        Assertions.assertEquals(11, list.size());
        Assertions.assertEquals(-1, list.getLast());

        list.addLast(-2);
        Assertions.assertEquals(12, list.size());
        Assertions.assertEquals(-2, list.getLast());
    }

    @Test
    void ListAddElementFirstTest() {
        list.add(-1, 0);
        Assertions.assertEquals(11, list.size());
        Assertions.assertEquals(-1, list.getFirst());

        list.addFirst(-2);
        Assertions.assertEquals(12, list.size());
        Assertions.assertEquals(-2, list.getFirst());
    }

    @Test
    void ListRemoveFirstElement() {
        list.removeFirst();
        Assertions.assertEquals(9, list.size());
        Assertions.assertEquals(1, list.getFirst());
        Assertions.assertEquals(0, list.getIndex());

        list.removeAtIndex();
        Assertions.assertEquals(8, list.size());
        Assertions.assertEquals(2, list.getFirst());
        Assertions.assertEquals(0, list.getIndex());
    }

    @Test
    void ListRemoveLastElement() {
        list.setIndex(9);
        list.removeLast();
        Assertions.assertEquals(9, list.size());
        Assertions.assertEquals(8, list.getLast());
        Assertions.assertEquals(8, list.getAtIndex());
        Assertions.assertEquals(8, list.getIndex());

        list.remove(8);
        Assertions.assertEquals(8, list.size());
        Assertions.assertEquals(7, list.getLast());
        Assertions.assertEquals(7, list.getAtIndex());
        Assertions.assertEquals(7, list.getIndex());
    }

    @Test
    void ListRemoveAllElements() {
        list.removeAll();
        Assertions.assertEquals(0, list.size());
        Assertions.assertEquals(0, list.getIndex());
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    void ListNextIndex() {
        list.next(1);
        Assertions.assertEquals(1, list.getIndex());
        Assertions.assertEquals(1, list.getAtIndex());

        list.next(9);
        Assertions.assertEquals(0, list.getIndex());
        Assertions.assertEquals(0, list.getAtIndex());

        list.next(-1);
        Assertions.assertEquals(9, list.getIndex());
        Assertions.assertEquals(9, list.getAtIndex());
    }
}
