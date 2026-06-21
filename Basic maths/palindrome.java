import java.util.*;
public class palindrome {
    public static void isPalindrome(int num){
       
        int org = num;
        int rev=0;
        while(num != 0){
            rev=rev*10+num%10;
            num=num/10;
        }

        if(rev==org){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalindrome(n);

    }
}
