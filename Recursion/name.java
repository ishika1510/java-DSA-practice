public class name {
    static int cnt = 0;
    public static void print(int i, int n){
        if(i>n){
            return;
        }

       System.out.println("ishika");
       print(i+1,n);


    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(n);

        print(1,n);
    }
}
