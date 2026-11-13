// replace special Character with space.

public class ReplaceSpecialCharacterWithSpace {
    public static void main(String[] args){
        String s = "Hello@java#Language!";
        String result = "";
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result = result +ch;
            }
            else{
                result = result + " ";
            }
        }
        System.out.println("Original String : "+s);
        System.out.println("Revome Special Character : "+result);
    }
}
