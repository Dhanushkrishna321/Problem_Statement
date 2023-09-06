import java.util.Random;

public class Employee {

    int wageperhour = 125;
    int Fullday = 8;
    int Parttime = 4;

    int Totaldays = 26;

    int payment(int days)
    {
        int amount = days * Fullday * wageperhour;
        System.out.println(amount);
        return 0;
    }
    int PaymentforParttime(int days){
        int amount = days * Parttime * wageperhour;
        System.out.println(amount);
        return 0;
    }

    int Month(){
        int amount = wageperhour * Fullday * Totaldays;
        return amount;

    }

    int Numofdays(int days){
         if (days >= 25){
             int amount = days * wageperhour * Fullday;
             System.out.println(amount);
         }
         else {
             System.out.println("employee not working for 25 days");
         }
         return 0;
    }




}
