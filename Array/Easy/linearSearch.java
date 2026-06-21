package Easy;
import java.util.*;

public class linearSearch{
    public static int linear(int[] arr, int n){
        int index= -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        int[] arr={9,6,5,11,4}; 
        System.out.println(linear(arr,n )+" index");
    }
}