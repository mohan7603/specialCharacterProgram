public class majorityelements {
    public static void main(String[] args){
        int[] arr = {2,2,1,3,3,3,3,1,4};

        int cand = 0;
        int count = 0;

        for(int num : arr){
            if(count == 0){
                cand = num;
            }
            if(cand == num){
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println("Majority Elements : "+cand);
    }
}
