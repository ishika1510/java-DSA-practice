import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        boolean isboolean = true;
        if (n<=1){
            isboolean = false;
            
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i== 0 ){
                    isboolean = false;
                    break;
                }
            }
        }

        return isboolean;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean result = isPrime(num);

        if(result){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
