import java.util.*;
/*
 * @author Sarthak Goyal
 */

public class isogram {
    public static boolean isogram(String str)
    {
        int flag=0;
        char arr[]=str.toCharArray();
        int len=arr.length;
        int arr1[]=new int[1000];
        for(int i=0;i<len;i++)
        {
            arr1[arr[i]]=arr1[arr[i]]+1;
        }
        for(int i=0;i<len;i++)
        {
            if(arr1[arr[i]]==1)
            {
                flag=1;
            }
            else{
               
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        if(isogram(s))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
