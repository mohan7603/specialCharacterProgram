public class MovesZerosRight {
    public static void main(String[] args){
        int[] arr={34,0,7,0,0,0,7,0};
        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
