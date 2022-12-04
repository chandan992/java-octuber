package string;
public class ispalindrom {
    public static void main(String[] args) {


        int arr[]={121,441,55};




        for (int i = 0; i < arr.length; i++) {
            String name=""+arr[i];
            System.out.println(name);
            for (int j = 0; j < name.length()/2; j++) {
                int start=name.charAt(j);
                int end= name.charAt(name.length()-1-j);
                if(start!=end){
                    System.out.println("not palindrom");
                }else
                    System.out.println("palindrom");
            }
        
        }


        String firs= "helllleh";
    boolean ans=    findpalidrom(firs);
        System.out.println(ans);
    }
    static boolean findpalidrom(String firs){
        if (firs==null) {
           return true; 
        }
        
        for (int i = 0; i < firs.length()/2; i++) {
            int start=firs.charAt(i);
            int end= firs.charAt(firs.length()-1-i);
            if(start!= end){
                return false;
            }
        }
        return true;
    }
}
