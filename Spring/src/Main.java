import DependencyInjection.JavaCourse;
import DependencyInjection.SpringbootCourse;
import DependencyInjection.Temp;

public class Main {
    public static void main(String[] args) {
        // injecting the Dependent Object(java...) in the target class Temp through the constructor
        Temp t1 = new Temp(new JavaCourse());

        // Injecting the Dependent object in the target class Temp through the setter
        t1.setCourse(new SpringbootCourse());

        t1.getTheCoursePrice(500);

        // here the temp class is loosely coupled with the javaCourse and SpringCourse Class



    }
}