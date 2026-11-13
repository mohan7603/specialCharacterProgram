// Check whether a string contains only alphabets.

public class StringContainOnlyAlhabet {
    public static void main(String[] args) {

        String str = "Hello@Java";
        boolean found = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetter(ch)) {
                found = false;
                break;
            }
        }

        if (found) {
            System.out.println("Only Alphabets");
        } else {
            System.out.println("Not Only Alphabets");
        }
    }
}
