package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        helloWorld();

        System.out.println(maxOfTwoNumbers(1, 2));
        System.out.println(maxOfThree(1, 2, 3));
        System.out.println(isCharacterAVowel("b"));
        System.out.println(numArgs("1", "2", "3", "4"));
        System.out.println(reverseString("Reverse this string"));
    }

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

//    Define a method, maxOfTwoNumbers(), that takes two numbers as arguments and returns the largest of them.
//    I would suggest using conditional statements. Do a Google search to figure this out if you forgot how conditionals work.

    public static int maxOfTwoNumbers(int a, int b) {
        return (a > b) ? a : b;
    }

//    Define a method, maxOfThree(), that takes three numbers as arguments and returns the largest of them.
    public static int maxOfThree(int a, int b, int c) {
        if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else {
            return a;
        }
    }

//    Write a method, isCharacterAVowel(), that takes a character (i.e., a string of length 1) and returns true if it's a vowel and false otherwise.
    public static boolean isCharacterAVowel(String a) {
        String vowels = "AEIOUaeiou";
        return vowels.contains(a);
    }

//    Write a method that returns the number of arguments passed to it when called.
    public static int numArgs(String... args) {
        return args.length;
    }
//    Define a method, reverseString(), that computes the reversal of a string. For example, reverseString("jag testar") should return the string "ratset gaj".

    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i -= 1) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
//    Bonus
//
//    Write a method, findLongestWord(), that takes an array of words and returns the length of the longest one.
//
//    Write a method, filterLongWords(), that takes an array of words and a number, i, and returns the word(s) in the array that are longer than i characters.
}


