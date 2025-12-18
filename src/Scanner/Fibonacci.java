package Scanner;

import java.util.Scanner;

public class Fibonacci {

    public void printSeries(int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        Fibonacci fib = new Fibonacci();
        fib.printSeries(n);
        sc.close();
    }
}
