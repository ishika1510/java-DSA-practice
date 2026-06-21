package Easy;

public class largestElement {
    public static int largestElement(int[] arr){
        int max=arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]>arr[max]){
                max=arr[i];
            }
        }
        return max;

    }

    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        System.out.println(largestElement(arr));
    }
}
