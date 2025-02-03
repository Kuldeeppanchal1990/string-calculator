import org.incubyte.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void returnZero_WhenZeroIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.calculate("0");
        Assertions.assertEquals(0,result);
    }
}
