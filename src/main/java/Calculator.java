import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    public static int add(String numberString){
        if (numberString.isEmpty()) {
            return 0;
        }
        List<Integer> numbers = getNumbers(numberString);
        return getSum(numbers);
    }

    private static Integer getSum(List<Integer> numbers) {
        return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
    }

    private static List<Integer> getNumbers(String numberString){
        String[] tokens = getTokens(numberString);
        List<Integer> numbers = Arrays.stream(tokens).map(token -> getInt(token)).collect(Collectors.toList());
        return numbers;
    }

    private static String[] getTokens(String numberString) {
        if(isChangeInDelimiter(numberString)) {
            String delimiter = String.valueOf(numberString.charAt(2));
            return numberString.substring(4).split(delimiter);
        }
        return numberString.split("[,\n]");
    }

    private static boolean isChangeInDelimiter(String numberString) {
        return numberString.startsWith("//") && numberString.substring(0, 4).matches("//(.)\n");
    }

    private static int getInt(String number) {
        return Integer.parseInt(number);
    }
}
