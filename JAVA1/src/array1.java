
import java.util.*;

public class array1 {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // input int array
        // int[] arr=new int[5];
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // // System.out.println(Arrays.toString(arr));
        // }
        // System.out.println(Arrays.toString(arr));

        // input string array
        // String[] str=new String[5];
        // for(int i=0;i<str.length;i++){
        // str[i]=sc.next();

        // }
        // System.out.println(Arrays.toString(str));

        // 2d array
        // int [][] arr=new int[3][3];
        // for(int row=0; row < arr.length;row++){
        // for(int col=0;col<arr[row].length;col++){
        // arr[row][col]=sc.nextInt();
        // System.out.print(arr[row][col]+" ");

        // }

        // System.out.println();
        // }

        // for(int row=0; row < arr.length;row++){
        // System.out.println(Arrays.toString(arr[row]));
        // }

        // or

        // for(int[]a:arr){
        // System.out.println(Arrays.toString(a));
        // }

        // array easy practice questions

        // Find the sum of all elements
        // int[] arr=new int[5];
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();

        // sum= sum+arr[i];
        // }
        // System.out.println("sum = "+sum);

        // Find the largest element in an array
        // int[] arr = {3,5,1,6,9};
        // int max=arr[0];
        // for(int i=1;i<arr.length;i++){
        // if(arr[i]>max){
        // max=arr[i];
        // }
        // }
        // System.out.println("largest element = "+max);

        // Find the smallest element in an array
        // int[] arr=new int[5];
        // arr[0]=sc.nextInt();
        // int min=arr[0];
        // for(int i=1;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // if(arr[i]<min){
        // min=arr[i];
        // }
        // }

        // System.out.println("smallest element: "+min);

        // int[] arr=new int[6];
        // int even=0;
        // int odd=0;
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // if(arr[i]%2==0){
        // even++;
        // }
        // else{
        // odd++;
        // }
        // }
        // System.out.println("even = "+even);
        // System.out.println("odd = "+odd);

