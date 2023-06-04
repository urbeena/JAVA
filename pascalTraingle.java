import java.util.*;
public class pascalTraingle {
    public static void main(String []args){
        
        int i, j, k,c =1;
        int n=5;
        ///outer loop for rows
 for(i=0; i<n;i++){
// it will print spaces
for(j=1; j<=n-i;j++)
{
    System.out.print(" ");
}
//will print value of  rest of the traingle
for(k=0; k<=i;k++){
    if(i==0 || k==0)
    {
        c = 1;
    }
    
   else 
    {
        c = c*(i-k+1)/k;   
    }
 
    System.out.format("%d ",c );


        }
        System.out.println("\n");

    }
}
}
