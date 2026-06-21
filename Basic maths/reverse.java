import java.util.*;
public class reverse {
    public static int reverseNum(int num){
        int rev=0;
        while(num != 0){ //123
            rev = rev*10+ num%10;
            num = num/10;
        }
        return rev;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(reverseNum(n));

    }
}
