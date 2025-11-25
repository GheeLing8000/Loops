import java.util.Scanner;

public class ComputeTotalCost {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of product: $");
        double doubleProduct = input.nextDouble();
        System.out.println("You entered the price: " + "$" + doubleProduct);
        System.out.print("Enter the percentage of sales tax: ");
        double doubletax = input.nextDouble();
        System.out.println("You entered the sales tax: "  +doubletax + "%");
        double doubleTotalCost = (1 + doubletax/100) * doubleProduct;
        System.out.println("Total cost of product inclusive of sales tax is " +"$"+doubleTotalCost);
    }
}
