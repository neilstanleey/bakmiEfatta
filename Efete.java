package bakmiefata;

import java.util.Random;
import java.util.Scanner;

public class Efete {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Integer input = 0, foodPrice = 0, quantity = 0, paymentPoint = 0, i = 0, money = 0;
		String customerName = "", foodName = "", paymentMethod = "", billID = "BI";
		Double totalDiscount = 0.0, totalPrice = 0.0, change = 0.0;
		Random random = new Random();
		
		do {
			System.out.println("Bakmi eFeTe");
			System.out.println("===========");
			System.out.println("1. Order Menu");
			System.out.println("2. Exit");
			System.out.print(">> ");
			input = scan.nextInt();
			scan.nextLine();
			
			if (input == 1) {
				do {
					System.out.print("Input Customer Name [must be more than 5 characters] : ");
					customerName =  scan.nextLine();	
					} while (customerName.length()<= 5);
				do {
					System.out.print("Input Food Name [must either be Bakmi Keriting | Bakmi Lebar] : ");
					foodName =  scan.nextLine();
				} while (!(foodName.equals("Bakmi Keriting")||foodName.equals("Bakmi Lebar")));
				do {
					System.out.print("Input Food Price [must be more than 10000] : ");
					foodPrice =  scan.nextInt();
					scan.nextLine();
				} while(foodPrice <= 10000);
				do {
					System.out.print("Input Quantity [must be more than 0] : ");
					quantity =  scan.nextInt();
					scan.nextLine();
				}while(quantity <= 0);
				do {
					System.out.print("Input Payment Method [must either be Cash | Transfer | QRIS] : ");
					paymentMethod =  scan.nextLine();
				} while (!(paymentMethod.equals("Cash")||paymentMethod.equals("Transfer")||paymentMethod.equals("QRIS")));
				switch(paymentMethod) {
				case "Cash":
					paymentPoint = 0;
					break;
				case "Transfer":
					paymentPoint = 5;
					break;
				case "QRIS":
					paymentPoint = 10;
					break;
				}
				totalDiscount = (double)(customerName.length()+ paymentPoint);	
				totalPrice = (double)(foodPrice * quantity)*((totalDiscount/100));
	
				for (i=0;i<3;i++) {
				billID += random.nextInt(9);
					
				}
				System.out.println();
				System.out.println("==================================================================");
				System.out.println("|                             Bill                               |");
				System.out.println("==================================================================");
				System.out.println("Bill ID: " +billID);
				System.out.println("Customer Name: " +customerName);
				System.out.println("Food Name: " +foodName);
				System.out.println("Food Price: " +foodPrice);
				System.out.println("Quantity: " +quantity);
				System.out.println("Total Discount: " +totalDiscount);
                System.out.println("Total Price: " +totalPrice);
				System.out.println("Payment Method: " +paymentMethod);
				System.out.println("==================================================================");
				System.out.println();	
				
				do {
					System.out.println("Input Money [>= Price]");
					money = scan.nextInt();
					scan.nextLine();
				} while (money < totalPrice);
				
				change = (double)(money - totalPrice);
				System.out.println("Change : "+ change);
				System.out.println("");
				System.out.println("Thank You for your Purchase :)");
			} else if(input == 2){
				System.out.println("Exit");
			}
		} while (input != 2);
		
		
	}

}
