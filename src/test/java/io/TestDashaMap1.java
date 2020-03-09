package io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDashaMap1 {
 private DashaMap1 dm1 = new DashaMap1();


    @Test
    public void constructorTest(){
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char temp =  (char) (a+i);
            Character alpha = temp;
            Assert.assertEquals(dm1.getHashArray()[i].getKey(), alpha.toString());
        }
    }

    @Test
    public void setTest(){
        String expectedKey = "Bulbasaur";
        String expectedValue = "1";

        dm1.set(expectedKey,expectedValue);
        Assert.assertEquals(expectedValue,dm1.get(expectedKey));
    }

    @Test
    public void isEmptyTest(){
        String expectedKey = "Bulbasaur";
        String expectedValue = "1";

        dm1.set(expectedKey,expectedValue);
        Assert.assertFalse(dm1.isEmpty());
    }

}
