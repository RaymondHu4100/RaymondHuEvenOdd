package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "abcdefg";
        {
            int indexo = 1;
            int indexe = 0;
            String oddCharacters = "";
            String evenCharacters = "";
            while (indexo < input.length())
            {
                oddCharacters = oddCharacters + input.substring(indexo, indexo+1);
                indexo = indexo + 2;
            }
            while (indexe < input.length())
            {
                evenCharacters = evenCharacters + input.substring(indexe, indexe+1);
                indexe = indexe + 2;
            }
            String evenFirstOddLast = evenCharacters + oddCharacters;
            System.out.println("input = "+input);
            System.out.println("oddCharacters = "+oddCharacters);
            System.out.println("evenCharacters = "+evenCharacters);
            System.out.println("evenFirstOddSecond = "+evenFirstOddLast);
        }
    }
}
