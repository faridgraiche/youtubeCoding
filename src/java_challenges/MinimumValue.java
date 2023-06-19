package java_challenges;

public class MinimumValue {
    public static void main(String[] args) {
//        int[]arr ={12,32,4,32,22};
//        int lowest = Integer.MAX_VALUE;
//        for(int i:arr){
//            if (lowest>i){
//                lowest=i;
//            }
//        }
//        System.out.println(lowest);


        int [] arr ={323,21,232,12};
        int lowest = arr[0];

        for (int i=1;i<arr.length;i++){
            if (arr[i] < lowest){
                lowest=arr[i];
            }
        }
        System.out.println(lowest);
    }
}
