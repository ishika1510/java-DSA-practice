import java.util.Scanner;

public class logic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // prime number
        // System.out.print("enter a number: ");
        // int n=sc.nextInt();
        // boolean prime = true;
        // if(n<=1){
        // prime = false;
        // }
        // else{
        // for(int i=2;i<n;i++){
        // if(n%i==0){
        // prime = false;
        // }
        // }
        // }
        // if(prime){
        // System.out.println("prime");
        // }
        // else{
        // System.out.println("not prime");
        // }

        // prime in range
        // System.out.print("enter starting range: ");
        // int start = sc.nextInt();

        // System.out.print("enter ending range: ");
        // int end = sc.nextInt();

        // for(int num=start; num<=end;num++){
        // if(num<=1){
        // continue;
        // }

        // boolean prime = true;

        // for(int i=2;i<num;i++){
        // if(num%i==0){
        // prime = false;
        // break;
        // }
        // }
        // if(prime){
        // System.out.println(num+" ");
        // }
        // }

        // palindrome
        // System.out.print("enter a num: ");
        // int n=sc.nextInt();
        // int rev=0;
        // int org=n;
        // while(n!=0){
        // rev=rev*10+n%10;
        // n=n/10;
        // }
        // if(org==rev){
        // System.out.println("palindrome");
        // }
        // else{
        // System.out.println("not palindrome");
        // }

        // armstrong number
        // System.out.println("enter number : ");
        // int n=sc.nextInt();

        // String num = String.valueOf(n);
        // int length=num.length();

        // int arm=0;
        // int temp;
        // int org=n;

        // while(n>0){
        // temp=n%10;
        // arm=arm+(int)Math.pow(temp,length);
        // n=n/10;
        // }

        // if(org==arm){
        // System.out.println("armstrong");
        // }
        // else{
        // System.out.println("not armstrong");
        // }

        // print armstrong number
        // System.out.println("enter number : ");
        // int n=sc.nextInt();

        // String num = String.valueOf(n);
        // int length=num.length();

        // int arm=0;
        // int temp;
        // int org=n;

        // while(n>0){
        // temp=n%10;
        // arm=arm+(int)Math.pow(temp,length);
        // n=n/10;
        // }
        // if(org==arm){
        // System.out.println(arm+ " : it is a armstrong number.");
        // }
        // else{
        // System.out.println(arm+ " : it is not a armstrong number.");
        // }

        // perfect number
        // System.out.print("enter number: ");
        // int n=sc.nextInt();
        // int sum=0;

        // for(int i=1;i<=n/2;i++){
        // if(n%i==0){
        // sum=sum+i;
        // }
        // }
        // if(sum==n && sum!=0){
        // System.out.println("perfect number");
        // }
        // else{
        // System.out.println("not perfect number");
        // }

        // strong number
        // System.out.print("enter a num: ");
        // int n=sc.nextInt();
        // int temp=n;
        // int sum=0;

        // while(n>0){
        // int digit=n%10;

        // int fact=1;
        // for(int i=1;i<=digit;i++){
        // fact=fact*i;
        // }

        // sum=sum+fact;
        // n=n/10;
        // }
        // if(sum==temp){
        // System.out.println("strong number");
        // }
        // else{
        // System.out.println("not strong number");
        // }

        // find gcd of two numbers
        // int gcd=1;
        // System.out.print("enter first number: ");
        // int one=sc.nextInt();

        // System.out.print("enter second number: ");
        // int two=sc.nextInt();

        // for(int i=1;i<=one/2 && i<=two/2;i++){
        // if(one%i==0 && two%i==0){
        // gcd=i;
        // }
        // }
        // System.out.println("gcd : "+gcd);

        // factorization
        // System.out.print("enter number : ");
        // int n=sc.nextInt();
        // int i=2;

        // while(n>1){
        // if(n%i==0){
        // System.out.print(i+" ");
        // n=n/i;
        // }
        // else{
        // i++;
        // }
        // }

        // lcm
        // int gcd=1;
        // System.out.print("enter first number: ");
        // int one=sc.nextInt();

        // System.out.print("enter second number: ");
        // int two=sc.nextInt();

        // int x=one;
        // int y=two;

        // for(int i=1;i<=one/2 && i<=two/2;i++){
        // if(one%i==0 && two%i==0){
        // gcd=i;
        // }
        // }
        // int lcm=(x*y)/gcd;
        // System.out.println(lcm);

        // automorphic numbers
        // System.out.print("enter numn: ");
        // int n=sc.nextInt();
        // int sq=n*n;
        // int temp=n;

        // boolean automorphic = true;

        // while(temp>0){
        // if(temp % 10 != sq % 10){
        // automorphic=false;
        // break;
        // }
        // temp=temp/10;
        // sq=sq/10;
        // }

        // if(automorphic){
        // System.out.println("automorphic");
        // }
        // else{
        // System.out.println("not automorphic");
        // }

        // int n=sc.nextInt();
        // int sum=0;
        // int org=n;

        // int temp;
        // while(n>0){
        // temp=n%10;
        // int fact=1;
        // for(int i =1;i<=temp;i++){
        // fact=fact*i;
        // }
        // sum=sum+fact;
        // n=n/10;
        // }
        // if(org==sum){
        // System.out.println("strong number");
        // }
        // else{
        // System.out.println("not strong number");
        // }

        // decimal to binary
        // int n=sc.nextInt();
        // String str="";
        // while(n>0){
        // int r=n%2;
        // str=r+str;
        // n=n/2;
        // }
        // System.out.println("binary digit: "+str);

        // add digits
        //

        // int n=sc.nextInt();

        // while(n>=10){
        // int sum=0;
        // while(n>0){
        // int digit=n%10;
        // sum=sum+digit;
        // n=n/10;
        // }
        // n=sum;
        // }
        // System.out.println(n);

        // palindrome in range
        // int start=sc.nextInt();
        // int end=sc.nextInt();
        // for(int i=start;i<=end;i++){
        // int n=i;
        // int rev=0;
        // int org=n;
        // while(n>0){
        // rev=rev*10+n%10;
        // n=n/10;
        // }
        // if(org==rev){
        // System.out.println(rev);
        // }
        // }

        //armstrong in a range
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        
        // for (int i = start; i <= end; i++) {
        //     int sum = 0;
        //     String str = String.valueOf(i);
        //     int len = str.length();
        //     int n=i;
        //     int org=n;
        //     while (n > 0) {
        //         int digit = n % 10;
        //         int pow = (int) Math.pow(digit, len);
        //         sum = sum + pow;
        //         n = n / 10;
        //     }
        //     if (org==sum) {
        //         System.out.println(sum);
        //     }
        // }

        int n=sc.nextInt();
        int sum=0;
        int org=n;
        while(n>0){
            int digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if (org==sum){
            System.out.println("strong");
        }
        else{
            System.out.println("not");
        }

    }
}
