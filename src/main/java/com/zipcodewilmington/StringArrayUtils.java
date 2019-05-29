package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {


        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */

    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        for (int i = 0; i <array.length ; i++) {
            if (array[i].equals(value)) {
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseString = new String[array.length];
        int counter = array.length -1;


        for (int i = 0; i < array.length ; i++) {
            reverseString[i] = array[counter];
            counter --;
        }
        return reverseString;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean sameArray = true;
        String [] newArray = reverse(array);
        for (int i = 0; i < array.length ; i++) {
            if (array[i].equals(newArray[i])) {
                sameArray = true;

            } else {
                sameArray =false;
                break;
            }

        }
        return sameArray;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        ArrayList<String> alphabet = new ArrayList<String>();///make an array list
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            String[] letterArr = array[i].replaceAll("\\s","").split("");

            for (int j = 0; j < letterArr.length ; j++) {
                    String letter = letterArr[j];
                if (!alphabet.contains(letter.toLowerCase())){
                    alphabet.add(letter.toLowerCase());
                }
            }
        }
       
        if ((alphabet.size()) == 26) {
            return true;
        }else {
            return false;
        }
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i].contains(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArr = new String[array.length-1];
        int counter = 0;
        for (int i = 0; i <array.length ; i++) {
            if(!array[i].equals(valueToRemove)) {
            newArr[counter] = array[i];
            counter++;
            }
        }
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> newArr = new ArrayList<String>();

        for (int i = 0; i < array.length - 1; i++) {
            if(!array[i].equals(array[i + 1])){
                newArr.add(array[i]);
            }
        }
        newArr.add(array[array.length -1]);

        String[] stringArr = newArr.toArray(new String[newArr.size()]);

        return  stringArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
            String output = "";
        for (int i = 1; i < array.length; i++) {
            if(array[i].equals(array[i - 1])){
                output += array[i -1];
            }else   {
                output +=  array[i -1] + " ";
            }
//            if (array[array.length -1].equals(array[array.length -2])) {
//                output += array[array.length -1];
//            } else {
//                output += array[array.length -1] + " ";
//            }
        }

        output += array[array.length-1];
        String [] arr = output.split(" ");


        return  arr;
    }
}
