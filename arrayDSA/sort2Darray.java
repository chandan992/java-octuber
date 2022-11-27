package arrayDSA;

import java.util.Arrays;


public class sort2Darray {
    public static void main(String[] args) {
    int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {11,55,66,67}};
    
    int target=1;
    int ans= findans(arr, target);
    System.out.println((ans));

    int	arr1[]={1,2,3,4,5};
		
    for (int i=0; i<arr1.length-1 ;i++ ){
        for (int j=i;j<arr1.length-1 ;j++ ){
            if (arr1[i]<arr1[j+1]){
                int them = arr1[i];
                arr1[i]=arr1[j+1];
                arr1[j+1]=them;
            } 
        } 
        
    } 
    for (int i=arr1.length-1;i>=0 ;i-- ){
        System.out.print(arr1[i]+"  ");
    }


    }
    

    static int findans(int[][] arr,int target){
        int r=0;
        int c=arr.length;
        while (r<arr.length && c>=0 ) {
           if(target==arr[r][c]){
                return arr[r][c];
           } 
           if (arr[r][c]<target) {
                r++;
           } else {
            c--;
           }
        }
        return -1;
    }
}
