package arrayDSA;
    class Solution {
        public static void main(String[] args) {
            
            int nums[]={1};
           int ans= missing(nums);
           System.out.println(ans);
            System.out.println(nums.length);
        }


    static int missing(int nums[]){
              int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]>0 && nums[i]<nums.length && nums[i]!= nums[correct]){
                    swap(nums,i,correct);
                }
                else{i++;}
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!= (j+1)){
                    return j+1;
                }
            }
            return nums.length+1;
        
        }
    
     public   static void swap(int nums[],int first,int second){
            int item =nums[first];
        nums[first]=nums[second];
        nums[second]=item;
        }
    
    }

