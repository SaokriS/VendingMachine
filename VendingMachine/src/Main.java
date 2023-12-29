import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int twixPrice = 50;
       int milkywayPrice = 45;
       int cokePrice = 75;
       int nutellaPrice = 150;

       boolean isCanBuy = false;

        System.out.println("Внесите деньги: ");
       int moneyAmount = new Scanner(System.in).nextInt();

       if (moneyAmount >= nutellaPrice) {
           System.out.println("Вы можете приобрести: " + "\n Nutella \n Цена - " + nutellaPrice + " руб.");
           isCanBuy = true;
       }
        if (moneyAmount >= cokePrice ) {
               System.out.println("Вы можете приобрести: " + "\n Coke \n Цена - " + cokePrice + " руб." );
            isCanBuy = true;
       }
       if (moneyAmount >= twixPrice) {
           System.out.println("Вы можете приобрести: " + "\n Twix \n Цена - " + twixPrice + " руб." );
           isCanBuy = true;
       }
       if (moneyAmount >= milkywayPrice)  {
           System.out.println("Вы можете приобрести: " + "\n Milkyway \n Цена - " + milkywayPrice + " руб.");
           isCanBuy = true;
       }
       if (isCanBuy)  {
               System.out.println("К сожалению у вас недостаточно денег!");

           }
    }
}