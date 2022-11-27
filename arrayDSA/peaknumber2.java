package arrayDSA;

import java.lang.annotation.Target;

public class peaknumber2 {
    public static void main(String[] args) {
        int arr[]={6,7,8,66,5,4,3,2,1};
        int n=arr.length;
        int target=4;
        int ans=findpeaknumber(arr, n);
        System.out.println(ans);

        int second= mininumnumber(arr,n,target);
        System.out.println("This is answer  : "+second);
    }
static int mininumnumber(int arr[],int n, int target){
       int start=0;
       int end= findpeaknumber(arr, n);
       int mid=0;
    while (start<=end) {
         mid=start+(end-start)/2;
         if (arr[mid]==target) {
            return mid;
         }
        if (target>arr[mid]) {
            start=mid+1;

        }
        else{
            end=mid-1;
        }
    }
    return -1;
}

static int findpeaknumber(int arr[],int n){
    int start=0;
    int end=n-1;
    int mid=0;

    while(start<end){
        mid=start+(end-start)/2;
        if (arr[mid-1]>arr[mid]) {
         end=mid-1;
        }
        else{
            start=mid+1;
        }
        
    
    }
    return  start;
}



}
