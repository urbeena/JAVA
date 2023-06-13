public class superr {
    int x =5;
}
class sub extends superr{
    int x= 10;
    void print()
    {
        System.out.print(x); //prints value of subclass
        System.out.print("\n");
        System.out.print(super.x); //prints value of superclass
    }
}
class Main{
    public static void main(String[] args) {
        sub s =new sub();
        s.print();
}
}

    
