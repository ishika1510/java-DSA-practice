import java.util.*;
public class patterns {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    //square star pattern
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //right angled triangle
    // int n=5;
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // inverted right angled triangle
    // int n=5;
    // for(int i=5;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //pyramid star 
    // int n=5;
    // for(int i=5;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" ");
    //     } 
    //     for(int j=5;j>=i;j--){
    //         System.out.print("*");
    //     } 
    //     for(int j=4;j>=i;j--){
    //         System.out.print("*");
    //     } 

    //     System.out.println();
    // }
    

    //inverted pyramid
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("-");
    //     }
    //     for(int j=5;j>=i;j--){
    //         System.out.print("*");
    //     }
    //     for(int j=4;j>=i;j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //  int n = 4;

    //     for (int i = 1; i <= n; i++) {

    //         // spaces
    //         for (int s = 1; s <= n - i; s++) {
    //             System.out.print("-");
    //         }

    //         // stars
    //         for (int j = 1; j <= (2 * i - 1); j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }


    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i-1;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=(n+1-i);j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
        
    // }

    // for(int i=1;i<n;i++){
    //     for(int j=1;j<=n-i-1;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i+1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }







    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1; j<=(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
        
    // }

    // for(int i=1;i<n;i++){
    //     for(int j=1; j<=i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
        
    // }





    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i);
    //     }
    //     System.out.println();
    // }

    // for(int i=n-1;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i);
    //     }
    //     System.out.println();
    // }


    //kite pattern
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i*2-1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // for(int i=n-1;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i*2-1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }




    //number triangle
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i);
    //     }
    //     System.out.println();
    // }


    // int n=5;
    // for(int i=n;i>=1;i--){
    //     for(int j=i;j>=1;j--){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    // int n=1;
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(n+" ");
    //         n++;
    //     }
    //     System.out.println();
    // }


    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if((i+j)%2==0){
    //             System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    // }


    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if(i%2==0){
    //             System.out.print("0");
    //         }
    //         else{
    //             System.out.print("1");
    //         }
    //     }
    //     System.out.println();
    // }

    // int n=5;
    // for(int i=1;i<=n;i++){
    //     char ch='A';
    //     for(int j=1;j<=i;j++){
    //         System.out.print((char)('A'+i-1));
    //         ch++;
    //     }
    //     System.out.println();
    // }




    // int n=5;
    // for(int i=1;i<=n;i++){
    //     char ch='A';
    //     for(int j=1;j<=i;j++){
    //         System.out.print(ch);
    //         ch++;
    //     }
    //     System.out.println();
    // }



    // int n=5;
    // char ch='A';
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(ch);
    //         ch++;
    //     }
    //     System.out.println();
    // }



    //hollow patterns
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         if(i==1||j==1||i==n||j==n){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }

    //     }
    //     System.out.println();
    // }


    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if(i==1||j==1||i==j||i==n){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }



    //hollow diamond
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=2*i-1;j++){
    //         if(j==1||j==2*i-1){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();

    // }

    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=2*i-1;j++){
    //         if(j==1||j==2*i-1){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();

    // }

    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         if(i==n||j==i||j==1){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }

    //     }
    //     System.out.println();
    // }



    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i==n||j==1||i==j){
                System.out.print(j);
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }


    }
    
}


