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
		System.out.print("���� ��¥:");
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
			int i = 5;
			while (i != 6) {
				System.out.println("���� ���� ���� �޴�");
				System.out.println("1. ��ȣ ����");
				System.out.println("2. �̸� ����");
				System.out.println("3. �� ����");
				System.out.println("4. ���� ��¥ ����");
				System.out.println("5. �������� ����");
				System.out.println("6. ������");
				System.out.println("Select one number between 1 - 6");
				i = input.nextInt();
				if (i == 1) {
					System.out.print("���Ĺ�ȣ :");
					food.number = input.nextInt();
					
				}	
				else if (i == 2) {
					System.out.print("�����̸� :");
					food.name = input.next();
					
				}	
				else if (i == 3) {
					System.out.print("������ ��:");
					food.amount = input.next();
				}	
				else if (i == 4) {
					System.out.print("���� ��¥:");
					food.date = input.next();
				}	
				else if (i == 5) {
					System.out.print("������� :");
					food.experation = input.next();
					
				}	
				else
					continue;
			}	
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
