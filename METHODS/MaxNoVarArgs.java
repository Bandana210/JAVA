import java.util.*;

public class MaxNoVarArgs {
    static int max(int ...x){
        int max=0;
        for(int i:x){
            if(i> max){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter no of elements");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("max is "+ max(arr));
    }
}
