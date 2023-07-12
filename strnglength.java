import java.util.*;
class strnglength
{
    public static void main(String ar[])
    {
        String str;
        System.out.println("Enter string:");
        Scanner sc=new  Scanner(System.in);
        str=sc.nextLine();
        int i=0;
        for(char ch:str.toCharArray())//foreach loop
        {
            System.out.println(ch);
            i++;
        }
        System.out.println("Length is:"+i);
    }
}