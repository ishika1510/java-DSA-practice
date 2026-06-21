import java.util.Arrays;

public class arrayFunc {
    // public static int largest(int[] arr){
    //     int max=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }

    // public static boolean isSorted(int[] arr){
    //     int count = 0;
    //     int n=arr.length;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>arr[(i+1)%n]){
    //             count++;
    //         }
    //     }
    //     return count <= 1;

        
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]>arr[(i+1)]){
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }


    // public static int[] reverse(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;

    //         start++;
    //         end--;
    //     }
    //     return arr;
    // }



    // public static void main(String args[]){
    //     int[] nums={1,2,3,4,5};
    //     int[] result=reverse(nums);
    //     System.out.println(Arrays.toString(result));
    // }




    // public static boolean isPalindrome(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;
    //     boolean palindrome=true;
    //     while(start<end){
    //         if(arr[start]!=arr[end]){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }


    // public static void main(String args[]){
    //     int[] nums={1,2,3,2,3};
    //     boolean result=isPalindrome(nums);
    //     System.out.println(result);
    // }



    
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // handle cases where k > n
        
        // Step 1: reverse entire array
        reverse(nums, 0, n - 1);
        
        // Step 2: reverse first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: reverse remaining elements
        reverse(nums, k, n - 1);
    }
    
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        
        

    }
}

