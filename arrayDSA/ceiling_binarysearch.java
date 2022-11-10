package arrayDSA;
public class ceiling_binarysearch {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66};
        int targe=88;
        int ans=ceiling(arr, targe);
        System.out.println(ans);
    }


    static int ceiling(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        if (target>arr.length-1) {
            return -1;
            
        }
        while(start<=end){
            int mid= start +(end-start)/2;

            if (arr[mid]<target) {
                start= mid+1;
            } 
            else if (arr[mid]>target){
                end= mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];

    }
}
