package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePresence {
    public String UsematcherTocountStringOccurance(String input, String word) {
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile(word);

        Matcher matcher = pattern.matcher(input);
        if(input!="") {
            // Print starting and ending indexes of the pattern
            while (matcher.find())
                return "Is " + word + " " + "here?true";

            return "Is " + word + " " + "here?false";
        }
        else
            return null;
    }
}
