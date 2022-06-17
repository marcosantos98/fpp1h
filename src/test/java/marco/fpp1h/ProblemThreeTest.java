package marco.fpp1h;

import marco.ProblemThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemThreeTest {

    @Test
    void calcFibonacci() {
        var result = ProblemThree.calcFibonacci(10);
        assertTrue(result.size() == 10 && result.get(0) == 0 && result.get(1) == 1);
        for (int i = 2; i < result.size(); i++) {
            assertEquals(result.get(i), result.get(i - 2) + result.get(i - 1));
        }
    }
}