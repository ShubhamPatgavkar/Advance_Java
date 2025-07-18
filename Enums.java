
import java.util.*;

enum status{
    Starting(),Running(), Pending(),Success(),setPrice(550);
    private status(){

    }


    // we can create the constructer intialize the variable value and create methods
    private int price;
    private status(int price){
        this.price = price;
    }
    public int getPrice(){
        return setPrice.price;
    }
}


public class Enums {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        status s = status.Pending;
        int num;

        while(s != status.Success){
            System.out.println("Enter for the status");
            num = sc.nextInt();
            s = (num == 1)? status.Starting: (num == 2)? status.Running: (num == 3)? status.Pending : status.Success;

            switch(s){
                case Starting:
                    System.out.println("Your process has been initialised");
                    break;
                case Running:
                    System.out.println("Your process is running healthy");
                    break;
                case Pending:
                    System.out.println("Wait your process will start in few seconds");
                    break;
                default:
                    System.out.println("Proccess is completed");
                    break;
            }
        }

        // using the enum methods
        System.out.println(s.getPrice());



    }
}
