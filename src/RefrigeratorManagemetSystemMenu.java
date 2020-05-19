import java.util.InputMismatchException;
import java.util.Scanner;

public class RefrigeratorManagemetSystemMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		
		selectMenu(input , foodManager);
	}
	
	public static void selectMenu(Scanner input, FoodManager foodManager ) {
		int i = -1;
		while (i != 5) {
			try {
				showMenu();
				i = input.nextInt();
				switch(i) {
				case 1:
					foodManager.addfood();
					break;
				case 2:
					foodManager.deletefood();
					break;
				case 3:
					foodManager.editfood();
					break;
				case 4:
					foodManager.veiwfoods();
					break;	
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 - 5");
				if (input.hasNext()) {
					input.next();
				}
				i = -1;
			}
	}
}
	
	public static void showMenu() {
		System.out.println("Refrigerator Managemet System Menu");
		System.out.println("1. Add food");
		System.out.println("2. Delete food");
		System.out.println("3. Edit food");
		System.out.println("4. Veiw food");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5");
	}
}	
	
