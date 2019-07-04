package com.stackroute.PE4;

import java.util.Arrays;

public class StringSorting {
    public String sortArrayWordsAlphabetically(String string)
    {
        if(string!="") {
                    String[] result = string.split(" "); //splitting the given string by whitespace and storing into string array
                    Arrays.sort(result); //sorting the string array
                    String finalresult = String.join(" ", result);//converting string array to string
                    return finalresult; //returning final result
                }

        else
            return null;
    }
}
