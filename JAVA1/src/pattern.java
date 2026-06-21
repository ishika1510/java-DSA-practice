import java.util.Scanner;
public class pattern{
    public static void main(String[]args){
        
        
        // for(int i=0;i<5;i++){
        //     for(int j=4; j>i ; j--){
        //         System.out.print("  m");
        //     }
        //     for(int k=0; k<i*2+1;k++){
        //         System.out.print("*");
        //     }
            
        //     System.out.println();

        // }


        // int n=5;
        // for(int i=1; i<=n;i++){
        //     for(int j=1; j<=i ; j++){
        //         System.out.print(j);
        //     }  
        //     for(int j=1; j<=((n*2)-(i*2)); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1 ; j--){
        //         System.out.print(j);
        //     }
            
        //     System.out.println();
        // }
        // for(int i=n; i>=1;i--){
        //     for(int j=1; j<=i ; j++){
        //         System.out.print(j);
        //     }  
        //     for(int j=1; j<=((n*2)-(i*2)); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1 ; j--){
        //         System.out.print(j);
        //     }
            
        //     System.out.println();
        // }


        // int n=5;
        // for(int i=1; i<=2*n-1;i++){
        //     int stars;
        //     if(i<=n){
        //         stars=i;
        //     }
        //     else{
        //         stars=2*n-i;
        //     }
        //     for(int j=1; j<=stars; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         if(i==j || j==1|| i==n){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=2*n-1; j++){
        //         if(i==n || j==n-i+1|| j==n+i-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        

        //swapping two numbers
        // int a=20,b=30;
        // System.out.println("before swapping: a="+a+" & b="+b);
        // a=a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println("after swapping: a="+a+" & b="+b);

        //reverse a number
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter num: ");
        // int num=sc.nextInt();
        // int rev=0;
        // while(num!=0){
        //     rev=rev*10+num%10;
        //     num=num/10;

        // }
        // System.out.println(rev);

        //reverse a string
        // String str="ABCD";
        // String rev="";
        // int len=str.length();
        // for(int i=len-1;i>=0;i--){
        //     rev=rev+str.charAt(i);
        // }
        // System.out.println(rev);
        // 
        
        //string palindrome
        // Scanner sc=new Scanner (System.in);
        // String str=sc.next();
        // String lstr=str.toLowerCase();
        // String rev="";
        // String orgStr=lstr;
        // int len=lstr.length();
        // for(int i=len-1;i>=0;i--){
        //     rev=rev+lstr.charAt(i);
        // }
        // if(orgStr.equals(rev)){
        //     System.out.println("String is palindrome");
        // }
        // else{
        //     System.out.println("String is not palindrome");
        // }

        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number: ");
        // int num=sc.nextInt();
        // int count=0;
        // while(num>0){
        //     num=num/10;
        //     count++;
        // }
        // System.out.println(count);

        //sum of digits in a number
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter number: ");
        // int num=sc.nextInt();
        // int sum = 0;
        // while(num>0){
        //     sum=sum+num%10;
        //     num=num/10;
        // }
        // System.out.println(sum);

        //count odd even digits in a number 
        // Scanner sc=new Scanner (System.in);
        // System.out.println("enter nuber: ");
        // int num=sc.nextInt();
        // int even=0;
        // int odd=0;
        // while(num>0){
        //     int rem=num%10;
        //     if(rem%2==0){
        //         even++;
        //     }
        //     else{
        //         odd++;
        //     }
        //     num=num/10;
        // }
        // System.out.println("even digits: "+even+" odd digits: "+odd);

        //find gratest of three numbers
        // Scanner sc=new Scanner (System.in);
        // System.out.println("enter num1: ");
        // int a=sc.nextInt();
        // System.out.println("enter num2: ");
        // int b=sc.nextInt();
        // System.out.println("enter num3: ");
        // int c=sc.nextInt();

        // if(a>b && a>c){
        //     System.out.println("a is greater");
        // }
        // else if (b>a && b>c){
        //     System.out.println("b is greater");
        // }
        // else{
        //     System.out.println("c is greater");
        // }

        //generate fibbonacci series
        // Scanner sc=new Scanner (System.in);
        // int n=sc.nextInt();
        // int f=1, s=1, t;
        // System.out.print(f+" ");
        // System.out.print(s);
        // for(int i=3;i<=n;i++){
        //     t=f+s;
        //     System.out.print(" "+t);
        //     f=s;
        //     s=t;
        // }

        //ASCII value of character
        // Scanner sc=new Scanner(System.in);
        // char ch=sc.next().charAt(0);
        // int ascii=(int)ch;
        // System.out.println(ascii);

        //sum of first n natural number
        // Scanner sc=new Scanner (System.in);
        // int n=sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        //     System.out.println(sum);
        // }

        //leap year
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // if(num%400==0 || num%4==0 && num%100!=0){
        //     System.out.println("leap year");
        // }
        // else{
        //     System.out.println("not leap year");
        // }

        //factorial
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // int fact=1;
        // for (int i=1;i<=num;i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);

        //armstrong number
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int arm=0; 
        int temp;
        int org=num;
        while(num>0){
            temp=num%10;
            temp=(int)Math.pow(temp,3);
            arm=arm+temp;
            num=num/10;
        }
        if(arm==org){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }


        
    }
}


   