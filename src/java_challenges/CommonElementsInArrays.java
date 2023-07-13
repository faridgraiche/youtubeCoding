package java_challenges;

public class CommonElementsInArrays {
    public static void main(String[] args) {


        int[] arr1 ={12,23,22,233,222};
        int[] arr2 = {12,23,222,343};

        for(int i=0; i<arr1.length;i++){
            for(int j =0; j <arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
