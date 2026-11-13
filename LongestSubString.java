import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        int max = 0;
        String longest ="";

        for(int i =0;i<s.length();i++){
            String sub = "";
            for (int j =i;j<s.length();j++){
                char ch = s.charAt(j);
                if(sub.indexOf(ch) != -1){
                    break;
                }
                sub = sub + ch;
                if(sub.length() > max){
                    max = sub.length();
                    longest = sub;
                }
            }
        }
        System.out.println("Longest SubString : "+max+","+longest);

    }
}
