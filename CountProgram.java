// Compress a string using character counts. Example: aaabbc → a3b2c1.

public class CountProgram{
    public static void main(String[] args){
        String s = "aaabbc";

        int i=0;
        while(i < s.length()){
            int count = 1;

            while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }

            System.out.print(s.charAt(i));
            System.out.print(count);

            i++;
        }
    }
}
