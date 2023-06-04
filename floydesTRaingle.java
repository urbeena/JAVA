import java.util.*;
public class floydesTRaingle {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of rows");
    int n= sc.nextInt();
    
    int i,j;
    int x=1;
    for(i= 1; i<=n; i++)
    {
        for(j=1;j<=i; j++){
            System.out.format("%d ",x );
            x++;
        }
        System.out.print("\n");
    }

    
}
}
