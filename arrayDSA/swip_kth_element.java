package arrayDSA;
public class swip_kth_element {
    public static void main(String[] args) {
        int arr[]={5,3,6,1,2};

        int k=2;
        int last=arr.length-k;
        int item=arr[k-1];
        arr[k-1]=arr[last];
        arr[last]=item;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  "+arr[i]);
        }
    }
}
