package java_challenges;

import java.util.ArrayList;
import java.util.List;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int number = 123458867;

        int even = 0;
        int odd = 0;
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        while (number>0){
            int rem = number%10;

            if(rem%2 ==0){
                evenNumbers.add(rem);
                even++;
            }else {
                oddNumbers.add(rem);
                odd++;
            }
            number = number/10;
        }

        System.out.println("even number : " + evenNumbers);
        System.out.println("odd number : " + oddNumbers);
        System.out.println("count of even number --> " + even);
        System.out.println("count of odd number --> " + odd);
    }
}
