import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of flips: ");
        int flips = sc.nextInt();
        if (flips <= 0) {
            System.out.println("Enter a +ve number.");
            return;
        }

        int heads = 0;
        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5) heads++;
        }

        System.out.println("Heads: " + (heads * 100.0 / flips) + "%");
        System.out.println("Tails: " + ((flips - heads) * 100.0 / flips) + "%");
    }
}
