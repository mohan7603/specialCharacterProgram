// Moves special character at end.

public class MoveEnd {
    public static void main(String[] args){
        String s = "He#ll%0@!java";

        String normal = "";
        String special = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                normal = normal + ch;
            }
            else {
                special = special + ch;
            }
        }
        System.out.println("Original String : "+s);
        System.out.println("Move Special Character end : "+special+normal);

    }
}
