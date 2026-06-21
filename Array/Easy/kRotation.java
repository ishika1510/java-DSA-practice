package Easy;

public class kRotation {
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    //left rotation
    public static void left(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        //{1,2,3,4,5}= {3,4,5,1,2}
        reverse(arr, 0, k-1); //{2,1,3,4,5}

        reverse(arr,k, n-1 ); //{2,1,5,4,3}

        reverse(arr, 0, n-1); //{3,4,5,1,2}

    }

    //right rotation
    public static void right(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        //{1,2,3,4,5}= {4,5,1,2,3}

        reverse(arr, 0, n-1); //{5,4,3,2,1}

        reverse(arr, 0 , k-1); //{4,5,3,2,1}

        reverse(arr, k, n-1);

    }
    

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;

        right(arr, k);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
    
}
