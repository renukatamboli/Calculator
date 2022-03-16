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
    public void shouldReturnSumForCommaSeparatedNumberString(){
        assertEquals(3,Calculator.add("1,2"));
    }
}
