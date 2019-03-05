package ListIntersection;

import java.util.ArrayList;
import java.util.List;

public class StringListIntersectionFirstWay implements ListService {

    @Override
    public List<String> findIntersection(List<String> firstList, List<String> secondList) {
        List<String> intersection = new ArrayList<>();

        for(String string : firstList) {
            if(secondList.contains(string))
                intersection.add(string);
        }

        return intersection;
    }
}
