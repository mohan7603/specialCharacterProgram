public class CountWord {
    public static void main(String[] args){
        String s = "Java is Easy";
        String[] word = s.trim().split("\\s+");

        int count = word.length;

        System.out.println("String : "+s);
        System.out.println("Number Count : "+count);

    }
}
