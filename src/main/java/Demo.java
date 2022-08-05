import java.util.*;

public class Demo {

    public static void main(String[] args) {

        String s="I am leaving in Delhi";

        String s1[]=s.split("");
        String s2="";
        for(int i=0;i<s1.length; i++) {
            s2+= reverse(s1[i])+" ";
        }
        System.out.println(s2);
    }

    private static String reverse(String s) {
        String s2="";
        for (int i=s.length()-1; i>=0; i--)
        {
            s2=s.charAt(i)+s2;
        }
        return s2;
    }

}
