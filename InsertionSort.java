import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr={45,5,7,8,90,2};

        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j >=0 && arr[j] > key ){
                arr[j+1]  = arr[j];
                j--;
            }
            arr[j+1]  = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
