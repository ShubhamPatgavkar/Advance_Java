@FunctionalInterface
interface myInterface{
    void show(); // this is only one abstract method is allowed in functional interface
}
class A implements  myInterface{
    public void show(){
        System.out.println("This is the implementation of functional interface");
    }
}
public class Interfaces {
    public static void main(String args[]){
        A a1 = new A();
        a1.show();
    }
}
