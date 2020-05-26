import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class RefrigeratorManagemetSystemMenu{

	
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = getObject("foodManager.ser");
		if(foodManager == null) {
			foodManager = new FoodManager(input);
		}
		else {
			foodManager.setScanner(input);
	    }
		selectMenu(input , foodManager);
		putObject(foodManager, "foodManager.ser");
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
					logger.log("add a food");
					break;
				case 2:
					foodManager.deletefood();
					logger.log("delete a food");
					break;
				case 3:
					foodManager.editfood();
					logger.log("edit a food");
					break;
				case 4:
					foodManager.veiwfoods();
					logger.log("veiw a food");
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
	
	public static FoodManager getObject(String filename) {
		FoodManager foodManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			foodManager = (FoodManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return foodManager;
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return foodManager;
	}
	public static void putObject(FoodManager foodManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(foodManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		
		}
	}
}	
	
