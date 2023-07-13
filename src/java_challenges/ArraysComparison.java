package java_challenges;

public class ArraysComparison {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        int[] b = {1,2,3,4,5};
        boolean status = true;

        if(a.length == b.length){

            for (int i=0; i< a.length;i++){
                if(a[i] != b[i]){
                    status=false;
                }
            }
        }else {
            status=false;
        }

        if(status == true){
            System.out.println("the two arrays are equal");
        }else {
            System.out.println("the two arrays are not equal");
        }

    }
}
