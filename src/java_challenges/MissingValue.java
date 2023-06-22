package java_challenges;

public class MissingValue {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,10};
        int sum1 = 0;

        for(int i=0; i<numbers.length;i++){
            sum1=sum1+numbers[i];
        }



        int max =numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (max<numbers[i]){
                max=numbers[i];
            }
        }



        int sum2 = 0;

        for(int i=1;i<=max;i++){
            sum2 = sum2+i;
        }
        System.out.println("the missing number --> "+ (sum2-sum1));
    }
}
