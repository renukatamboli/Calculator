public class Calculator {
    public static int add(String numberString){
        if(numberString.isEmpty()) {
            return 0;
        }
        else{
            if(numberString.contains(",")){
                String[] numbers = numberString.split(",");
                return getInt(numbers[0]) + getInt(numbers[1]);
            }
            return getInt(numberString);
        }
    }

    private static int getInt(String number) {
        return Integer.parseInt(number);
    }
}
