package arrayDSA;
import java.util.Scanner;
public class arraycopy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the leangth of an array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        int arr2[]= new int[n-1];
        System.out.println("Enter the value in array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("before insertion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the postion");
        int pos= sc.nextInt();
      //  System.out.println("Enter the value ");
      
     // int value=sc.nextInt();
        System.out.println("After insertion");
        for (int i = 0; i < n-1; i++) {
            if (i<pos) {              // 10 20 30 40 50
                                    // 10 20 40 
                arr2[i]=arr[i];
            }
            else if(i==pos){
                arr2[i]=arr[i+1];

            }
            else{
                arr2[i]=arr[i+1];
            }
            
        }
        for (int i = 0; i < n-1; i++) {
            System.out.println(arr2[i]);
        }
    }
    
}
