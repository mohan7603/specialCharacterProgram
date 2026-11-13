public class LargestElements {
    public static void main(String[] args){
        int[] arr={23,50,100,150,1000,3,7,8,90};

        int max = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Elements : " + max);
    }
}
