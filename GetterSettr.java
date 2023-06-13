public class GetterSettr {
    int roll;  //crated 2 varisbles in claa gettersettr
    String name;
    public void setname(String n) //created a setr fn paased an argument to it
    {
        name =n;
    }
    public String getname()
    {
        return name;
    }

    public static void main(String []args){
GetterSettr g1 =new GetterSettr();
g1.name ="urbeena rashid";
System.out.print(g1.getname());

    }
}
