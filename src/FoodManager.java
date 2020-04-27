import java.util.ArrayList;
import java.util.Scanner;

import Food.DrinkFood;
import Food.Food;

public class FoodManager {
	ArrayList<Food> foods = new ArrayList<Food>();
	Scanner input;
	FoodManager(Scanner input){
		this.input = input;
	}
	
	public void addfood() {
		int kind = 0 ;
		Food food;
		while(kind != 1 && kind !=2) {
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.print("������ ������ ������");
		kind = input.nextInt();
			if(kind == 1) {
				food = new Food();
				food.getUserInput(input);
				foods.add(food);
				break;
			}
			else if(kind == 2 ) {
				food = new DrinkFood();
				food.getUserInput(input);
				foods.add(food);
				break;
			}
			else {
				System.out.print("1���� 2���� ������ ������ ������");
			}
		}
		
		
		
	}
	public void deletefood() {
		System.out.print("���Ĺ�ȣ:");
		int number = input.nextInt();
		int index = -1;
		for (int i = 0;i<foods.size(); i++) {
			if(foods.get(i).getNumber() == number) {
				index = i;
				break;
				
			}
		}
		
		if (index >=0) {
			foods.remove(index);
			System.out.println("���Ĺ�ȣ" + number+ "�� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("������ ��ϵ��� �ʾҽ��ϴ�.");
			return;
		}
}
		
	
		

	public void editfood() {
		System.out.print("���Ĺ�ȣ:");
		int foodnumber = input.nextInt();
		for (int i = 0;i<foods.size(); i++) {
			Food food = foods.get(i);
			if(food.getNumber() == foodnumber) {
				int j = -1;
				while (j != 6) {
					System.out.println("���� ���� ���� �޴�");
					System.out.println("1. ��ȣ ����");
					System.out.println("2. �̸� ����");
					System.out.println("3. �� ����");
					System.out.println("4. ���� ��¥ ����");
					System.out.println("5. �������� ����");
					System.out.println("6. ������");
					System.out.println("Select one number between 1 - 6");
					j = input.nextInt();
					if (j == 1) {
						System.out.print("���Ĺ�ȣ :");
						int number = input.nextInt();
						food.setNumber(number);
					}	
					else if (j == 2) {
						System.out.print("�����̸� :");
						String name = input.next();
						food.setName(name);
					}	
					else if (j == 3) {
						System.out.print("������ ��:");
						String amount = input.next();
						food.setAmount(amount);
					}	
					else if (j == 4) {
						System.out.print("���� ��¥:");
						String date = input.next();
						food.setDate(date);
					}	
					else if (j == 5) {
						System.out.print("������� :");
						String experation = input.next();
						food.setExperation(experation);
					}	
				else {
					continue;
					}
				}
				break;
			}
		}
}
	public void veiwfoods() {
//		System.out.print("���Ĺ�ȣ:");
//		int number = input.nextInt();
		for (int i = 0;i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
		
	}
}
