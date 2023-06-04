import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows");
        int rows = sc.nextInt();
        
        int i,j;
        for(i=rows ; i>=1;i--){
            for(j=1; j<=i;++j){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
