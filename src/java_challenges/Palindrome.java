package java_challenges;

public class Palindrome {
    public static void main(String[] args) {
        String str ="maw";
        String rev ="";

        for(int i=str.length()-1;i>=0;i--){
            rev =rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("the string is palindrome");
        }else {
            System.out.println("the string is not palindrome");
        }
    }
}
