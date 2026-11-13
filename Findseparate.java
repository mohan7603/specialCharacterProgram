// Separate alphabets, numbers and special characters

public class Findseparate {
    public static void main(String[] args) {

        String str = "Hello@123#Java!";

        String alphabets = "";
        String numbers = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                alphabets = alphabets + ch;
            }
            else if (Character.isDigit(ch)) {
                numbers = numbers + ch;
            }
            else {
                special = special + ch;
            }
        }

        System.out.println("Alphabets          : " + alphabets);
        System.out.println("Numbers            : " + numbers);
        System.out.println("Special Characters : " + special);
    }
}
