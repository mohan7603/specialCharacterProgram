public class PalindromeString {
    public static void main(String[] args){
        String s = "madam";
        String result ="";

        for(int i = s.length()-1;i>=0;i--){
            result = result + s.charAt(i);
        }
        if(s.equals(result)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
