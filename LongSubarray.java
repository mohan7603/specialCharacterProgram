public class LongSubarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};

        int target = 12;
        int n = arr.length;

        int start = 0;
        int sum = 0;
        boolean found = false;

        for (int end = 0; end < n; end++) {

            sum = sum + arr[end];

            while (sum > target && start <= end) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == target) {

                System.out.println("Subarray found from index "
                        + start + " to " + end);

                System.out.print("Elements: ");

                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Subarray not found");
        }
    }
}