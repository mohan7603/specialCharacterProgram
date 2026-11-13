// Remove duplicate special characters

public class RemoveDuplicate {
    public static void main(String[] args){
        String s = "Hello@@@@java#$%^World!!!";
        String result = "";

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result = result + ch;
            }
            else if (result.indexOf(ch) == -1){
                result = result + ch;

            }
        }
        System.out.println(result);
    }
}
