import java.util.*;
public class armstrong {
    public static void armstrongNum(int num){
        int org = num;
        int sum=0;

        String str = String.valueOf(num);
        int len = str.length();
        
        while(num != 0 ){
            int digit = num%10;
            int pow=(int)Math.pow(digit, len);
            sum= sum+pow;
            num=num/10;

        }

        if(sum==org){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not an Armstrong number");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrongNum(n);

    }
}
