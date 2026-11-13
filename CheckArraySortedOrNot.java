public class CheckArraySortedOrNot {
    public static void main(String[] args){
        int[] arr={23,34,56,1,5,90};

        boolean IsSorted = true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                IsSorted = false;
            }
        }
        if(IsSorted){
            System.out.println("Sorted Array.");
        }
        else{
            System.out.println("Not Sorted Array");
        }
    }
}
