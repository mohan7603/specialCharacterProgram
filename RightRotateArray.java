//public class RightRotateArray {
//    public static void main(String[] args){
//        int[] arr={34,56,7,8,90,100};
//
//        int last = arr[arr.length-1];
//
//        for(int i =arr.length-1;i>0;i--){
//            arr[i] = arr[i-1];
//        }
//        arr[0] = last;
//        for(int num : arr){
//            System.out.print(num+" ");
//        }
//    }
//}

public class RightRotateArray{
    public static void main(String[]args){
        int[] arr={3,4,5,6,7,8};
        int k =2;

        for(int r=0;r<k;r++){
            int last = arr[arr.length-1];

            for(int i =arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}