import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroForEmptyString(){
        assertEquals(0, Calculator.add(""));
    }
}