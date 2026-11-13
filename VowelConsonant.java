public class VowelConsonant {
    public static void main(String[] args){
        String s = "programming";
        int Vowelcount = 0;
        int Consonantcount = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U'){
                Vowelcount++;
            }
            else{
                Consonantcount++;
            }
        }
        System.out.println("Vowel Count :"+Vowelcount);
        System.out.println("Consonant Count :"+Consonantcount);
    }
}
