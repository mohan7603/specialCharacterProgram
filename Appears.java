// Only one elements appears.

public class Appears {
    public static void main(String[] args){
        int[] arr = {2,2,3,4,3,4};

        int result = 0;

        for (int i=0;i<arr.length;i++){
            result = result ^ arr[i];

        }
        if(result != 0){
            System.out.println("Single Elements : "+result);
            System.out.println("Founded");
        }
        else{
            System.out.println("Not Founded. ");
        }

    }
}
