package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortingTest {
    StringSorting obj;
    @Before
    public void setUp() throws Exception {
        obj=new StringSorting();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    //Test case for correct input
    @Test
    public void givenStringShouldBeSortedAlphabeticallyAndPrintSortedString()
    {
        //Add
        String result= obj.SortarrayWordsAlphabetically("Asha went to bahar");
        //Assert
        assertEquals("Asha bahar to went",result);

    }
    //Test case for uppercase characters
    @Test
    public void givenStringInUppercaseShouldBeSortedAndPrintsSortedString()
    {
        //Add
        String result= obj.SortarrayWordsAlphabetically("A D C B");
        //Assert
        assertEquals("A B C D",result);

    }
    //Test case for null string
    @Test
    public void givennullStringShouldBeTakenAndPrintsnull()
    {
        //Add
        String result= obj.SortarrayWordsAlphabetically("");
        //Assert
        assertNotEquals("A B",result);

    }
}
