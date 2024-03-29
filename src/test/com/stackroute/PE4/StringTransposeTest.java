package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose obj;
    @Before
    public void setUp() throws Exception {
        obj=new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    //Test case for correct input
    @Test
    public void givenStringShouldBetransposedAndPrinttransposedString()
    {
        //Add
        String result= obj.transposeofString("Hi pooja");
        //Assert
        assertEquals("iH ajoop",result);

    }
    //Test case for para
    @Test
    public void givenParaStringShouldBeTransposedAndPrintsTransposedString()
    {
        //Add
        String result= obj.transposeofString("Hi pooja this is swathi I am here to tell you the schedule for today");
        //Assert
        assertNotNull(result);

    }
    //Test case for null string
    @Test
    public void givenNullStringShouldBeCheckedAndPrintsnull()
    {
        //Add
        String result= obj.transposeofString("");
        //Assert
        assertNotEquals("iH",result);

    }

}