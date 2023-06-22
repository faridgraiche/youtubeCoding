package java_challenges;

public class MaxValue {
    public static void main(String[] args) {
        int[] number = {12,431,213432,32321};
//        int max = Integer.MIN_VALUE;
//        for(int i:number){
//            if (max<i){
//                max =i;
//            }
//        }
//        System.out.println(max);


        int max  =number[0];
        for(int i =1; i<number.length; i++){
            if(max<number[i]){
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
