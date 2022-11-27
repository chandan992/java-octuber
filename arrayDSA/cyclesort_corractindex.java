package arrayDSA;
public class cyclesort_corractindex {
    public static void main(String[] args) {
        int arr[]={7,6,5,4,3,2,1};
        int i=0;
        int n=arr.length;
        System.out.println("the size of array   "+n);
        while(i<arr.length){
        
            int correct=arr[i];
            
                if(arr[i]<arr.length && arr[i]!=arr[correct]){
                    swip(arr, i, correct);
                }

                
                else{
                
                
                    i++;
                }
        }

        
        
        for (int j = 0; j < arr.length  ; j++) {
            System.out.println(arr[j]+" "+j);
            if (j != arr[j]) {
                System.out.println("valueis messing at " +j);
            }
    
        }
        

    }
    static void swip(int arr[],int first,int second){
         int item=arr[first];
        arr[first]=arr[second];
        arr[second]=item;

    }
}
