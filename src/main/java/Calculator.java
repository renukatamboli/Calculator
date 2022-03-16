import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    public static int add(String numberString) {
        if (numberString.isEmpty()) {
            return 0;
        }
        List<Integer> numbers = getNumbers(numberString);
        return getSum(numbers);
    }

    private static Integer getSum(List<Integer> numbers) {
        return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
    }

    private static List<Integer> getNumbers(String numberString) {
        String[] tokens = numberString.split("[,\n]");
        List<Integer> numbers = Arrays.stream(tokens).map(token -> getInt(token)).collect(Collectors.toList());
        return numbers;
    }

    private static int getInt(String number) {
        return Integer.parseInt(number);
    }
}
