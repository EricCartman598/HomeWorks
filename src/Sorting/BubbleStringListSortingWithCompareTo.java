package Sorting;

import java.util.Collections;
import java.util.List;

public class BubbleStringListSortingWithCompareTo implements StringListSorting {

    @Override
    public List<String> sort(List<String> strings) {

        // bubble sort
        for (int j = 0; j < strings.size() - 1; j++) {
            for (int i = 0; i < strings.size() - 1; i++) {
                if (strings.get(i).compareTo(strings.get(i + 1)) > 0) {
                    Collections.swap(strings, i, i + 1);
                }
            }
        }

        return strings;
    }


}

