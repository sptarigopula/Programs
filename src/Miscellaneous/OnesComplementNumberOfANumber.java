package Miscellaneous;

/**
 * Created by starigopula on 2/1/2018.
 */
public class OnesComplementNumberOfANumber {

    public static void main(String args[]){
        int number = 100;

        OnesComplementNumberOfANumber o = new OnesComplementNumberOfANumber();
        int numCompliment = o.getTheComplement(number);
        System.out.println(numCompliment);

    }

    public int getTheComplement(int number) {

        StringBuilder sb = new StringBuilder();

        while(number != 0) {
            int x = number % 2;
            number = number / 2;
            sb.append(x);
        }

        System.out.println("Binary number :" +sb);


        for(int i =0 ; i <= sb.length()-1; i++){
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i,'1');
            }else {
                sb.setCharAt(i, '0');
            }
        }

        System.out.println("Complement number :" +sb);

        int index = sb.length()-1;
        int value=0;

        for(int i = 0 ; i<= sb.length()-1;i++){
             value =  (int)Math.pow(2,index) *  Character.getNumericValue(sb.charAt(i)) + value;
             index--;
        }

        return value;
    }
}
