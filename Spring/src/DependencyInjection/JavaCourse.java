package DependencyInjection;

public class JavaCourse implements Icourse{
    @Override
    public void getPrice(int price){
        System.out.println("The Price of the JavaCourse is "+ price);
    }

}

