package java_challenges;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number =-11;
        int count=0;

        if(number>0){
            for (int i=1;i<=number;i++){
                if (number%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("the number is prime");
            }else{
                System.out.println("the number is not prime");
            }
        }else{
            System.out.println("the number provided is negative");
        }
    }
}
