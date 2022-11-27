package arrayDSA;
public class find_same_int_array_using_cycle {
    public static void main(String[] args) {
        int arr[]={6,1,2,3,4,3,2,7};      //creating an array
        int i=0;                        //star of array


        while (i<arr.length) {              // loop stop and run 

            if(arr[i]!= (i+1)){
                    int correct=arr[i]-1;

                    if (arr[i]!=arr[correct]) {

                        int item=arr[i];
                        arr[i]=arr[correct];
                        arr[correct]=item;
                    } else {
                            System.out.println("dublicate  "+arr[i]);
                            break;
                    }
            }else{
                i++;
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] +"  ");
            }
            System.out.println();
        }



        // if two or more value is same or dublicate in array

        while (i<arr.length) {              // loop stop and run 

    
                    int correct=arr[i]-1;

                    if (arr[i]!=arr[correct]) {

                        int item=arr[i];
                        arr[i]=arr[correct];
                        arr[correct]=item;
                    } 
                    else{
                            i++;
                    }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] +"  ");
            }
            System.out.println();
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j+1){
                System.out.println("dublicate "+arr[j]);
            }
        }

    }
}
