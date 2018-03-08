package Miscellaneous;


/**
 * Created by starigopula on 2/7/2018.
 */
public class ErathosnesAlgorithm {

    public static void main(String args[]){
        int number = 10;
        ErathosnesAlgorithm e = new ErathosnesAlgorithm();
        e.printPrimeNumbers(number);
    }

    public void printPrimeNumbers(int number){

        if(number == 0 || number == 1){
            System.out.println("Invalid value");
        }

        if(number == 2){
            System.out.println(2);
        }

        boolean[] isComposite = new boolean[number+1];

        for(int j = 2 ; j <= Math.sqrt(number) ; j++){
            if(!isComposite[j]){
                for (int k = j*2 ; k <= number ; k+=j )
                    isComposite[k] = true;
            }
        }

        for(int i =2 ; i<= number ;i++){
            if(!isComposite[i])
                System.out.println(i);
        }
    }
}
