package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("String sort application");

        // create data
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Masha");
        dataList.add("  Masha");
        dataList.add("Masha123");
        dataList.add("Ivan");
        dataList.add("Nikolay");
        dataList.add("String Builder");
        dataList.add("Agent 007");
        System.out.println("dataList: " + dataList.toString());

        // create objects of and StringListSorting
        StringListSorting stringListSorting = new BubbleStringSortingWithoutCompareTo();

        // invoke sorting method
        List<String> sortedList = stringListSorting.sort(dataList);
        System.out.println("sortedList: " + sortedList.toString());



    }

}
