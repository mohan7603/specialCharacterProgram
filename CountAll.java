// Count uppercase letters, lowercase letters, digits, and special characters.

public class CountAll {
    public static void main(String[] args){
        String s = "AbcDEF@123,Zxcv";

        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int special = 0;

        for(int i =0;i<s.length();i++){

            char ch  = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                uppercase++;
            }
            else if (ch >= 'a' &&  ch <= 'z') {
                lowercase++;
            }
            else if (ch >= '0' && ch <= '9') {
                digit++;
            }
            else {
                special++;
            }
        }
        System.out.println("UpperCase COunt         : "+uppercase);
        System.out.println("LowerCase Count         : "+lowercase);
        System.out.println("Digits Count            : "+digit);
        System.out.println("Special Character Count : "+special);
    }
}
