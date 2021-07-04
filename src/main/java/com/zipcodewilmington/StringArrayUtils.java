package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String firstElement = array[0];

        return firstElement;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String secondElement = array[1];

        return secondElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String lastElement = array[array.length-1];

        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String  secondLast = array[array.length-2];

        return secondLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean b = false;

        for (int i = 0; i < array.length; i++) {

            if (value == array[i]) {
                b = true;
            }
        }
        return b;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] arr = new String[] {};

        for (int i = arr.length-1; i >= 0; i--){

        }
        return arr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean b = false;
       String[] reverseArray = reverse(array);
        for (int i = 0; i < reverseArray.length ; i++) {
            String currentArray = reverseArray[i];
            String currentReverseElement = array[i];
            boolean sameValue = currentArray.equals(currentReverseElement);
            if(!sameValue){
                b = false;

            }

        }
        return b;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        if (array.length < 26)
            return false;
        else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (array.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        String a[] = value.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (array.equals(a[i])){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        for (int i = 0; i <= array.length; i++) {
            array[i] = array[i + 1];
        }
        return array;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {


                }
            }
        }
            return array;
    }










      /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i+1]){
                count++;
            }
        }
        String[] str = new String[count];
        int index = 0;
        String s = "";
        s += array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[i++]){
                s += array[i-1];
            }else if(array[i] != array[i-1]){
                str[index] = s;
                s = array[i];
                index++;
            }

        }

        return s;
    }


}
