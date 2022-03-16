import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    public static int add(String numberString){
        if(numberString.isEmpty()) {
            return 0;
        }
        else{
            if(numberString.contains(",")){
                String[] tokens = numberString.split(",");
                List<Integer> numbers = Arrays.stream(tokens).map(token -> getInt(token)).collect(Collectors.toList());
                return numbers.stream().reduce(0,(num1,num2)-> num1+num2);
            }
            return getInt(numberString);
        }
    }

    private static int getInt(String number) {
        return Integer.parseInt(number);
    }
}
