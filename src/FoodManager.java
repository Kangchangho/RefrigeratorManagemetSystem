import java.util.Scanner;

public class FoodManager {
	Food food;
	Scanner input;
	
	FoodManager(Scanner input){
		this.input = input;
	}
	
	
	
	public void addfood() {
		food = new Food();
		System.out.print("���Ĺ�ȣ :");
		food.number = input.nextInt();
		System.out.print("�����̸� :");
		food.name = input.next();
		System.out.print("������ ��:");
		food.amount = input.next();
		System.out.print("������¥ :");
		food.date = input.next();
		System.out.print("������� :");
		food.experation = input.next();
	
	}
	public void deletefood() {
		System.out.print("���Ĺ�ȣ:");
		int number = input.nextInt();
		System.out.print(number+"\n");
		if(food == null ) {
			System.out.println("������ ��ϵ��� �ʾҽ��ϴ�.");
			return;
		}
		if(food.number == number) {
			food = null;
			System.out.println("������ �����Ǿ����ϴ�.");
		}
	
	}
	public void editfood() {
		System.out.print("���Ĺ�ȣ:");
		int number = input.nextInt();
		if(food.number == number) {
			System.out.println("������ �߰��Ǿ����ϴ�."+ number);
		}
	}
	public void veiwfood() {
		System.out.print("���Ĺ�ȣ:");
		int number = input.nextInt();
		if(food.number == number) {
			food.printInfo();
		}	
	}
}
