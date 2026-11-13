public class SecondLongestWord {
    public static void main(String[] args){
        String s = "Java is programming language it easy to learn";
        String first ="";
        String Second = "";
        String word = "";

        for (int i=0;i<s.length();i++){
            if(i < s.length() && s.charAt(i) != ' '){
                word = word + s.charAt(i);
            }
            else{
                if(word.length() > first.length()){
                    Second = first;
                    first = word;
                }
                else if (word.length() > Second.length() && ! word.equals(first)) {
                    Second = word;
                }
                word = "";
            }
        }
        System.out.println("Second Longest Word : "+Second);
        System.out.println("Length : "+Second.length());
    }
}
