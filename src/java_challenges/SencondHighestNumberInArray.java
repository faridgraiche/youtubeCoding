package java_challenges;

public class SencondHighestNumberInArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3,10, 4, 6,8,12};

        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println("second highest values is "+ arr[arr.length-2]);

    }

}
