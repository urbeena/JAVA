//ploymerpism or function overridding
import java.util.*;
public class overloadfn{
    static void add(int a ,int b) // created  a fn 
    {
        System.out.print(a*b);
    }
    static void add(float a, float b) //created another fn with same name
    {
        System.out.print(a-b);
    }


     
    public static void main(String []args){
        overloadfn obj1 = new  overloadfn();
        int a = 2;
        int b = 11;
        float c = 81.5f;
        float d= 2.0f;
        add(a,b);  /// call function 1 by integer values 
        System.out.print("\n");
        add(c,d); /// call function by float values
        

    }
    
}
