public class nToOne {
    public static void down(int i ,int n){
        if(i<1){
            return;
        }

        System.out.println(i);
        down(i-1,n);
    }

    public static void main(String[] args) {
        int n=5;
        down(n,n);
    }
}
