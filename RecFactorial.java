import java.util.*;
public class RecFactorial {
     static int Factorial(int n){
          if(n==0 || n ==1)
          return 1;
          else return n* Factorial(n-1);
    }
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the NUMBER");
 int n = sc.nextInt();
 int f = Factorial(n);
 System.out.print("the factorial is" +f);
    }
}
