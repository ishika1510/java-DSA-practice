import java.util.*;
public class countDigits {
    public static int countAllDigits(int num){
        int count=0;
        while(num != 0){
            int digit = num % 10; //123
            count++;
            num = num/10;

        }

        return count;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        System.out.println(countAllDigits(n));


    }
}
