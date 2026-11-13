public class ReverseWord {
    public static void main(String[] args) {
        String s = "i love java";
        String[] words = s.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];

            if (i > 0) {
                result = result + " ";
            }
        }
        System.out.println(result);
    }
}