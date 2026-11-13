// Find the length of a string without using length().

public class Length {
    public static void main(String[] args){
        String s = "programming";

        int count = 0;

        for(char ch : s.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
