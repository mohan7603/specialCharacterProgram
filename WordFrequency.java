public class WordFrequency {
    public static void main(String[] args){
        String s = "java is easy and java is programming language";
        String[] word = s.split("\\s+");
        boolean[] visit = new boolean[word.length];

        for (int i=0;i<word.length;i++){
            if(visit[i]){
                continue;
            }
            int count =0;
            for (int j=0;j<word.length;j++){
                if(word[i].equals(word[j])){
                    count++;
                    visit[j] = true;

                }
            }

            System.out.println(word[i]+" : "+count);
        }
    }
}
