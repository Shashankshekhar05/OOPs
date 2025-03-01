package Inheritance;

class parent {
    int age=40;
    String voice="soft";

    void vocalcode(){
        System.out.println("loud vocal code");
    }

}
class child extends parent{
     void voice(){
         System.out.println("soft vocal code ");
     }
}
public class singleInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.vocalcode();

    }
}
