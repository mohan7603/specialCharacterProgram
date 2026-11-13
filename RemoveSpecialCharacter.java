// Remove Special Character in String

public class RemoveSpecialCharacter {
    public static void main(String[] args){
        String s = "java@$%hello&@123!";
        String result = "";

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
