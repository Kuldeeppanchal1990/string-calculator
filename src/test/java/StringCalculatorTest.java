import org.incubyte.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void returnZero_WhenZeroIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.calculate("0");
        assertEquals(0,result);
    }
}
