import java.util.ArrayList;

public class PalindromNumber9 {

    public static void main(String args[]){

        int x = -2147447412;

        if(x<0) return;

        ArrayList<Integer> digits = new ArrayList<>();

        while(x!=0){

            digits.add(x%10);

            x /= 10;
        }

        boolean flag = true;

        for(int i=0;i<digits.size();i++){

            if(digits.get(i) != digits.get(digits.size()-1-i)){
                flag=false;
                break;
            }

        }

        System.out.println(flag);

    }

}
