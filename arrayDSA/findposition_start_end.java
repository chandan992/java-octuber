package arrayDSA;

import java.util.Arrays;

// Java program to find first and last occurrence of
// an elements in given sorted array

class findposition_start_end {
	// Function for finding first and last occurrence
	// of an elements
    public static void main (String[] args)
    {
        int arr[] = { 1,2,2,4,4,4,5,6 };
        int x = 2;
     int[] ans=  serachran(arr, x);
     System.out.println(Arrays.toString(ans));
       
    }

    static int[] serachran(int arr[],int x){
        int[] ans={-1,-1};
        int start =INbinary(arr,x,true);
        int end =INbinary(arr,x,false);
        ans[0]=start;
        ans[1]=end;

        return ans;

    }
static int INbinary(int arr[],int target,boolean isture){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target>arr[mid]) {
                start=mid+1;
            }
            else if(target<arr[mid]){
                end= mid-1;
            }
            else{
                ans=mid;
                if (isture) {
                    end=mid-1;
                }
                else{

                    start=mid+1;
                }
            }
        }
        return ans;
    }


	
        static int[] searchRange(int[] nums, int target) {
            int first=-1;
            int last=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=target)
                    continue;
                if(first==-1)
                    first=i;
                last=i;
            }
            if(first!=-1){
                return new int[]{first,last};
            }
            return new int[]{-1,-1};
        
    }

}

