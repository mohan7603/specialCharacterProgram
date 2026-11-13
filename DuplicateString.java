public class DuplicateString {
    public static void main(String[] args){
        String str = "programming";

        for(int i=0;i<str.length();i++){
            boolean Isfound = false;
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    Isfound = true;
                    break;
                }
            }
            if(Isfound){
                System.out.print(str.charAt(i));

            }
        }

    }
}
