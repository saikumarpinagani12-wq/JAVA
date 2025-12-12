public class ArithmeticErrorexception {
    public static void main(String[] args) {
        try {
            int numerator = 50;
            int denominator = 0; // This will cause ArithmeticException
            int divisionResult = numerator / denominator;

            System.out.println("Division Result: " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
    
}
