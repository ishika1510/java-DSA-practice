import java.util.*;

public class rangePalindrome {
    public static boolean palindrome(int n){
        int rev=0;
        int org=n;
        while(n != 0){
            int digit = n%10;
            rev=rev*10+ digit;
            n = n/10;
        }

        return rev == org;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start: ");
        int start = sc.nextInt();

        System.out.println("enter end: ");
        int end = sc.nextInt();

        for(int i=start; i<=end ; i++){
           if(palindrome(i)){
            System.out.println(i);
           }
        }
    }
}
