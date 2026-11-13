public class MovesZerosLeft {
    public static void main(String[] args){
        int[] arr = {34,0,5,0,23,0,0,0,8};
        int index = arr.length-1;

        // Move non-zero elements to the right
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;

            }
        }

        // Fill remaining positions with zeros
        while(index >= 0){
            arr[index] = 0;
            index--;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
