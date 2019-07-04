package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountRepeatedWordsTest {
    CountRepeatedWords obj;

    @Before
    public void setUp() throws Exception {
        obj=new CountRepeatedWords();
    }
    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    //Test case for having single occurance
    @Test
    public void givenStringIsCheckedForsubstringAndOccuranceOfThatSubStringindexIsReturned()
    {
        String result=obj.useMatcherTocountStringOccurance("Java is a programming language","la");
        assertEquals("Found at 22-24",result);
    }
    //Test case for having multiple occurance
    @Test
    public void givenStringIsCheckedForSubStringHavingMultipleOccuranceAndOccuranceOfThatSubStringIsReturned()
    {
        String result=obj.useMatcherTocountStringOccurance("She sells seashells by the seashore","se");
        assertEquals("Found at 4-6Found at 10-12Found at 27-29",result);
    }
    //Test case for not having the word
    @Test
    public void givenStringIsCheckedForsubstringThatIsAbsentAndOccuranceIsReturned()
    {
        String result=obj.useMatcherTocountStringOccurance("She sells seashells by the seashore","hi");
        assertNotEquals("Found at",result);
    }
    //Test case for null string
    @Test
    public void givenNullStringIsCheckedForSubStringAndNullIsReturned()
    {
        String result=obj.useMatcherTocountStringOccurance("","se");
        assertEquals(null,result);
    }

}