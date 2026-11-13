public class decode{
    public static void main(String[] args){
        String s = "a3b2c1";
        int i = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);
            i++;

            int count = 0;

            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count = count * 10 + (s.charAt(i) - '0');
                i++;
            }

            for (int j = 1; j <= count; j++) {
                System.out.print(ch);
            }
        }

    }
}