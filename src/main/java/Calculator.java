public class Calculator {
    public static int add(String numberString){
        if(numberString.isEmpty()) {
            return 0;
        }
        else{
            if(numberString.contains(",")){
                String[] numbers = numberString.split(",");
                return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            }
            return Integer.parseInt(numberString);
        }
    }
}
