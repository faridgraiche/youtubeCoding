package java_challenges;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//        String str1 = "marr";
//        String str2 = "army";
//
//        if(str1.length() != str2.length()){
//            System.out.println("the strings have a different length");
//
//        }else {
//            char[] char1 =str1.toCharArray();
//            char[] char2 = str2.toCharArray();
//
//            Arrays.sort(char1);
//            Arrays.sort(char2);
//
//
//            if(Arrays.equals(char1,char2)){
//                System.out.println("the two strings are anagram");
//            }else {
//                System.out.println("the two strings are not anagram");
//            }
//        }


        String str1 = "army";
        String str2 = "mary";

        char temp1;
        char temp2;

        if(str1.length() != str2.length()){
            System.out.println("the two strings have different length");

        }else {

            char[] char1=str1.toCharArray();
            char[] char2 =str2.toCharArray();

            for(int i=0;i<char1.length;i++){
                for(int j=i+1;j<char1.length;j++){

                    if (char1[i]>char1[j]){
                        temp1 = char1[i];
                        char1[i] = char1[j];
                        char1[j] = temp1;
                    }
                }
            }

            for(int i=0;i<char2.length;i++){
                for(int j=i+1;j<char2.length;j++){

                    if (char2[i]>char2[j]){
                        temp2 = char2[i];
                        char2[i] = char2[j];
                        char2[j] = temp2;
                    }
                }
            }

            if (Arrays.equals(char1,char2)){
                System.out.println("the string are anagram");
            }else {
                System.out.println("the string provided are not anagram");
            }
        }

    }
}
