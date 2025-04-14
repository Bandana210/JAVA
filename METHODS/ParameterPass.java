
class ParameterPass{
    static int max(int x, int y){  // formal parameters  -- parameter of called method
        x++;
        System.out.println(x + " due to x++ ");
        // this means max and main has different copies of object
        
        if(x >y){
            return x;
        }
        else
            return y;
        
    }

    static int change(int z){
        return ++z;

    }

    static void changeArray(int ar[]){
        ar[0]=22;
    }
    public static void main(String[] args) {

        int a=22;
        int b=34;
         // a and b are actual parameters -- parameters of calling method

        System.out.println(max(a,b));     
        System.out.println("due to static a=" +a );   

        // if i dont want to declare max as static then create object
        ParameterPass m = new ParameterPass();
        System.out.println(m.max(a,b));
        System.out.println("due to object a=" +a );

        
        int z=99;
        change(z);
        System.out.println(z + " did not change ");
        
        /*
            here z is not object hence its value remain unchanged 
            but in java arrays are object , hence its value is changed
         */

        int arr[]={2,3,4,5};
        changeArray(arr);
        System.out.println(arr[0] + " did change");



    }
}

// very important
/*
    DIFFERENCE BETWEEN OBJECT AND DATA PASS
            OBJECT- reference conatins address of object(in heap) , 
                    when its passed to method , actually the copy of adress of object is passed to method
                    hence both main and max contains same object not copy of object
                    same entity
            DATA  - reference contains data
                    when parameter is passed acopy of object is passed 
                    hence it contains copy of object 
                    so both contains different entity
                    hence primtives are not passed as object

 */

// ALWAYS WHILE PASSING PARA CONTENT OF ACTUAL PARA IS COPIED TO FORMAL PARA --     only way of parameter passing


// objects are always stored in heap memory and their reference in stack always
/*
        class Student {
        int age;
        String name;
        }
9
        Student s = new Student();

        ((s -- reference in stack
        Student object in heap 
        name and age are attributes of Student -- also in heap)

        ( int max(){
         a=65;
         }
         a in method not a part of class -- hence a in stack 
        NOTE - max can be there inside any class but a is not a property of that class 
        )


 */


// primitives individually stored in stack but if part of object than in heap  -- their reference in stack always 