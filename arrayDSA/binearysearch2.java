package arrayDSA;

import java.util.Arrays;

public class binearysearch2 {
    /*package whatever //do not write package name here */

	public static void main (String[] args) {
        
        int v[]={6,5,4,3,2,1};
        /* List<ArrayList<Integer>> v = new ArrayList<>();
        v.add(new ArrayList<Integer>(Arrays.asList( 1, 3, 4, 5, 6 )));*/
        int target = 2;
        binarySearch(v, target);
        target = 5;
        binarySearch(v, target);
        target = 10;
        binarySearch(v, target);
        Arrays.sort(v);
        for (int i = 0; i < v.length; i++) {
         System.out.print(v[i]);
        }
	}
    static void binarySearch(int v[], int target)
    {
        int start=0; int end=v.length-1;

        while(end-start>1){
            int mid=start + (end-start)/2;
            if (v[mid]>target) {
                start=mid+1;
            } else {
                end=mid;
            }
        }
        if (v[start]==target) {
            System.out.println("you element is found index of  :"+start);
            
        }
        else if(v[end]==target){
            System.out.println("you element is found index of :"+end);
        }
        else{
            System.out.println("Not founded");
        }
    }
    
    
    // contributed by akashish__
}


