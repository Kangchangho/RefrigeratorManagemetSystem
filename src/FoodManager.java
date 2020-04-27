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
		System.out.println("1. 과일");
		System.out.println("2. 음료");
		System.out.print("음식의 종류를 고르세요");
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
				System.out.print("1번과 2번중 음식의 종류를 고르세요");
			}
		}
		
		
		
	}
	public void deletefood() {
		System.out.print("음식번호:");
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
			System.out.println("음식번호" + number+ "이 삭제되었습니다.");
		}
		else {
			System.out.println("음식이 등록되지 않았습니다.");
			return;
		}
}
		
	
		

	public void editfood() {
		System.out.print("음식번호:");
		int foodnumber = input.nextInt();
		for (int i = 0;i<foods.size(); i++) {
			Food food = foods.get(i);
			if(food.getNumber() == foodnumber) {
				int j = -1;
				while (j != 6) {
					System.out.println("음식 정보 수정 메뉴");
					System.out.println("1. 번호 수정");
					System.out.println("2. 이름 수정");
					System.out.println("3. 양 수정");
					System.out.println("4. 넣은 날짜 수정");
					System.out.println("5. 유동기한 수정");
					System.out.println("6. 나가기");
					System.out.println("Select one number between 1 - 6");
					j = input.nextInt();
					if (j == 1) {
						System.out.print("음식번호 :");
						int number = input.nextInt();
						food.setNumber(number);
					}	
					else if (j == 2) {
						System.out.print("음식이름 :");
						String name = input.next();
						food.setName(name);
					}	
					else if (j == 3) {
						System.out.print("음식의 양:");
						String amount = input.next();
						food.setAmount(amount);
					}	
					else if (j == 4) {
						System.out.print("넣은 날짜:");
						String date = input.next();
						food.setDate(date);
					}	
					else if (j == 5) {
						System.out.print("유통기한 :");
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
//		System.out.print("음식번호:");
//		int number = input.nextInt();
		for (int i = 0;i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
		
	}
}
