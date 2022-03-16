import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroForEmptyString(){
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void shouldReturnNumberForSingleNumberString(){
        assertEquals(1,Calculator.add("1"));
    }

    @Test
    public void shouldReturnSumForTwoCommaSeparatedNumberString(){
        assertEquals(3,Calculator.add("1,2"));
    }

    @Test
    public void shouldReturnSumForMultipleCommaSeparatedNumberString(){
        assertEquals(6,Calculator.add("1,2,3"));
    }

    @Test
    public void shouldAcceptNewLineAsDelimiter(){
        assertEquals(6,Calculator.add("1\n2,3"));
    }

    @Test
    public void shouldAcceptChangeInDelimiterAtBeginningOfString(){
        assertEquals(3,Calculator.add("//;\n1;2"));
    }
}
