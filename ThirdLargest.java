public class ThirdLargest {
    public static void main(String[] args){
        int[] arr ={10,34,5,40,30,};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third && arr[i] != first && arr[i] != second) {
                third = arr[i];
            }
        }
        System.out.println("First Largest  : "+ first);
        System.out.println("Second Largest : "+ second);
        System.out.println("Third Largest  : "+ third);

    }
}
