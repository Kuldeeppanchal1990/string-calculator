import org.incubyte.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void before() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void returnZero_WhenZeroIsPassed() {
        assertEquals(0,stringCalculator.calculate("0"));
    }

    @Test
    public void returnOne_WhenOneIsPassed() {
        assertEquals(1, stringCalculator.calculate("1"));
    }
}
