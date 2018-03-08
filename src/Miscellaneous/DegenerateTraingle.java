package Miscellaneous;

/**
 * Created by starigopula on 2/1/2018.
 */
public class DegenerateTraingle {

    public static void main(String args[]){
         int side1 = 1;
         int side2 = 2;
         int side3 = 5;

         DegenerateTraingle d = new DegenerateTraingle();

         System.out.print(d.isDegenerate(side1 , side2 , side3 ));
    }

    public boolean isDegenerate(int a , int b , int c){

        int x = Math.max(a,Math.max(b,c));
        int y = Math.min(a,Math.min(b,c));
        int mid = (a+b+c)-(x+y);

        if(mid+y>x){
            return true;
        }
        return false;
    }
}
