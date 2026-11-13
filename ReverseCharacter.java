public class ReverseCharacter {
    public static void main(String[] args){
        String s ="i love java";
        int start = 0;

        for(int i=0;i<=s.length();i++){
            // space or end of string
            if(i == s.length() || s.charAt(i) == ' '){
                // reverse the current word
                for(int j = i-1;j >= start;j--){
                    System.out.print(s.charAt(j));
                }
                // add space
                if(i != s.length()){
                    System.out.print(" ");
                }
                start = i+1;

            }
        }
    }
}
