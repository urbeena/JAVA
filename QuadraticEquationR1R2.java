import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquationR1R2 {
    public static void main(String []args){
        double root1, root2;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of a, b, c");
        double a =sc.nextDouble();
        double b=sc.nextDouble();
        double c =sc.nextDouble();
        
          // d  is for discriminant
       double d =(b*b)-(4*a*c);
        if (d==0)
        {
            System.out.println("roots are real and equal");
            root1 = root2= -b / (2*a);
            System.out.println("root1 = "+root1+"\nroot2 = "+root2);
        }
        else if( d>0)
        {
            System.out.println("roots are real and distinct");
            root1= (-b + Math.sqrt(d))/ (2*a);
            root2= (-b - Math.sqrt(d))/ (2*a);
            System.out.println("root1 ="+root1 +"\nroot2 ="+root2);
        }
        else if(d<0)
        {
            System.out.println("roots are disrinct and imagenery");
            root1= -b/(2*a);
            root2 = Math.sqrt(-d)/(2*a);
            System.out.println("root1 ="+root1+ "i" +root2);
            System.out.println("root1 ="+root1+ "-i" +root2);
        }

        
    }
    }
    
    

