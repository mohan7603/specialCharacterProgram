public class LinearSearch {
    public static void main(String[] args){
        int[] arr ={2,4,5,6,7,89,90};
        int key = 78;
        boolean Isfound = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                Isfound = true;
                System.out.println(key+" Founded");
                break;
            }
        }
        if(!Isfound){
            System.out.println(key+" Not Founded");
        }
    }
}
