public class inheritence   //created a super class
  {
    int mobile;
    String name;
    void read(int m,String n) // added a function to it
    {
        mobile =m;
        name = n;
    }
    void display() //added another function to print data
    {
        System.out.print("mobile number is : "+mobile +"\n name is:"+ name);
        System.out.print("\n");
    }
}
class  student extends  inheritence  // added a subclass
{
String dept;
int rollno;
 
void printndat() /// adde fn to print data
{
    display();
    System.out.print("rollno is: "+rollno+ "\ndept is: "+ dept);
}
}
class inhert{
    public static void main(String[] args) {
        inheritence s = new inheritence(); //created a object for subclass1
        s.read(1234, "abc ");
        s.display();
        student s2 = new student();  // created a object for subclas2
        s2.dept = "btech cse";
        s2.rollno = 55;
        s2.printndat();
    }
}
    
