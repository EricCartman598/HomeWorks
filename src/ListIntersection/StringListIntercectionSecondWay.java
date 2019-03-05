package ListIntersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringListIntercectionSecondWay implements ListService {
    @Override
    public List<String> findIntersection(List<String> firstList, List<String> secondList) {
        List<String> intersection = new ArrayList<>();
        Set<String> set = new HashSet<>(firstList);
        for (String string : secondList) {
            if (!set.add(string))
                intersection.add(string);
        }

        return intersection;
    }
}
