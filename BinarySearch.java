import java.sql.SQLOutput;

public class BinarySearch {
    public static void main(String[] args){

        int[] arr = {3,4,5,67,55,90,101};
        int key = 90;

        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == key){
                System.out.println(key+" Elements found.");
                return;
            }
            else if (arr[mid] < key) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(key+" Elements not founde.");
    }
}
