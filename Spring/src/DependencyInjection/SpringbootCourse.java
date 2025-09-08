package DependencyInjection;

public class SpringbootCourse implements Icourse {
    @Override
    public void getPrice(int price){
        System.out.println("The Price of the Spring Course is : "+price);
    }
}
