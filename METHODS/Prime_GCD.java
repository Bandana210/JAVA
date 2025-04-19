import java.util.Scanner;

public class Prime_GCD {


    //BEYOND THE HALF OF NUMBER THERE ARE NO FACTORS 

    static boolean prime(int n){

        for(int i=2;i<n/2;i++){

            if (n%i == 0){
                return false;
            }
        }
        return true;

    }

    static int gcd(int n1,int n2){

        int min= ((n1 > n2) ? n2 : n1);

        for(int i=2;i<min;i++){
            if((n1 % i == 0 ) && (n2 % i == 0)){
                return i;
            }
        }
        return 1;
    }

    static int gcd2(int n1 , int n2){
        while( n1 != n2){
            if(n1 > n2){
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }

        }
        return n2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter for prime");
                int no=sc.nextInt();
                boolean res=prime(no);
                if(res  == true){
                    System.out.println(no + " is prime");
                }
                else{
                    System.out.println(no+ " is not prime");
                }
                break;

            case 2:
                System.out.println("enter two no for gcd");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                int res1= gcd(n1,n2);
                int res2=gcd2(n1,n2);
                System.out.println("gcd of "+ n1 + "and " + n2 + " is " + res1);
                System.out.println("gcd of "+ n1 + "and " + n2 + " is " + res2);
        }
        
       
        
    }
}
