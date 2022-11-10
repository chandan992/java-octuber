package arrayDSA;


public class short1 {
    public static void main(String[] args) {

    int[][] arr={{3,8,5},
                {3,6,4},
                {3,7,4}};

       int finalans= maxvalue(arr);
       System.out.println(finalans);

    }
    static int maxvalue(int[][] arr){
       
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum= sum + arr[i][j];
            }
            if (sum>ans) {
                ans=sum;
            }
        }
        return ans;
    }
    }

