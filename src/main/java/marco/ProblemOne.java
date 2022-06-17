package marco;

import java.util.List;

public class ProblemOne {

    public static int sumForLoop(List<Integer> numbers) {
        int sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int sumWhileLoop(List<Integer> numbers) {
        int sum = 0;
        int index = 0;
        while (index < numbers.size()) {
            sum += numbers.get(index);
            index++;
        }
        return sum;
    }

    public static int sumRecursion(List<Integer> numbers, int index) {
        if (index < numbers.size()) return numbers.get(index) + sumRecursion(numbers, index + 1);
        return 0;
    }
}
