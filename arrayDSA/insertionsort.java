package arrayDSA;
public class insertionsort {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j >0; j--) {
            if (arr[j]< arr[j-1]) {
                swapp(arr, j, j-1);
            }
            
        }
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"  ");
       }
    }
    static void swapp(int arr[],int first,int second){
        int item=arr[first];
        arr[first]=arr[second];
        arr[second]=item;
    }
}
