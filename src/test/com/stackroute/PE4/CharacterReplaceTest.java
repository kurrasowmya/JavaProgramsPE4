package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplaceTest {
    //Initialize a object
    CharacterReplace obj;
    @Before
    public void setUp() throws Exception {
        obj=new CharacterReplace();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    //Test case for string containing replacements chharacters
    @Test
    public void givenStringContainingdtIsCheckedForCharacterAndreplaceswithNewCharAndNewStringIsReturned()
    {
        String result=obj.replaceCharacterinString("Java is a programming language");
        assertEquals("Java ts a programmtng language",result);
    }
    //Test case for string not containing replacement characters
    @Test
    public void givenStringNotContainingTheReplacementCharactersIsCheckedAndReturnsTheOriginalString() {
        String result = obj.replaceCharacterinString("Java language");
        assertNotNull(result);
    }
    //Test case for null string
    @Test
    public void givenNullStringIsCheckedForCharacterAndReturnsNull() {
        String result = obj.replaceCharacterinString("");
        assertEquals(null, result);
    }
}