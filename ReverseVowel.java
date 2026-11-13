// Reverse Only Vowels Character.

public class ReverseVowel {
    public static void main(String[] args){
        String s = "kingdom";
        char[] ch = s.toCharArray();
        String vowel ="";

        // Store Vowel

        for(int i=0;i<ch.length;i++){
            if("aeiouAEIOU".indexOf(ch[i]) != -1 ){
                vowel = ch[i] + vowel;
            }
        }
        // Replace the Vowels
        int j=0;
        for(int i=0;i<ch.length;i++){
            if("AEIOUaeiou".indexOf(ch[i])!= -1){
                ch[i] = vowel.charAt(j);
                j++;
            }
        }
        System.out.println("original String : "+s);
        System.out.print("Reverse String Vowels : ");
        System.out.println(new String(ch));
    }
}
