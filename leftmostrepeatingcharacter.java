package Strings;
import java.util.*;
public class leftmostrepeatingcharacter {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println(leftmost(s1));

    }
    static int leftmost(String s)
    {
        int res=Integer.MAX_VALUE;
        int firstIndex[]=new int[256];
        Arrays.fill(firstIndex,-1);
        char s1[]=s.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
            if(firstIndex[s1[i]]==-1)
                firstIndex[s1[i]]=i;
            else
                res= min(res,firstIndex[s1[i]]);
        }
        if(res==Integer.MAX_VALUE)
            return -1;
        else
            return res;
    }
    static int min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
}
