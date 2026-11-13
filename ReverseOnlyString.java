// Reverse string keeping special characters in position

public class ReverseOnlyString {
    public static void main(String[] args){
        String s = "Java@hello$123!";
        char[] ch = s.toCharArray();

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(!Character.isLetterOrDigit(ch[left])){
                left++;
            }
            else if (!Character.isLetterOrDigit(ch[right])) {
                right--;
            }
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
}
