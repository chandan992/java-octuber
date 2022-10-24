package arrayDSA;




// this class name is diferent don't mind 
// this  program is to find a number is a palidrome or not ;

class find {
    public boolean isPalindrome(int x) {
        if (x<0) {
                 return false;
        }
        int temp,r,rev=0;
        temp=x;
        

        while(temp>0){
            r=temp%10;
            rev=(rev *10) +r;
            temp=temp/10;
        }
        if (rev==x) {
            return true;
            
        } else {
            return false;
        }



    }
}


public class twosum {
    public static void main(String[] args) {
    find pal=new find();
    pal.isPalindrome(121);

    




    }
}
