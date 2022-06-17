package marco;

import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {

    public static List<String> combineLists(List<String> a, List<Integer> b) {
        var result = new ArrayList<String>();
        for (int i = 0; i < a.size(); i++) {
            result.add(a.get(i));
            result.add(String.valueOf(b.get(i)));
        }
        return result;
    }
}
