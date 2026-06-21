public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=n-1; i>=1 ; i--){
            int didSwap = 0;
            for(int j=0; j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={24,67,2,45,90};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
