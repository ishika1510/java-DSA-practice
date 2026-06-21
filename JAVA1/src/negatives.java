public class negatives {
    public static void main(String[] args) {
        //move negatives to one side
        int[] arr={-1,2,3,-4,-5};
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
