package arrayDSA;

public class binearlysearch {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,55,66,74,85,95};
        int target=95;
        int target2=85;
       boolean ans= search(arr, target);
       System.out.println(ans);
        int ans2= search2(arr, target2);
        System.out.println(ans2);
    }
    static boolean search(int arr[], int target){
        int start=0;
        int end=arr.length -1;
        while (start<=end) {
            int mid=start + (end-start)/2;

            if (target>arr[mid]) {
                start=mid+1;
            } 
            else if(target<arr[mid]){
                end=mid-1;
            }
            
            else {
                return true;
            }

        }
        
        
        return false;
    }


static int search2(int arr[],int target2){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid= start + (end-start)/2;
        if (target2<arr[mid]) {
            end=mid-1;
        }
        else if(target2>arr[mid]){
            start= mid+1;
        }
        else{
            return mid;
        }
    
    }
    return -1;
}


}




