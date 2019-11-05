import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String Menu;
		while(true){
			Menu="";
			System.out.println("Fnbucks Coffee Shop");
			System.out.println("===================\n");
			
			do{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Choose menu you want to Order [Coffee | Cheese Cake]: ");
				Menu = scanner.nextLine();
				if(Menu.equals("Coffee")||Menu.equals("Cheese Cake")) break;
			}while(true);
			cls();
			if(Menu.equals("Coffee")) orderCoffee();
			if(Menu.equals("Cheese Cake")) orderCake();
			cls();
		}
	}
	
	static void orderCoffee(){
		String Name = "", Size = "", Type = "";
		int Quantity=0, Rating=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Order Coffee:");
		while(Name.length() < 5 || Name.length() > 20){
			System.out.print("Input order name [5..20 characters]:");
			Name=scanner.nextLine();
		}
		while(!Size.equals("Small") && !Size.equals("Medium") && !Size.equals("Large")){
			System.out.print("Input order size [Small | Medium | Large]:");
			Size=scanner.nextLine();
		}
		while(!Type.equals("Cold") && !Type.equals("Hot")){
			System.out.print("Input order type [Cold | Hot]:");
			Type=scanner.nextLine();
		}
		while(Rating < 1 || Rating > 4){
			System.out.print("Input order rating [1..4]:");
			Rating=scanner.nextInt();
		}
		while(Quantity < 1){
			System.out.print("Input order quantity:");
			Quantity=scanner.nextInt();
		}
		Coffee coffee = new Coffee(Name, Quantity, Rating, Size, Type);
		System.out.println("\nOrder Coffee Success!");
	}
	
	static void orderCake(){
		String Name = "";
		int Quantity=0, Rating=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Order Cheese Cake:");
		while(Name.length() < 5 || Name.length() > 20){
			System.out.print("Input order name [5..20 characters]:");
			Name=scanner.nextLine();
		}
		while(Rating < 1 || Rating > 4){
			System.out.print("Input order rating [1..4]:");
			Rating=scanner.nextInt();
		}
		while(Quantity < 1){
			System.out.print("Input order quantity:");
			Quantity=scanner.nextInt();
		}
		CheeseCake cake = new CheeseCake(Name, Quantity, Rating);
		System.out.println("\nOrder Cheese Cake Success!");
	}
	
	static void cls(){
		for(int i=0;i<15;i++) System.out.println("");
	}
}
