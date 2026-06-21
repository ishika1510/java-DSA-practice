package Easy;

public class moveZeroesToEnd {
    public static void moveZeroes(int[] arr){
        int j=0;
            
        for(int i=0; i<arr.length; i++){

            
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                
            }

        }


    }

    public static void main(String[] args) {
        int[] arr={0,1,2,0,4,0,0,5};

        moveZeroes(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
