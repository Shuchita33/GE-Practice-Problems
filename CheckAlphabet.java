import java.util.Scanner;

public class CheckAlphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) != -1) {
            System.out.println(ch + " is a Vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
