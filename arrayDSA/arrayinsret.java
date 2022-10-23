package arrayDSA;

class hello {
    int a[]={37,334,39 ,923,79};
    int min=a[0];
    void show(){
        for (int i = 1; i < a.length; i++) {
            if (min==a[i]) {
                min= a[i];
                
            }
            
        }
        System.out.println(min);
    }
}




class arrayinsret {
    public static void main(String[] args) {
    hello obj= new hello();
   obj.show();
    
    }
}
