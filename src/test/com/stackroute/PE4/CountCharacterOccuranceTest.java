package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharacterOccuranceTest {
    CountCharacterOccurance obj;
    @Before
    public void setUp() throws Exception {
        obj=new CountCharacterOccurance();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;

    }
    //Test case for correct input
    @Test
    public void givenStringIsCheckedForCharacterAndOccuranceOfThatCharacterIsReturned()
    {
        int result=obj.occuranceOfCharacter("Java is a programming language",'a');
        assertEquals(6,result);
    }
    //Test case for null string
    @Test
    public void givenEmptyStringIsCheckedForCharacterAndOccuranceOfThatCharacterIsReturned()
    {
        int result=obj.occuranceOfCharacter("",'a');
        assertNotEquals(6,result);
    }
    //Test case for giving special char in character which is not present
    @Test
    public void givenEmptyStringIsCheckedForSpecialCharacterAndOccuranceOfThatCharacterIsReturned()
    {
        int result=obj.occuranceOfCharacter("Hello",'@');
        assertEquals(0,result);
    }
    //Teat case for checking nothing
    @Test
    public void givenEmptyStringIsCheckedThatPassedWithNoCharacterAndZeroIsReturned()
    {
        int result=obj.occuranceOfCharacter("Hello world",' ');
        assertNotEquals(0,result);
    }
}