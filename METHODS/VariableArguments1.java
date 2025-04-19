//package METHODS;

// all the parameter of same datatypes

public class VariableArguments1 {
    static void show (int ...x ){
        for(int i: x){
            System.out.print(i + "\t");
        }
    } 

    // SUM OF ALL ELEMENTS 
    static void add(int y, int ...x){

        int sum=y;
        for(int i:x){
            sum = sum + i ; 
        }
        System.out.println(sum  +" is the sum of all passed elements");

    }

    static void showL(String ...s){
        for (int i=0;i<s.length;i++){
            System.out.println((i+1) +"."+s[i]);
        }
    } 
    // variable argument parameter must be last arguments
    public static void main(String[] args) {
        int a=23, b=33, c=99, d=98;

        System.out.println("show");
        show(a);
        System.out.println();
        show(a,b);
        System.out.println();
        show(a,b,c,d);
        System.out.println(" ");
        show(new int[]{2,3,4,5,6}); // anonymous array -- created for method use and then deleted -- no reference
        System.out.println("\n");
        showL("bandana", "tanu");

        System.out.println("\nadd");
        add(a,b);
        add(a,b,b);
        add(a,c,d,b);



    }
}
