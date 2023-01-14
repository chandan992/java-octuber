package thread_lession;

import java.util.ArrayList;

public class recursion2 {
    public static void main(String[] args) {
    
        int arr[]={3,18,1,18,19};
        int target=18;
        int target2=19;
        boolean ans= findsort(arr, target, 0);
        System.out.println(ans);
        System.out.println( sort(arr, target, target2,0, new ArrayList<>()));

    }
    static boolean findsort(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }

        return  arr[index]==target  || findsort(arr, target, index+1);
        

    }

    static ArrayList<Integer> sort(int arr[],int target,int target2,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        if (arr[index]==target2) {
            list.add(index);
        }

            return sort(arr, target,target2, index+1,list);
    
        

    }
}
