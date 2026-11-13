public class FirstNonRepeatedCharacter {
    public static void main(String[] args){

        String s = "swiss";

        // count frequency

        int[] count = new int[256];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            count[ch]++;
        }

        // find the first non repeated character

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(count[ch] == 1){
                System.out.println("First Non repeated Character : "+ch);
                break;
            }
        }
    }
}
