package io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDashaMap1 {



    @Test
    public void constructorTest(){
        DashaMap1 dm1 = new DashaMap1();
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char temp =  (char) (a+i);
            Character alpha = temp;
            Assert.assertEquals(dm1.getHashArray()[i].getKey(), alpha.toString());
        }
    }

    @Test
    public void setTest(){
        DashaMap1 dm1 = new DashaMap1();
        String expectedKey = "Bulbasaur";
        Integer expectedValue = 1;

        dm1.set(expectedKey,expectedValue);
        Assert.assertEquals(expectedValue,dm1.get(expectedKey));
    }

    @Test
    public void isEmptyTest(){
        DashaMap1 dm1 = new DashaMap1();
        String expectedKey = "Bulbasaur";
        Integer expectedValue = 1;

        dm1.set(expectedKey,expectedValue);
        Assert.assertFalse(dm1.isEmpty());
    }

    @Test
    public void bucketSizeTest(){
        DashaMap1 dm1 = new DashaMap1();
        String expectedKey = "Bulbasaur";
        Integer expectedValue = 1;

        dm1.set(expectedKey,expectedValue);

        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char temp = (char) (a + i);
            Character alpha = temp;
            if(i==1){
                Assert.assertEquals(dm1.bucketSize(alpha.toString()),1);
            }
            else{
                Assert.assertEquals(dm1.bucketSize(alpha.toString()),0);
            }
        }
    }

    @Test
    public void sizeTest(){
        DashaMap1 dm1 = new DashaMap1();
        String expectedKey = "Bulbasaur";
        Integer expectedValue = 1;

        dm1.set(expectedKey,expectedValue);
        long expectedSize = 1;
        long actualSize = dm1.size();
        Assert.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void removeTest(){
        DashaMap1 dm1 = new DashaMap1();
        String expectedKey1 = "Bulbasaur";
        Integer expectedValue1 = 1;
        String expectedKey2 = "Ivysaur";
        Integer expectedValue2 = 2;
        String expectedKey3 = "Venosaur";
        Integer expectedValue3 = 3;

        dm1.set(expectedKey1,expectedValue1);
        dm1.set(expectedKey2,expectedValue2);
        dm1.set(expectedKey3,expectedValue3);

        dm1.delete("Ivysaur");

        long expectedSize = 2;
        long actualSize = dm1.size();

        Assert.assertEquals(expectedSize,actualSize);
    }

}
