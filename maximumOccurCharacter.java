public class maximumOccurCharacter {
    public static void main(String[] args){
        String s = "programmming";
        char[] ch = s.toCharArray();
        int max = 0;
        char maxchar = ' ';

        for (int i=0;i<ch.length;i++){
            int count = 0;
            for (int j=0;j<ch.length;j++){
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxchar = ch[i];
            }
        }
        System.out.println("maximum occuring character : "+maxchar);
        System.out.println("Frequecy Count             : "+max);
    }
}
