package Medium;

public class twoSum {
    public static void twoSum(int[] arr, int target){
        //{2,4,6,11,22}  target=10
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum= arr[i]+arr[j];
            if(sum>target){
                j--;
            }

            else if(sum<target){
                i++;
            }

            else{
                System.out.println(i + "+"+ j);
                break;
                
            }
        }
        
        

    }

    public static void main(String[] args) {
        int[] arr={2,4,6,11,12};
        twoSum(arr, 17);


    }
}
