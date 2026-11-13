// Find Longest Word in String.

public class FindLongestWord {
    public static void main(String[] args){
        String s = "Java is programming language it easy to learn";
        int max = 0;
        String length = "";

        for (int i=0;i<s.length();i++){
            String word = "";
            for(int j=i;j<s.length();j++){

                if(s.charAt(j) != ' '){
                    word = word + s.charAt(j);
                }
                else {
                    break;
                }
            }

            if(word.length() > max){
                max = word.length();
                length = word;
            }
            //Already process panna word character ah skip pannum
            i = i+word.length();
        }
        System.out.println("Longest Word : "+length);
        System.out.println("Length : "+max);




    }
}
