
import java.util.*;

public class pattern1 {

    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            sc.close();
        }
}

// import java.util.*;
// class demo

// {
// public static void main(String[] abc)
// {
// int a,b,c;
// System.out.println("Enter number:");
// Scanner sc=new Scanner(System.in);
// a=sc.nextInt();
// b=sc.nextInt();
// c=sc.nextInt();
// System.out.println("Addition is:"+(a+b-c));
// }
// }