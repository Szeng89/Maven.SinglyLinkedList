package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str = "zipcode";
        list.add(str);

        Assert.assertEquals(str, list.getClass(0));
    }

}
