package Strings;

import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the strings to check for anagram: ");
        String s1= s.nextLine();
        String s2=s.nextLine();
        if(anagram(s1,s2))
            System.out.println("It is an anagram");
        else
            System.out.println("Not anagran");

    }
    static boolean anagram(String s1,String s2)
    {
        String s3=removejunk(s1);
        String s4=removejunk(s2);
        s3=s3.toLowerCase();
        s4=s4.toLowerCase();
        s3=sort(s3);
        s4=sort(s4);
        return s3.equals(s4);

    }
    static String removejunk(String s1)
    {
        StringBuilder sb=new StringBuilder(s1.length());
        char c;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLetter(s1.charAt(i))) {
                c = s1.charAt(i);
                sb.append(c);
            }
        }
        return sb.toString();


    }
    static String sort(String s1)
    {
        char[] s2=s1.toCharArray();
        java.util.Arrays.sort(s2);
        return new String(s2);

    }
}
