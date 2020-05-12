import java.util.Scanner;

public class RefrigeratorManagemetSystemMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		int i = -1;
		
		while (i != 5) {
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
	
