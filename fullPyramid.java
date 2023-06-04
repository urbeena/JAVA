public class fullPyramid {
    public static void main(String [] args) {
        int i,j,k;
        for (i=1; i<=6;i++)//declaring the outer loop for no of rows
        {
            for(j=6;j>i;j--)  //will print the left side space
              
              {
             System.out.print(" ");
            }
            for(k=1; k<=i;k++)  /// it will print *, right and left side space
            {
            System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
}
