
import java.util.*;
public class fibnacci {
    public static void main( String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int j= sc.nextInt();
int a =0;
int b =1;
int c;
for (int i=2; i<=j;i++)
{
    c= a+b;
    System.out.println(c);
    a=b;
    b=c;
}
    }
}
