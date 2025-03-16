
import java.util.Scanner;


public class ShopperCalculator {

    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        String item1,item2,item3,item4,item5;
        double price1,price2,price3,price4,price5,sum;
        
        System.out.print("Enter the name of the first item you want to buy: ");
        item1 = kbd.next();
        
        System.out.print("Enter the price of the first item: R");
        price1 = kbd.nextDouble();
        
        System.out.print("Enter the name of the second item you want to buy: ");
        item2 = kbd.next();
        
        System.out.print("Enter the price of the second item: R");
        price2 = kbd.nextDouble();
        
        System.out.print("Enter the name of the third item you want to buy: ");
        item3 = kbd.next();
        
        System.out.print("Enter the price of the third item: R");
        price3 = kbd.nextDouble();
        
        System.out.print("Enter the name of the fourth item you want to buy: ");
        item4 = kbd.next();
        
        System.out.print("Enter the price of the fourth item: R");
        price4 = kbd.nextDouble();
        
        System.out.print("Enter the name of the fifth item you want to buy: ");
        item5 = kbd.next();
        
        System.out.print("Enter the price of the fifth item: R");
        price5 = kbd.nextDouble();
        
        System.out.println("===================================================");
        System.out.println("You have selected to buy the following items:");
        System.out.println("---------------------------------------------------");
        
        System.out.println("Item: " + item1 + " at R" + price1);
        System.out.println("Item: " + item2 + " at R" + price2);
        System.out.println("Item: " + item3 + " at R" + price3);
        System.out.println("Item: " + item4 + " at R" + price4);
        System.out.println("Item: " + item5 + " at R" + price5);
        
        System.out.println("---------------------------------------------------");
        
        
        sum = price1 + price2 + price3 + price4 + price5;
                
        System.out.println("Total for all items: R" + sum);
    }
    
}
