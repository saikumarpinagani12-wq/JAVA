public class basictrycatch {
    public static void main(String[] args) {
        try {
            int a = 10;     // sample values
            int b = 0;      // this will cause ArithmeticException
            int result = a / b;

            System.out.println("Result is: " + result);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
