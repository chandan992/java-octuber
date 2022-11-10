package arrayDSA;

public class min_mix_array {
    public static void main(String[] args) {
// creating a array and it's object and initialising it's value
        int arr[]={18,52,16,88,55,32};

       int actual= min(arr); //called method and pass to the actual integer
       int sec=second(arr);
       System.out.println(actual);// printing the result
        System.out.println("second max value  :"+sec);
    }

    static int min(int arr[]){// it's method and it's paramiter
        int min= arr[0];// starting with zero
        for (int i = 0; i < arr.length; i++) { // starting with one
            if (arr[i]<min) // if you change arr[i]<min to arr[i]>min so it's
                            // it's gona give you higher value
            {     
                min=arr[i]; // if condition is true then pass the value of arr into min
                
            }
        }
        return min; // returning the min in the main class
    }

// find second mix value in the array

       static int second(int arr[])
    {
        int secondmax=arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<secondmax) {
                secondmax=arr[i];               
            }
        }
        return secondmax;
    }



}
