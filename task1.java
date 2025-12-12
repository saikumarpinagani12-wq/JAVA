import java.util.Scanner;

public class task1 {

    public static String removeVowels(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) == -1) {
                result.append(str.charAt(i)); 
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String withoutVowels = removeVowels(str);

        String finalString = withoutVowels.replace(' ', '.');

        System.out.println("result: " + finalString);

        sc.close();
    }
}
