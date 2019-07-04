package com.stackroute.PE4;

public class CountCharacterOccurance {
    public int occuranceOfCharacter(String string,char charactertocheck)
    {
        //Initialize and set count to zero
        int count=0;
        //calculate the length of string
        int length=string.length();
        if(string!=null&&charactertocheck!=0) {
            //Iterate the string and if character found increment count
            for (int i = 0; i < length; i++) {
                if (charactertocheck == string.charAt(i))
                    count++;

            }
            return count;
        }
        else
            return 0;
    }
}
