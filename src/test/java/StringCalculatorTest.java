import org.incubyte.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    public void returnSum_WhenTwoCommaSeparatedNosPassed() {
        assertEquals(3,stringCalculator.calculate("1,2"));
    }

    @Test
    public void returnSum_WhenMoreThanTwoNosArePassed() {
        assertEquals(6, stringCalculator.calculate("1,2,3"));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3:6","'1\n2\n3':6"}, delimiter = ':')
    public void returnSum_WhenCommaOrSlashNUsedAsDelimiter(String input, int expectedResult) {
        assertEquals(expectedResult, stringCalculator.calculate(input));
    }

}
