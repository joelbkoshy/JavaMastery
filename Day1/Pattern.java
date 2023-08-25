package Day1;

import java.util.Scanner;

public class Pattern {
    public static void main(String args[]) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
