import java.util.*;

public class MaxInArray {

    static int max(int arr[],int n){
        int max=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static void printarr(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enetr array");
        int arr[]=new int [n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maximum= max(arr,n);
        System.out.println("maximum is " + maximum);
        
    }
    
}
