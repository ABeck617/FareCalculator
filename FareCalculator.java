import java.util.Scanner;


public class FareCalculator {
    public static void main(String args[]){

        int age;
        double tax, standardPrice, totalPrice, totalTax;

        totalPrice = 0;
        tax = 0.13;

        System.out.println("Please enter your age: ");
        Scanner userInput = new Scanner(System.in);
        age = userInput.nextInt();

        if (age <= 10){
            standardPrice = 5.00;
            totalTax = tax * standardPrice;
            totalPrice = totalTax + standardPrice;
        }
        else if (age > 10 || age <= 18){
            standardPrice = 10.00;
            totalTax = tax * standardPrice;
            totalPrice = totalTax + standardPrice;
        }

        System.out.println(" The total price for entry to the festival is  " + totalPrice);

    }
}
