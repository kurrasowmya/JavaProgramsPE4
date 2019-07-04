package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamePresenceTest {
    NamePresence obj;

    @Before
    public void setUp() throws Exception {
        obj=new NamePresence();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    //Test case for true case
    @Test
    public void givenStringIsCheckedforThenameAndIfNamePresentReturnsTrue()
    {
        String result=obj.UsematcherTocountStringOccurance("This is Harry","Harry");
        assertEquals("Is Harry here?true",result);
    }
    //Test case for false case
    @Test
    public void givenStringIsCheckedFornameAndNamenotpresentReturnfalse()
    {
        String result=obj.UsematcherTocountStringOccurance("This is Henry","Harry");
        assertEquals("Is Harry here?false",result);
    }
    //Test case for empty string
    @Test
    public void givenEmptyStringIsCheckedFornameAndNamenotpresentReturnfalse()
    {
        String result=obj.UsematcherTocountStringOccurance("","Harry");
        assertNotEquals("Is Harry here?false",result);
    }
    //Test case for notnull assert
    @Test
    public void givenStringIsCheckednotnullContainingnameAndNamenotpresentReturnfalse()
    {
        String result=obj.UsematcherTocountStringOccurance("This is Harry","Harry");
        assertNotNull(result);
    }

}