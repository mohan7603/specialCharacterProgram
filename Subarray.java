// Subarray (kadane algorithm)


public class Subarray {
    public static void main(String[] args){
        int[] arr = {1,2,3,-4,5};

        int currentsum = 0;
        int maxsum = 0;

        for(int i=0;i<arr.length;i++){
            if(currentsum + arr[i] > arr[i]){
                currentsum = currentsum + arr[i];
            }
            else {
                currentsum = arr[i];
            }
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
        }
        System.out.println("Subarray : "+maxsum);

    }
}
