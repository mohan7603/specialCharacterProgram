// Frequency of Special character.

public class FrequencySpecialCharacter {
    public static void main(String[] args){
        String s = "java@@&*#hello$*)123!@";

        boolean[] visit = new boolean[s.length()];

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch) || ch == ' ' || visit[i]){
                continue;
            }
            int count =1;
            for (int j = i+1;j<s.length();j++){
                if(ch == s.charAt(j)){
                    count++;
                    visit[j] = true;
                }
            }
            System.out.println(ch +" : "+count);
        }
    }
}
