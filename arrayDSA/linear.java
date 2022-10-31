package arrayDSA;

import java.util.Arrays;

public class linear {
    public static void main(String[] args) {

// using a string we write a world and we are checking it's world using a char 
//in the boolean form it's tells the program whether the character is exist in the word
// or not
        String m= "chandan";
        char tar='n';
        boolean hell=word(m, tar);
        System.out.println(hell);
        System.out.println(Arrays.toString(m.toCharArray()));
        

// Integer in array and find the target in the array if target is exist then print, if not thrget
// is not exist the give a output massage the target is not present is array or -1  ;
        int arr[]={45,78,4,3,88,76};
        int target=45;

       int ans= search(arr, target,1,3);
       System.out.println(ans);
    }



    static boolean word(String str, int tar){  // define the method and pass it's parameter
            if (str.length()==0) {  //check the condition is zero 
                return false;     // return false is condition is match
            }
            for (char ch : str.toCharArray()) {
                if (ch==tar) {    // check the targer is ablable or not
                    
                    return true;      // if ablable then reutrn true
                }
            }

            return false;    // if not then return false
    }


// same as string 
    static int search(int [] arr, int target,int state,int end){
        if (arr.length==0) {
            return -1;
            
        }

        for (int index = state; index < end; index++) {

    
            if (arr[index]==target) {
                System.out.println("This is a index of array");
                return index;
            
            }
        }
    return -1;

    }







}
