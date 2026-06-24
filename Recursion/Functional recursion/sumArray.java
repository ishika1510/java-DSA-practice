public class sumArray {
    public static void sum(int i,int arr[], int sum){
        if(i==arr.length){
            System.out.println(sum);
            return;
        }

        sum(i+1,arr,sum+arr[i]);
        
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        sum(0,arr,0);

    }
}
