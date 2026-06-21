public class count {
    static int cnt = 0; 

    public static void count (){
        if(cnt==4){    //base condition
            return; //terminate
        }

        System.out.println(cnt);
        cnt++;
        count();
    }

    public static void main(String[] args){
        count();
    }
    

}
