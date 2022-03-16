public class Calculator {
    public static int add(String numberString){
        if(numberString.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(numberString);
    }
}
