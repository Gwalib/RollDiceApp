package com.example.rolldice;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void gen_num()
    {
        Random rndObject = new Random();
        int myRandomNumber= rndObject.nextInt(6);
        if(myRandomNumber<1 && myRandomNumber>6)
            System.out.println("test failed, out of bound");
        else System.out.println("within range");
    }
}