package arrayDSA;

public class min_mix_array {
    public static void main(String[] args) {
// creating a array and it's object and initialising it's value
        int arr[]={12,52,16,88,55,32};

       int actual= min(arr); //called method and pass to the actual integer
       System.out.println(actual);// printing the result
    }

    static int min(int arr[]){// it's method and it's paramiter
        int min= arr[0];// starting with zero 
        for (int i = 1; i < arr.length; i++) { // starting with one
            if (arr[i]<min) // if you change arr[i]<min to arr[i]>min so it's
                            // it's gona give you higher value
            {     
                min=arr[i]; // if condition is true then pass the value of arr into min
                
            }
        }
        return min; // returning the min in the main class
    }
}
