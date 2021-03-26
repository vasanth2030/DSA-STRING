package Strings;
import com.sun.deploy.security.SelectableSecurityManager;
import java.util.*;
import java.util.Scanner;
public class anagram1 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter second string");
        String s2=s.nextLine();
        if (anagramornot(s1,s2))
             System.out.println("Yes");
        else
        System.out.println("No");
    }
    static boolean anagramornot(String s1, String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        int count[]=new int[26];
        char[] s1a =s1.toCharArray();
        char[] s2a=s2.toCharArray();
        for(int i=0;i<s1a.length;i++)
        {
            count[s1a[i]-'a']++;
        }
        for(int i=0;i<s2a.length;i++)
        {
            count[s2a[i]-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}
