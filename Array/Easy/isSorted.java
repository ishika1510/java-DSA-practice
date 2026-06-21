package Easy;

public class isSorted {
    public static boolean isSorted(int[] arr){
        boolean sorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                sorted=false;
            }
        }
        return sorted;
    }

    public static void main(String args[]){
        int[] arr={5,3,4,2,1};
        System.out.println(isSorted(arr));
    }
}
