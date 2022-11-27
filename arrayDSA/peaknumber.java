package arrayDSA;

import java.util.Arrays;

class peaknumber{
	public static void main(String[] args) {
		int arr[][]={{10,20,30,40},
					 {13,44,66,77},
					 {28,29,37,49}
					 
					};
		int target=28;
		int[] ans=twoDarray(arr, target);
		System.out.println(Arrays.toString(ans));
			}
	
	static int[] twoDarray(int arr[][],int target){
		int r=0;
		int c=arr.length;
		while(r < arr.length && c>=0 ){
			if(arr[r][c]==target){
				return new int[]{r,c};
			}
			if (arr[r][c]<target) {
				r++;
			}else{
				c--;
			}
		}
		return new int[]{-1,-1};
	}
	
}