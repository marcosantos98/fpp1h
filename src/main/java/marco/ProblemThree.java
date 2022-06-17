package marco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemThree {

    public static List<Integer> calcFibonacci(int amount) {
        var result = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; i < amount; i++) {
            result.add(result.get(i - 2) + result.get(i - 1));
        }
        return result;
    }
}
