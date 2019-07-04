package com.stackroute.PE4;

public class StringTranspose {
    public String transposeofString(String original)
    {
        //Initialize two empty string
        String transpose="",reverse="";
        //split the string by space
        String[] result=original.split(" ");
        if(original!="") {
            //take a loop of array
            for (int i = 0; i < result.length; i++) {
                String s = result[i];
                //take a loop to iterate the each array elelment
                for (int j = result[i].length() - 1; j >= 0; j--) {
                    reverse = reverse + s.charAt(j);
                }
                if (i < result.length - 1) {
                    transpose = transpose + reverse + " ";
                }
                if (i == result.length - 1) {
                    transpose = transpose + reverse;
                }
                reverse = "";
            }
            return transpose;
        }
        else
            return null;
    }
}
