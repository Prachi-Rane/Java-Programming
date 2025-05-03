//Program to display prime numbers
import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int n, i, j, count;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display prime numbers up to that limit:");
        n = sc.nextInt();

        for (i = 2; i <= n; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
