package TwoPointers;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1="aman";
        String s2="naam";
        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s,String t){
        boolean flag=false;
        char[] char1=s.toCharArray();
        Arrays.sort(char1);
        char[] char2=t.toCharArray();
        Arrays.sort(char2);
        String sort1=String.valueOf(char1);
        String sort2=String.valueOf(char2);
            if (sort1.equals(sort2)) {
                flag=true;
            }
        return flag;
    }
}
