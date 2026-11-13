public class SecondLargest {
    public static void main(String[] args){
        int[] arr={45,50,2,3,50,90,45};

        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++) {
            if (arr[i] > Largest) {
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else if (arr[i] > SecondLargest && Largest != arr[i]) {
                SecondLargest = arr[i];

            }
        }
        System.out.println("Largest Elements : "+Largest);
        System.out.println("SecondLargest Elements : "+SecondLargest);

    }
}
