import java.util.*;
public class functions{

    // public static int factorial(int n){
    //     int fact=1;
    //     for(int i=1; i<=n;i++){
    //         fact=fact*i;
    //     }
    //     return fact;
    // }


    // public static void main(String args[]){
    //     Scanner sc =new Scanner(System.in);
    //     System.out.print("enter n = ");
    //     int n=sc.nextInt();
        
    //     //calling function
    //     int fact=factorial(n);
    //     System.out.println(fact);

    // }

    
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        int[] arr=new int[5];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                
            }
            else{
                return false;
            }
        }
        return true;
    
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println();

    }
}