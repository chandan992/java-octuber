package arrayDSA;

public class rotated_binary_search {
    public static void main(String[] args) {
        int[] arr={6,7,8,10,2,3,4};
        int n=arr.length;
        int target=3;
       int answer= ans(arr, n,target);
        System.out.println(answer);
    }

    static int ans(int arr[],int n,int target){
        int start=0;
        int pivot=pivotnumber(arr, n);

        if (pivot==-1) {
           return mininumnumber(arr, target,0, n-1); 
        }
        if (arr[pivot]==target) {
            return target;
        }
        if (target>=arr[start]) {
            return mininumnumber(arr, target, start, pivot-1);
            
        }

            return mininumnumber(arr, target, pivot+1, n-1);
    
    }
    static int mininumnumber(int arr[], int target,int start,int end){
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
 
    static int pivotnumber(int arr[],int n){
        int start=0;
        int end=n-1;
        int mid=0;
         while(start<end){
            mid=start+(end-start)/2;
            if (mid<end  &&  arr[mid]>arr[mid+1]) {
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1])
            return mid-1;

            else if (arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return -1;
    
    }
    
}
