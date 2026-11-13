public class longestConsective {
    public static void main(String[] args){
        int[] arr = {100, 1, 2, 3, 4,200};

        int n = arr.length;
        int longest = 0;

        for (int i = 0; i < n; i++) {

            int count = 1;
            int current = arr[i];

            while (true) {

                boolean found = false;

                for (int j = 0; j < n; j++) {

                    if (arr[j] == current + 1) {
                        current++;
                        count++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    break;
                }
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest Consecutive Sequence: " + longest);
    }
}
