package marco.fpp1h;

import marco.ProblemOne;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemOneTest {

    @Test
    void sumForLoop() {
        var result = ProblemOne.sumForLoop(Arrays.asList(34, 35));
        assertEquals(69, result);
    }

    @Test
    void sumWhileLoop() {
        var result = ProblemOne.sumWhileLoop(Arrays.asList(1, 2));
        assertEquals(3, result);
    }

    @Test
    void sumRecursion() {
        var result = ProblemOne.sumRecursion(Arrays.asList(3, 2), 0);
        assertEquals(5, result);
    }
}
