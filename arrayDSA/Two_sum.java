package arrayDSA;

import java.util.Arrays;


public class Two_sum {
    public static void main(String[] args) {
        int n=2;
        int m=1;
        System.out.println(n);
        int nums[]={3,2,3};
        int target=6;
      int[] ans = twosum(nums, target);
      System.out.println(Arrays.toString(ans));
        
    }
    static int[] twosum(int nums[],int target){
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        
        
        return new int[]{-1,-1};
    }
}
