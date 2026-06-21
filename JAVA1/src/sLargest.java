public class sLargest {
    public static void main(String[] args) {
        //second largest element
        int[] arr={1,2,3,4,5};
        int max1=arr[0];
        int max2=-1;
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }

            else if(arr[i]>max2 && arr[i]<max1){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
