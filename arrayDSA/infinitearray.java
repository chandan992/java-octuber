package arrayDSA;

class infinitearray{
    public static void main(String[] args) {
        int arr[]={2,3,5,6,8,9,11,33,55,77,88,99,100,121,131};
        int target =9;
       int ans= findpos(arr, target);
       System.out.println(ans);
    }

    static int findpos(int arr[],int target){
            int start=0;
            int end=6;
            while(target>arr[end]){
            int temp= end+1;
            end= end+(end-start+1)*2;
                start=temp;
            }
          int result=  givenarray(arr, target, start, end);
          return result;
    }

    static int givenarray(int arr[],int target,int start,int end){
        
        while (start<=end) {
            int mid = start+ (end-start)/2;
            if (arr[mid]<target) {
                start=mid+1;
                
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            return mid;

        }
        return -1;
    }
}