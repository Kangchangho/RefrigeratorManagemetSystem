import java.util.Scanner;

public class RefrigeratorManagemetSystemMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 5;
		
		while (i != 6) {
			System.out.println("Refrigerator Managemet System Menu");
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. Veiw food");
			System.out.println("5. show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6");
			i = input.nextInt();
			if (i == 1) {
				addfood();
			}	
			else if (i == 2) {
				deletefood();
			}	
			else if (i == 3) {
				editfood();
			}	
			else if (i == 4) {
				veiwfood();
			}	
			else
				continue;
		}
			
	}
	public static void addfood() {
		Scanner input = new Scanner(System.in);
		System.out.print("음식번호 :");
		String number = input.next();
		System.out.print(number+"\n");
		System.out.print("음식이름 :");
		String name = input.next();
		System.out.print(name+"\n");
		System.out.print("음식의 양:");
		String amount = input.next();
		System.out.print(amount+"\n");
		System.out.print("넣은날짜 :");
		String date = input.next();
		System.out.print(date+"\n");
		System.out.print("유통기한 :");
		String experation = input.next();
		System.out.print(experation+"\n");
		
	}
	public static void deletefood() {
		Scanner input = new Scanner(System.in);
		System.out.print("음식이름");
		String name = input.next();
		System.out.print(name+"\n");
		
	}
	public static void editfood() {
		Scanner input = new Scanner(System.in);
		System.out.print("음식이름");
		String name = input.next();
		System.out.print(name+"\n");
	}
	public static void veiwfood() {
		Scanner input = new Scanner(System.in);
		System.out.print("음식이름");
		String name = input.next();
		System.out.print(name+"\n");
	}
}	
	
