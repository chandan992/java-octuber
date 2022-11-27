package arrayDSA;
import java.util.ArrayList;
import java.util.List;

class cycle_missing_number{
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        int i=0;
        while (i<arr.length) {
            int correct = arr[i]-1;
            if ( arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans= new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
            if ((j+1) != arr[j]) {
                ans.add(j+1);
            }
        }
        System.out.println(ans);
    }

    static void swap(int arr[],int first,int second){
        int item=arr[first];
        arr[first]=arr[second];
        arr[second]=item;
    }
}