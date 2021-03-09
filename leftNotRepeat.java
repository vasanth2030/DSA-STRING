package Strings;
import java.util.*;
public class leftNotRepeat {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println(leftnotrepeat(s1));

    }
    static int leftnotrepeat(String s)
    {
        char s1[]=s.toCharArray();
        int firstIndex[]= new int[256];
        Arrays.fill(firstIndex,-1);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<s1.length;i++)
        {
            if(firstIndex[s1[i]]==-1)
                firstIndex[s1[i]]=i;
            else
                firstIndex[s1[i]]=-2;
        }
        for(int i=0;i<256;i++)
        {
            if(firstIndex[i]>=0)
                res= min(res,firstIndex[i]);
        }
        if(res==Integer.MAX_VALUE)
            return -1;
        else return res;

    }
    static int min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
}
