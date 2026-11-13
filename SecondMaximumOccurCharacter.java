public class SecondMaximumOccurCharacter {
    public static void main(String[] args){
        String s = "aaaabbbccd";
        char[] ch = s.toCharArray();
        boolean[] visit = new boolean[ch.length];

        int FirstMaxCount = 0;
        int SecondMaxCount = 0;

        char FirstChar = ' ';
        char SecondChar = ' ';

        for(int i=0;i<ch.length;i++){
            if(visit[i]){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                    visit[j] = true;
                }
            }
            if(count > FirstMaxCount){
                SecondMaxCount = FirstMaxCount;
                FirstMaxCount = count;

                SecondChar = FirstChar;
                FirstChar = ch[i];
            }
            else if (count > SecondMaxCount && count < FirstMaxCount) {
                SecondMaxCount = count;
                SecondChar = ch[i];

            }
        }
        System.out.println("First Maximum Count     : "+FirstMaxCount);
        System.out.println("First Maximum Character : "+FirstChar);
        System.out.println("Second Maximum Count     : "+SecondMaxCount);
        System.out.println("Second Maximum Character : "+SecondChar);


    }
}
