public class PosNeg {
    public static void main(String[] args) {

        int[] arr = {1, 2, -3, -1, -2, 3};

        int n = arr.length;

        int[] result = new int[n];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0) {
                result[pos] = arr[i];
                pos += 2;
            }
            else {
                result[neg] = arr[i];
                neg += 2;
            }
        }

        System.out.println("Rearranged Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}