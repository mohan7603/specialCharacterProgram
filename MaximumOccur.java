// Find maximum Occur Special Character

public class MaximumOccur {
    public static void main(String[] args){

        String s = "Java##@@@@&&%^5678!!!";
        int max = 0;
        char maxchar = ' ';

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != ' '){
                int count = 1;
                for(int j=i+1;j<s.length();j++){
                    if(ch == s.charAt(j)){
                        count++;
                    }
                }
                if(count > max){
                    max = count;
                    maxchar = ch;
                }
            }
        }
        System.out.println("Character : "+maxchar);
        System.out.println("Count     : "+max);
    }
}
