/// function overridding  :- it will print the values of the 1st function 
public class MethodOverridding {  ///parent class
    int mobile;
    String name;

     void dispaly() {
        System.out.print("  my name is: "+ name);
     }
    }
class point3D extends MethodOverridding{ /// child class
     String z; 
void display(){
   
    System.out.print("i live at:" +z );
}
}


    class simpleclass{
        public static void main(String args[]){
   MethodOverridding p1 = new MethodOverridding();///created object for superclass
    point3D p2 = new point3D(); // created object for subclass;
    p1.mobile =60006;
    p1.name = "urbeena rashid";
    p2.z = "ganderbal";
    p2.dispaly();
        }
    }
