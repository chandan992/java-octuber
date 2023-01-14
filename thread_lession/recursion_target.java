package thread_lession;
public class recursion_target {
    public static void main(String[] args) {
    int arr[]={5,6,7,8,9,1,2,3,4};    
    int end=arr.length-1;
    int target = 5;
    int first= findtarget(arr,target, 0,end);
    System.out.println(first);
    }

    static int findtarget(int arr[],int target,int start,int end){

            if (start>end) {
                return -1;
            }             
            
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid+1;
            }

            if(arr[start]<=arr[mid]){

                if(arr[start]<= target && arr[mid]>=target){
                    return findtarget(arr, target, start,mid-1 );
                }else{
                    return findtarget(arr,target,mid+1,end);
                }

            }

            if(arr[mid]<=target && arr[end]>=target){
                return findtarget(arr, target, mid+1, end);
            }else{
                return findtarget(arr, target, start, mid-1);
            }
    }
    
}
