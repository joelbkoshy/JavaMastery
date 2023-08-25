package Day1;

import java.util.*;

public class String1 {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        s = sc.nextLine();
        sc.close();
        System.out.println("The inputed string is " + s);
    }
}
