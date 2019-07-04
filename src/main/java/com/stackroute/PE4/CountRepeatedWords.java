package com.stackroute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountRepeatedWords {
    public String UsematcherTocountStringOccurance(String input, String word) {
        String result = "";
        if(input!=""&&word!="") {
            // Create a pattern to be searched
            Pattern pattern = Pattern.compile(word);

            Matcher matcher = pattern.matcher(input);

            // Print starting and ending indexes of the pattern
            while (matcher.find())
                result = result + "Found at " + matcher.start() + "-" + (matcher.end());

            return result;
        }
        else
            return null;
    }
}
