public class CountFrequency {
    public static void main(String[] args){
        String s  = "parashuit";
        char[] ch = s.toCharArray();
        boolean[] visited = new boolean[s.length()];

        for(int i=0;i<ch.length;i++){
            if(visited[i]){
                continue;
            }
            int count =0;
            for(int j = i;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                    visited[j]  = true;
                }
            }
            System.out.println(ch[i]+" = "+count);
        }
    }
}
