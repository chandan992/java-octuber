package arrayDSA;

import java.util.Arrays;

public class less_or_equal {
    public static void main(String[] args) {
        int arr[]={21,33,55,66,66};
        int target=55;
        int[] ans= numberoflessvalue(arr, target);
        System.out.println(Arrays.toString(args));


        // smallest or equal character in array

        int[] word ={'c','f','j'};
        char tar='e';
       char ans2= answer(word, tar);
       System.out.println(ans2);
    }


    static char answer(int[] word,char tar){
        int end = word.length-1;
        int start=0;
        while (start<=end) {
            int mid= start + (end-start)/2;
            if (word[mid]<tar) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return (char) word[start%word.length];

    }

    static int[] numberoflessvalue(int arr[],int target){
        int cout=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]<target) {
                cout++;
                
            }
        }
        return new int[] {cout,n};
    }

    
}
