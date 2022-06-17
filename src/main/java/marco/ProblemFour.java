package marco;

import java.util.List;

public class ProblemFour {

    public static int getLargestNumber(List<Integer> integers) {
        integers.sort((o1, o2) -> String.valueOf(o2).compareTo(String.valueOf(o1)));

        String value = "";
        for (var integer : integers) {
            value = value.concat(String.valueOf(integer));
        }

        return Integer.parseInt(value);
    }
}
