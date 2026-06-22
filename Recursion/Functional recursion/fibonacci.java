public class fibonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        int terms=7;
        for(int i=1; i<=terms; i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
