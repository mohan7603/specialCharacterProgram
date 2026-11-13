public class SpecialAnagram {
    public static void main(String[] args) {

        String s1 = "listen@";
        String s2 = "silent!";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        boolean found = true;

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (!Character.isLetterOrDigit(ch))
                continue;

            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch)
                    count1++;

                if (s2.charAt(j) == ch)
                    count2++;
            }

            if (count1 != count2) {
                found = false;
                break;
            }
        }
        if (found == true) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
