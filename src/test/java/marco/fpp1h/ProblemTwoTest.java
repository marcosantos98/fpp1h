package marco.fpp1h;

import marco.ProblemTwo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTwoTest {

    @Test
    void combineLists() {
        var result = ProblemTwo.combineLists(Arrays.asList("a", "b", "c"), Arrays.asList(1, 2, 3));
        assertEquals(Arrays.asList("a", "1", "b", "2", "c", "3"), result);
    }
}
