
import java.util.*;
public class xlyingtable {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int i;
        for(i =1; i<=10; i++){
            System.out.format("%d *%d =%d \n",n,i, n*i);
        }
    }
}
