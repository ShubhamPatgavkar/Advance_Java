package DependencyInjection;


// this class contains the weak has-a relation with the Icourse (aggregation)
public class Temp {
    private Icourse course;

    // setter
    public void setCourse(Icourse obj){
        this.course = obj;
    }

    // through constructor
    public Temp(Icourse obj){
        this.course = obj;
    }

    public void getTheCoursePrice(int price){
         course.getPrice(price);
    }
}
