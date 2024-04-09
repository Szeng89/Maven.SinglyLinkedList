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
        String str = "Zipcode";
        list.addLast(str);

        Assert.assertEquals(str, list.get(0));
    }

    @Test
    public void removeAndContainsTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Zip";
        String str2 = "Shijin";
        String str3 = "Code";

        list.addLast(str1);
        list.addLast(str2);
        list.addLast(str3);
        list.remove(1);

        Assert.assertFalse(list.contains(str2));
    }


}
