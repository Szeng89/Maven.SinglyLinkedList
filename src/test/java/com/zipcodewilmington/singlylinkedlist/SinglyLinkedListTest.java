package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addFirstTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str = "zipcode";
        list.addFirst(str);

        Assert.assertEquals(str, list.get(0));
    }

    @Test
    public void addLastTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str = "zipcode";
        list.addLast(str);

        Assert.assertEquals(str, list.get(0));
    }


}
