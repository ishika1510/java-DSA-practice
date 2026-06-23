public class reverseArray {
    public static void rev(int i, int j,int arr[]){
        if(i>=j){
            return ;
        }

        //swap
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        rev(i+1,j-1,arr); 

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n=arr.length-1;
        rev(0,n,arr);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
