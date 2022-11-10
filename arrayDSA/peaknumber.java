
package arrayDSA;
// A Java program to find a peak element using divide and
// conquer
import java.io.*;

class peaknumber {

	// A binary search based function that returns index of
	// a peak element
	static int findPeak(int arr[], int n)
	{
		int r = 0;
		int l = n-1;
		int mid = 0;
	
		while (r <= l) {

			// finding mid by binary right shifting.
			mid = r+(l-r)/2;

			// first case if mid is the answer
			if ((mid==0 ||arr[mid - 1] <= arr[mid])
						&& ( mid==n-1|| arr[mid + 1] <= arr[mid])){

							break;
						}
			
			
			

			// move the right pointer
			if (  mid > 0 && arr[mid - 1] > arr[mid])
			l = mid -1;

			// move the left pointer
			else 
				r = mid + 1;
			

			}
			return mid;
	
	}
	static int secondmothod(int arr[],int n){
		int r=0;
		int l=n-1;
		while (r<l) {
			int mid =r+(l-r)/2;
			if (arr[mid-1]>arr[mid]) {
				l=mid;
				
			} else  {
				r=mid+1;
			}
			
		}
		return l;
	}

	// Driver Code
	public static void main(String args[])
	{
		int arr[] = { 0,1,2,3,4,5,23,56,6,5,4,3,2,1 };
		int n = arr.length;
		int ans= findPeak(arr, n);
		System.out.println(ans);
		int ans2 =secondmothod(arr,n);
		System.out.println(ans2);

		int ans3=findPea(arr, n);
		System.out.println(ans2);
	}

	static int findPea (int arr[], int n)
    {
        int l = 0;
        int r = n-1;
        int mid = 0;
       
        while (l <= r) {
 
            // finding mid by binary right shifting.
            mid = l+(r-l)/2;
 
            // first case if mid is the answer
            if ((mid == 0
                 || arr[mid - 1] <= arr[mid])
                        && (mid == n - 1
                            || arr[mid + 1] <= arr[mid]))
                break;
 
            // move the right pointer
            if (mid > 0 && arr[mid - 1] > arr[mid])
                r = mid - 1;
 
            // move the left pointer
            else
                l = mid + 1;
        }
       
        return mid;
    }
 

}
