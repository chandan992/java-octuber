package arrayDSA;

import java.util.ArrayList;

public class avrage_in_steam {
     public static void main(String[] args) {
       int arr[]={9,2,3,40,5};
        float[] ans=new float[arr.length];
        float sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            ans[i]=sum/(i+1);
            System.out.println(sum);}
    
            
    
        }
    }

