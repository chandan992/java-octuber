package arrayDSA;
public class second_mix {
    public static void main(String[] args) {
        int[] arr={10,20};
        int first=Integer.MIN_VALUE;
        int  second=Integer.MIN_VALUE;
        int three=Integer.MIN_VALUE;
        if (arr.length < 3 ) {
        System.out.println("enter more them three number");
        return;
            
        }
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>first) {
                    three=second;
                    second=first;
                    first=arr[i];
                
                    
                }
                else if (arr[i] > second && arr[i] != first)
                second = arr[i];
                else if (arr[i]>three && arr[i]!=second)
                three=arr[i];
                
            }
            System.out.println(three);
        System.out.println(second);
        System.out.println(first);
    }
}
