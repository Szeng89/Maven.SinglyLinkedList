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
        String str2 = "Hello";
        list.addFirst(str);
        Assert.assertEquals(str, list.get(0));

        list.addLast(str2);
        Assert.assertEquals(str, list.get(0));




    }

    @Test
    public void addLastAndGetTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str = "Zipcode";
        String str2 = "Hello";
        list.addLast(str);
        list.addFirst(str2);

        Assert.assertEquals(str, list.get(1));
        Assert.assertEquals(str2, list.get(0));
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

    @Test
    public void findTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Zip";
        String str2 = "Shijin";
        String str3 = "Code";

        list.addLast(str1);
        list.addLast(str2);
        list.addLast(str3);

        Assert.assertEquals(2, list.find(str2));
    }

    @Test
    public void sizeTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Zip";
        String str2 = "Shijin";
        String str3 = "Code";

        list.addFirst(str1);
        list.addFirst(str2);
        list.addFirst(str3);

        Assert.assertEquals(3, list.size());
    }

    @Test
    public void copyTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        String str1 = "Zip";
        String str2 = "Shijin";
        String str3 = "Code";

        list.add(str1);
        list.add(str2);
        list.add(str3);

        SinglyLinkedList<String> copied = list.copy();

        Assert.assertEquals("Code", copied.get(2));
        Assert.assertEquals(str2, copied.get(1));
        Assert.assertEquals(list.get(2), copied.get(2));

    }


}
