//composition refers to "has-a" relationship in which one class contains reference to another class
class Engine{
    public void start(){
        System.out.println("Engine has Started");
    }
}

class Car{
    Engine E1; // car Has-a Engine
    Car(){
        E1 = new Engine();
    }
    public void start(){
        E1.start();
        System.out.println("Car is Running");
    }
}
// Example of Aggregation
class Car1 {
    Engine e;
    Car1(Engine e1){ // here is object of another clas has been passed
        this.e = e1; // weak relation
    }

    public void start(){
        e.start();
        System.out.println("Car 2 is starte");
    }
}
// Aggregation - contains weak 'has-a' relation
public class Composition {
    public static void main(String []args){
        Car c1 = new Car();
        c1.start();

        // Agregation
        Engine e1 = new Engine();
        Car1 c2 = new Car1(e1);
        c2.start();
    }

}
