import java.util.Scanner;

public class RefrigeratorManagemetSystemMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		int i = -1;
		
		while (i != 5) {
			System.out.println("Refrigerator Managemet System Menu");
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. Veiw food");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5");
			i = input.nextInt();
			if (i == 1) {
				foodManager.addfood();
			}	
			else if (i == 2) {
				foodManager.deletefood();
			}	
			else if (i == 3) {
				foodManager.editfood();
			}	
			else if (i == 4) {
				foodManager.veiwfood();
			}	
			else
				continue;
		}	
	}
	
}	
	
