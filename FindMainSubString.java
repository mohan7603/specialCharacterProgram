
//Implement substring search without using contains() or indexOf().

import java.util.Scanner;
public class FindMainSubString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String s = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        boolean found = false;

        for (int i = 0; i <= s.length() - sub.length(); i++) {

            int j;

            for (j = 0; j < sub.length(); j++) {

                if (s.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

            if (j == sub.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
    }
}
