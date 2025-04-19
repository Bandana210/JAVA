//5package METHODS;

// more than one methods with same name if -- no of paramters are different 
                                        //    -- different datatype of method

                                        

public class MethodOverloading1 {

    static int max(int a , int b){
        if(a >b)
            return a;
        else
            return b;
    }


    static double max(double a , double b){
        if(a >b)
            return a;
        else
            return b;
    }
    
    public static void main(String[] args) {

        int a=22;
        int b=23;
        
        float p= 33f;
        float q= 23.4f;

        System.out.println("max integer is "+ max(a,b));
        System.out.println("max float is " + max(p,q));

        
    }
}


// float can also work for interger
// duble for float