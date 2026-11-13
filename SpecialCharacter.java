// Only Print Special Character.

public class SpecialCharacter {
    public static void main(String[] args){
        String s = "hello@java#123!";

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != ' '){
                System.out.print(ch+" ");
            }
        }
    }
}
