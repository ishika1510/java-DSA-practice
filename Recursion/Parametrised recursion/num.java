import java.util.*;
public class num {
    // static int cnt = 1; //global variable
    public static void linearly(int i, int n){
        
        if(i < 1){
            return;
        }

        linearly(i-1,n);
        System.out.println(i);
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num =sc.nextInt();
        linearly(num,num);

    }
}
