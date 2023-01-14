package thread_lession;

import java.lang.annotation.Target;

public class findtarget {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,8,9};
        int target =9;
        int n=arr.length;
       int ans= findtarget(arr,target, 0, n-1);
       System.out.println(ans);

    int second=   find(arr, target, 0);
    System.out.println(second);
    }

    static int findtarget(int arr[],int target,int start,int end){

        if (start>end) {
            return -1;
        }

        
            int mid= start +(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if (arr[mid]>target) {
                  return   findtarget(arr, target, start, mid-1);
            } else {
                  return findtarget(arr, target, mid+1, end);
            }

        

    }

    static int find(int arr[],int target,int index){
        
        if (index==arr.length) {
            return -1;
        }
        if (target==arr[index]) {
            return index;
        }
        else{

            return find(arr, target, index+1);
        }
        

    }
}
