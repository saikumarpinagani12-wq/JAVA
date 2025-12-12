import java.util.Scanner;

public class vowels {
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();   

        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in \"" + str + "\": " + vowelCount);

        sc.close();
    }
}