        // reverse an array
        // int[] arr=new int[5];

        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }

        // int start=0;
        // int end=arr.length-1;
        // while(start<end){
        // int temp=arr[start];
        // arr[start]=arr[end];
        // arr[end]=temp;

        // start++;
        // end--;

        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }

        // average of array elements

        // int[] arr=new int[5];
        // int avg=arr.length;
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // sum=sum+arr[i];
        // }
        // avg=sum/avg;
        // System.out.println(avg);

        // sort an array
        // int[] arr=new int[5];
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }

        // //[4,5,2,3,1]
        // for(int i=0;i<arr.length-1;i++){
        // for(int j=i+1;j<arr.length;j++){
        // if(arr[i]>arr[j]){
        // int temp=arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;
        // }
        // }
        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }

        // check if an array is sorted or not
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        // boolean isSorted = true;
        // for (int i = 1; i < arr.length; i++) {
        // //[4,3,2,5,1] [1,2,3,4,5] [5,4,3,2,1]
        // if (arr[i] < arr[i - 1]) {
        // isSorted = false;
        // break;
        // }
        // }
        // if (isSorted) {
        // System.out.println("sorted");
        // } else {
        // System.out.println("not sorted");
        // }

        // find the second largest element in an array
        // int[] arr={25,16,38,10,35,48,20,50};
        // int max1=arr[0];
        // int max2=-1;

        // for(int i=1;i<arr.length;i++){
        // if(arr[i]>max1){
        // max2=max1;
        // max1=arr[i];
        // }
        // else if(arr[i]<max1 && arr[i]>max2){
        // max2=arr[i];
        // }
        // }

        // System.out.println("2 largest element = "+max2);

        // remove duplicate from a sorted arrays
        // int[] arr = {5,5,7,8,8,9,9,10,10};
        // int x=0;
        // for(int i=1;i<arr.length;i++){
        // if(arr[i]!=arr[x]){
        // x=x+1;
        // arr[x]=arr[i];
        // }
        // }
        // System.out.print(x);

        // third element
        // int[] arr={3,7,6,9,8};
        // int max1=arr[0];
        // int max2=-1;
        // int max3=-1;

        // for(int i=1;i<arr.length;i++){
        // if(arr[i]>max1){
        // max3=max2;
        // max2=max1;
        // max1=arr[i];

        // }
        // else if(arr[i]>max2 && arr[i]!=max1){
        // max3=max2;
        // max2=arr[i];
        // }
        // else if(arr[i]>max3 && arr[i]!=max1 && arr[i]!=max2){
        // max3=arr[i];
        // }
        // }
        // System.out.println("2 largest element = "+max3);

        // count smallest in array
        // int[] arr={3,4,1,1,1};
        // int count=1;
        // int min=arr[0];
        // for(int i=1;i<arr.length;i++){
        // if(arr[i]<min){
        // min=arr[i];
        // count=1;
        // }
        // else if(arr[i]==min){
        // count++;
        // }
        // }
        // for(int i=1;i<arr.length;i++){
        // if(arr[i]==min){
        // count++;
        // }
        // }

        // System.out.println(count);

        // difference between largest and smallest element in an array
        // int[] arr={3,2,7,9,1,5};
        // int max=arr[0];
        // int min=arr[0];
        // for(int i=1;i<arr.length;i++){
        // if(arr[i]>max){
        // max=arr[i];
        // }
        // if(arr[i]<min){
        // min=arr[i];
        // }
        // }
        // int diff=max-min;
        // System.out.println(diff);

        // int[] arr={7,9,3,2,1};
        // int n=arr.length;
        // int max=arr[0];
        // for(int i=1;i<arr.length;i++){
        // if(arr[i]>max){
        // max=arr[i];
        // }
        // }
        // if(max==arr[n-1]){
        // System.out.println("yes it is on last index");
        // }
        // else{
        // System.out.println("no");
        // }

        // palindrome

        // int[] arr={1,2,3,2,5};
        // int start=0;
        // int end=arr.length-1;
        // boolean palindrome=true;
        // while(start<end){
        // if(arr[start]!=arr[end]){
        // palindrome=false;
        // }
        // start++;
        // end--;
        // }
        // if(palindrome){
        // System.out.println("palindrome");
        // }
        // else{
        // System.out.println("not palindrome");
        // }

        // reverse subarray
        // int[] arr={1,2,3,4,5};
        // int start=1;
        // int end=arr.length-2;
        // while(start<end){
        // int temp=arr[start];
        // arr[start]=arr[end];
        // arr[end]=temp;

        // start++;
        // end--;
        // }
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }

        // remove duplicate from an array
        // int[] arr={1,2,3,3,4,4,4,5};
        // int x=0;
        // for(int i=1;i<arr.length;i++){
        // if(arr[i]!=arr[x]){
        // x++;
        // arr[x]=arr[i];
        // }
        // }

        // for (int i = 0; i <= x; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // rotate an array by one place
        // int[] arr={1,2,3,4,5};
        // int n=arr.length;
        // int temp=arr[0];
        // for(int i=1; i<n; i++){
        // arr[i-1]=arr[i];
        // }
        // arr[n-1]=temp;

        // for(int i=0;i<n;i++){
        // System.out.print(arr[i]+" ");
        // }

        // [3,4,5,1,2]
        // int k=2;
        // int[] arr={1,2,3,4,5};
        // int n=arr.length;
        // int temp=arr[0];
        // for(int i=1; i<n; i++){
        // arr[i-1]=arr[i];
        // }
        // arr[n-k]=temp;

        // for(int i=0;i<n;i++){
        // System.out.print(arr[i]+" ");
        // }

        // right rotate by one place
        // int[] arr={1,2,3,4,5}; //[5,1,2,3,4]
        // int n=arr.length; //5
        // int temp=arr[n-1]; //5-1=4

        // for(int i=n-1;i>0;i--){
        // arr[i]=arr[i-1];
        // }
        // arr[0]=temp;

        // for(int i=0;i<n;i++){
        // System.out.print(arr[i]+" ");
        // }

        // right rotation by k places
        // int[] arr={1,2,3,4,5,6,7};

        // int n=arr.length; //7
        // int k=sc.nextInt();
        // k=k%n; //3%7=3 so k=3

        // int temp[]=new int[n];

        // for(int i=0;i<arr.length;i++){
        // temp[(i+k)%n]=arr[i]; //temp[3]=arr[0] [0,0,0,1,2,3,4,5]
        // }

        // for(int i=0;i<n;i++){
        // arr[i]=temp[i]; //[0,0,0,1,2,3,4]
        // }

        // for(int i=0;i<n;i++){
        // System.out.print(arr[i]+" ");
        // }

        // left rotate by k
        // int[] arr={1,2,3,4,5,6,7};

        // int n=arr.length;
        // int k=sc.nextInt();
        // k=k%n;

        // int[] temp=new int[n];

        // for(int i=0;i<n;i++){
        // temp[(i-k+n)%n]=arr[i]; //[0,0,7,0,0,0,0]
        // }

        // for(int i=0;i<n;i++){
        // arr[i]=temp[i];
        // }

        // for(int i=0;i<n;i++){
        // System.out.print(arr[i]+ " ");
        // }

        // move zeroes to end
        // int[] arr={1,2,0,3,0,4};
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        // if(arr[i]!=0){
        // int temp=arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;

        // j++;
        // }
        // }

        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }

        // linear search
        // int[] arr={1,4,2,6,3,7};
        // int n=sc.nextInt();
        // int index=-1;
        // for(int i=0;i<arr.length;i++){
        // if(arr[i]==n){
        // index=i;
        // break;
        // }
        // }
        // System.out.println(index);

        // maximum element in an array
        // int[] nums={1,2,3,3,2,3,3,1};
        // int j = 0;
        // int count = 0;

        // for (int i = 0; i < nums.length; i++) {
        // if (count == 0) {
        // j = nums[i];
        // count = 1;
        // } else if (nums[i] == j) {
        // count++;
        // } else {
        // count--;
        // }
        // }

        // System.out.println(j);

        // two sum
        // int[] arr={2,4,7,11,15};
        // int target=26;
        // int i=0;
        // int j=arr.length-1;

        // while(i<j){
        // int sum=arr[i]+arr[j];
        // if(sum<target){
        // i++;
        // }
        // else if(sum>target){
        // j--;
        // }
        // else{
        // System.out.println(arr[i]+"+"+arr[j]);
        // break;

        // }

        // }

        // majority element brute force
        // int[] arr={1,1,2,2,1};
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        // int freq=0;
        // for(int j=0;j<n;j++){
        // if(arr[i]==arr[j]){
        // freq++;
        // }
        // }
        // if(freq>n/2){
        // System.out.println(arr[i]);
        // }
        // }

        // find unique element

        // int[] arr={1,1,2,3,2};
        // int firstUnique = -1;
        // for(int i=0;i<arr.length;i++){
        // int freq=0;
        // for(int j=0;j<arr.length;j++){
        // if(arr[j]==arr[i]){
        // freq++;
        // }
        // }
        // if(freq==1){
        // firstUnique = arr[i];
        // break;
        // }
        // }

        // System.out.println(firstUnique);

        // int[] arr = { 1, 2, 2, 3, 4, 3, 3 };
        // boolean[] visited = new boolean[arr.length];

        // for (int i = 0; i < arr.length; i++) {

        //     if (visited[i])
        //         continue; // already counted

        //     int count = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             count++;
        //             visited[j] = true;
        //         }
        //     }

        //     System.out.println(arr[i] + " --> " + count);
        // }

        //two sum
        int[] arr={1,2,3,3,1};
        // int target = 7;
        // int i=0;
        // int j=arr.length-1;
        // while(i<j){
        //     if((arr[i]+arr[j])>target){
        //         i--;

        //     }

        //     else if((arr[i]+arr[j])<target){
        //         i++;
        //     }

        //     else{
        //         System.out.println(arr[i]+"+"+arr[j]);
        //         break;
        //     }
        // }


    //    int off=0;
    //    int cm=1;
    //    int unique=1;
    //    while(cm<arr.length){
    //     if(arr[cm]==arr[cm-1]){
    //         cm++;
    //         continue;
    //     }
    //     else if(arr[cm]!=arr[cm-1]){
    //         arr[off+1]=arr[cm];
    //         off++;
    //         unique++;
    //         cm++;
    //     }
        
    //    }
    //    System.out.println(arr[unique]); 


    // int i=0;
    // int j=arr.length-1;
    // boolean isSorted= true;
    // while(i<j){
    //     if(arr[i]>arr[i+1]){
    //         isSorted= false;
    //         break;
            
    //     }
    //     i++;
        
    // }
    // System.out.println(isSorted);



    int i=0;
    int j=arr.length-1;
    boolean isPalindrome = true;
    while(i<j){
        // int temp=arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;
        if(arr[i]!=arr[j]){
            isPalindrome = false;
        }
        i++;
        j--;
    }

    // for(int x=0;x<arr.length;x++){
    //     System.out.print(arr[x]+" ");
    // }
    System.out.println(isPalindrome);



    }
}
