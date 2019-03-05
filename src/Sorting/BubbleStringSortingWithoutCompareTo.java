package Sorting;

import java.util.Collections;
import java.util.List;

public class BubbleStringSortingWithoutCompareTo implements StringListSorting {
    @Override
    public List<String> sort(List<String> strings) {
        // bubble sort
        for (int j = 0; j < strings.size() - 1; j++) {
            for (int i = 0; i < strings.size() - 1; i++) {
                if (stringsCompare(strings.get(i), strings.get(i + 1)) > 0) {
                    Collections.swap(strings, i, i + 1);
                }
            }
        }

        return strings;
    }

    private int stringsCompare(String firstStr, String secondStr) {
        int leastLength;
        int firstStrLength = firstStr.length();
        int secondStrLength = secondStr.length();

        // if strings are equals return 0
        if(firstStr.equals(secondStr))
            return 0;

        // find the least length of two strings
        if(firstStrLength > secondStrLength)
            leastLength = secondStr.length();
        else
            leastLength = firstStrLength;

        // compare each symbol of each string
        for(int i = 0; i < leastLength; i++) {
            if (firstStr.charAt(i) > secondStr.charAt(i))
                return 1;
            else if (firstStr.charAt(i) < secondStr.charAt(i))
                return -1;
        }

        /*
        if we have approached to end of string and they are not equals
        so we have to compare their lengths
         */
        if (firstStrLength > secondStrLength)
            return 1;
        else
            return -1;
    }

}
