package Easy;

public class removeDuplicates {
    public static int duplicates(int[] arr){

        //removing dupicates from sorted array
        //if array is not sorted, removing duplicates won't work
        //first sort array then remove duplicates 


        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[x]){
                x++;
                arr[x]=arr[i];
                
            }
        }
        return x+1;
        
    }

    public static void main(String args[]){
        int[] arr={1,1,2,2,2,3,4,4,5};
        int len=duplicates(arr);
        for(int i=0; i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
