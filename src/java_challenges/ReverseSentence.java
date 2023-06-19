package java_challenges;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "welcome to my channel";
        String[]str1 = str.split(" ");
        String rev = "";

        for(int i=str1.length-1;i>=0;i--){
            rev = rev +str1[i]+" ";
        }
        System.out.println(rev);
    }
}
