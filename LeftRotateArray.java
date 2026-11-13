//public class LeftRotateArray {
//    public static void main(String[] args){
//        int[] arr={23,45,67,88,90,100};
//
//        int first = arr[0];
//        for(int i=0;i<arr.length-1;i++){
//            arr[i] = arr[i+1];
//        }
//        arr[arr.length-1] =first;
//
//        for(int num : arr){
//            System.out.print(num+" ");
//        }
//    }
//}


public class LeftRotateArray{
    public static void main(String[] args){
        int[] arr={34,56,7,8,90};
        int k=2;
        for(int r=0;r<k;r++){
            int first = arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
