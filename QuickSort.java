import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] arr,int low,int high){

        if(low < high){
            int pivot = partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void main(String[] args){
        int[] arr ={45,67,89,4,5,6,90,50};

        System.out.println("Original Array : "+ Arrays.toString(arr));

        quicksort(arr,0, arr.length-1);

        System.out.println("Sorted Array : "+Arrays.toString(arr));

    }
}

