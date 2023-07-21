package java_challenges;

public class SunOfDigits {
    public static void main(String[] args) {
        int number = 123456;

        // sum = 15;

        int sum = 0;
        while (number>0){
            sum = sum + number%10;

            number = number/10;
        }

        System.out.println("the sum of the digits is " + sum);
    }
}
