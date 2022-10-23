package arrayDSA;
import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int arr2[]= new int[n-1];
        
        for (int i = 0; i<n ; i++) {
            System.out.println("Enter the"+ i +"vlaue of array");
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the position of array");
        int pos=sc.nextInt();
       // System.out.println("enter the new vaue of array");
      //  int num=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i<pos) {
                arr2[i]=arr[i];  // 10 20 80 
                
            }
            else if(i==pos)
            {
                continue;
            }            
            
            else {
                arr2[i-1]=arr[i];
            }
        }


        System.out.println("this is a result");
        for (int i = 0; i < n-1; i++) {
        System.out.println(arr2[i]);            
        }
    }
}
