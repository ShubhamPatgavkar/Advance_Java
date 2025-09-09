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


        // rather than implementing the interface in the class we can use the lamda expression to implement the show method
        // we don't need to specify the name of the method since the functional interface has only one abstract method
        myInterface b1 = () -> System.out.println("This is Lamda function Implementation");
        // this technique avoid to implement the interface in the class
        b1.show();
    }


}
