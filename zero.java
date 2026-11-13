public class zero {
    public static void main(String[] args){
        int[] arr = {-3,0,3,2,2,-1,0,-4};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        System.out.print("( "+arr[i]+","+arr[j]+","+arr[k]+" )");
                    }
                }
            }
        }
    }
}
