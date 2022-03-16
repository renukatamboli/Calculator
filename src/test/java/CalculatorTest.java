import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroForEmptyString() throws Exception {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void shouldReturnNumberForSingleNumberString() throws Exception {
        assertEquals(1,Calculator.add("1"));
    }

    @Test
    public void shouldReturnSumForTwoCommaSeparatedNumberString() throws Exception {
        assertEquals(3,Calculator.add("1,2"));
    }

    @Test
    public void shouldReturnSumForMultipleCommaSeparatedNumberString() throws Exception {
        assertEquals(6,Calculator.add("1,2,3"));
    }

    @Test
    public void shouldAcceptNewLineAsDelimiter() throws Exception {
        assertEquals(6,Calculator.add("1\n2,3"));
    }

    @Test
    public void shouldAcceptChangeInDelimiterAtBeginningOfString() throws Exception {
        assertEquals(3,Calculator.add("//;\n1;2"));
    }

    @Test
    public void shouldThrowExceptionIfNegativeNumbersPresentInString(){
        Throwable exception = assertThrows(Exception.class, () -> Calculator.add("-1,-2"));
        assertEquals("negatives not allowed: -1,-2",exception.getMessage());
    }
}
