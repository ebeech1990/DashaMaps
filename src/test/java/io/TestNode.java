package io;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNode {
    private Node node;
    @Before
    public void init(){
        String key = "";
        Integer value = 1;
        node = new Node(key, value, null);
    }

    @Test
    public void constructorTest(){
        String expectedKey = "";
        Integer expectedValue = 1;

        Assert.assertEquals(expectedKey, node.getKey());
        Assert.assertEquals(expectedValue, node.getValue());
        Assert.assertEquals(null, node.getNext());
    }

    @Test
    public void setKeyTest(){
        node.setKey("x");
        String expectedKey = "x";
        Assert.assertEquals(expectedKey, node.getKey());
    }
    @Test
    public void setValueTest(){
        node.setValue(5);
        Integer expectedValue = 5;
        Assert.assertEquals(expectedValue, node.getValue());
    }
    @Test
    public void setNodeTest(){
        Node next = new Node(null, null, null);
        node.setNext(next);
        Assert.assertEquals(next, node.getNext());
    }


    @After
    public void done(){
        String key = "";
        Integer value = 1;
        node = new Node(key, value, null);
    }

}
