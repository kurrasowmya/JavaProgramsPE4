package com.stackroute.PE4;

public class CharacterReplace {
    public String replaceCharacterinString(String string)
    {
        //Check whether string contains data
        if(string!="") {
            //Replace d with f
            String replaceString = string.replace('d', 'f');
            //Replace i with t
            String result = replaceString.replace('i', 't');
            return result;
        }
        else
            return null;
    }
}
