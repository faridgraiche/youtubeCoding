package java_challenges;

public class ReverseString {
    public static void main(String[] args) {
//        String str = "Hello";
//        String rev ="";
//
//        for(int i=str.length()-1;i>=0;i--){
//            rev = rev + str.charAt(i);
//        }
//
//        System.out.println(rev);



        String str = "JAVA";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}
