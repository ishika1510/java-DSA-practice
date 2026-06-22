public class sum {
    static int sums(int n){
        if(n == 0){
            return 0;
        }
        return n + sums(n-1);

    }

    public static void main(String[] args) {
        System.out.println(sums(5));
    }
}
