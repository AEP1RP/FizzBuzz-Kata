package com.example.s285822.aepjc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private FizzBuzzCalculator subject;

    private void stubSubject(){
        subject = new FizzBuzzCalculator();
    }

    @Before
    public void stubbing(){
        stubSubject();
    }

    @Test
    public void whenIsValidInputAndModule3EqualToZeroThenReturnFizz(){
        assertEquals("fizz", subject.checkFizzBuzz(3));
    }

    @Test
    public void whenIsValidInputAndModule5EqualToZeroThenReturnBuzz(){
        assertEquals("buzz", subject.checkFizzBuzz(5));
    }

    @Test
    public void whenIsValidInputAndModule5EqualToZeroAndModule3EqualToZeroThenReturnFizzBuzz(){
        assertEquals("fizzbuzz", subject.checkFizzBuzz(15));
    }

}