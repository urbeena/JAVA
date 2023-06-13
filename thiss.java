///usage of this keyword:
/*  if parameters and instance variables are same , we use
 * this keyword to distuinguish b/w  local variable and instance variable
 */

public class thiss {
    int  s1;
    int s2;
    int s3;

    thiss(int s1 , int s2){  ///created a constructor :note: keep name szame as classname
        this.s1= s1;
        this.s2 =s2;
    }
thiss(int s3){   // created another constructor 
    this.s3 = s3+1;
}

    public static void main(String [] args)
    {
thiss obj1 = new thiss( 1 );  //create object and passs parameters  here it will invoke constructor 2

System.out.print(obj1.s1 +"\n");
System.out.print(obj1.s2 +"\n");
System.out.print(obj1.s3);

    }
}
