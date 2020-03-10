package io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDashaMap2 {
    private DashaMap2 dm2;

    @Before
    public void init(){
        dm2 = new DashaMap2();

        String expectedKey1 = "Bulbasaur";
        Integer expectedValue1 = 1;
        String expectedKey2 = "Ivysaur";
        Integer expectedValue2 = 2;
        String expectedKey3 = "Venosaur";
        Integer expectedValue3 = 3;

        dm2.set(expectedKey1,expectedValue1);
        dm2.set(expectedKey2,expectedValue2);
        dm2.set(expectedKey3,expectedValue3);
    }

    @Test
    public void constructorTest(){
        dm2 = new DashaMap2();
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char temp =  (char) (a+i);
            Character alpha = temp;
            Assert.assertEquals(dm2.getHashArray()[i].getKey(), alpha.toString());
        }
    }

    @Test
    public void setTest(){
        dm2 = new DashaMap2();
        String expectedKey = "Squirtle";
        Integer expectedValue = 4;

        dm2.set(expectedKey,expectedValue);
        Assert.assertEquals(expectedValue,dm2.get(expectedKey));
    }
}
