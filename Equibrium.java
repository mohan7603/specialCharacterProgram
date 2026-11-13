public class Equibrium {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};

        int n = arr.length;
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum
        for (int i = 0; i < n; i++) {
            totalSum = totalSum + arr[i];
        }

        // Find equilibrium index
        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index: " + i);
                break;
            }

            leftSum = leftSum + arr[i];
        }
    }
}