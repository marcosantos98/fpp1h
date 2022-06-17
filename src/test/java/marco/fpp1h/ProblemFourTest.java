package marco.fpp1h;

import marco.ProblemFour;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemFourTest {

    @Test
    void getLargestNumber() {
        var result = ProblemFour.getLargestNumber(Arrays.asList(50, 2, 1, 9));
        assertEquals(95021, result);
    }
}
