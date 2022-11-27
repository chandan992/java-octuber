package arrayDSA;

import java.util.Arrays;


public class find_dublicate_missing_number {
    public static void main(String[] args) {
        int arr[]={1,1,4,3,6,5};
       int[] ans= missingnumber(arr);
       System.out.println(Arrays.toString(ans));
    }
static int[] missingnumber(int arr[]){
    int i=0;
    
    while (i<arr.length) {
        int correct =arr[i]-1;
        if (arr[i]!=arr[correct]) {
            swip(arr, i, correct);
        }else{
        
            i++;
        }
    
    }
    for (int j = 0; j < arr.length; j++) {
        System.out.println(arr[j]);
        if (arr[j]!=j+1) {
            return new int[]{arr[j],j+1};
        }
    }
    return new int[]{-1,-1};
}

static void swip(int arr[],int first,int second){
    int item=arr[first];
    arr[first]=arr[second];
    arr[second]=item;
}
}
