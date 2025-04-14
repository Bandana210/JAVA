//package METHODS;

// all the parameter of same datatypes

public class VariableArguments1 {
    static void show (int ...x ){
        for(int i: x){
            System.out.print(i + "\t");
        }
    } 

    static void add(int y, int ...x){

        int sum=y;
        for(int i:x){
            sum = sum + i ; 
        }
        System.out.println(sum  +" is the sum of all passed elements");

    }
    public static void main(String[] args) {
        int a=23, b=33, c=99, d=98;

        System.out.println("show");
        show(a);
        System.out.println();
        show(a,b);
        System.out.println();
        show(a,b,c,d);

        System.out.println("add");
        add(a,b);
        add(a,b,b);
        add(a,c,d,b);



    }
}
