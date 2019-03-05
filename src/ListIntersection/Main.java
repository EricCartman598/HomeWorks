package ListIntersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        List<String> secondList = new ArrayList<>(Arrays.asList("1", "T", "D", "A", "r"));

        ListService listService = new StringListIntercectionSecondWay();
        List<String> intersection = listService.findIntersection(firstList, secondList);

        System.out.println(intersection);
    }
}
