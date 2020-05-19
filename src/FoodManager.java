import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Food.CanFood;
import Food.DrinkFood;
import Food.Food;
import Food.FoodInput;
import Food.FoodKind;
import Food.FruitFood;
import Food.SidedishFood;
import Food.SoupFood;

public class FoodManager {
	ArrayList<FoodInput> foods = new ArrayList<FoodInput>();
	Scanner input;
	FoodManager(Scanner input){
		this.input = input;
	}
	
	public void addfood() {
		int num = 0 ;
		FoodInput foodInput;
		while(num < 1 || num > 5) {
			try {
				System.out.println("1. 과일");
				System.out.println("2. 음료");
				System.out.println("3. 반찬");
				System.out.println("4. 국");
				System.out.println("5. 통조림");
				System.out.print("1,2,3,4,5번중 음식의 종류를 고르세요");
				num = input.nextInt();
				if(num == 1) {
					foodInput = new FruitFood(FoodKind.Fruit);
					foodInput.getUserInput(input);
					foods.add(foodInput);
					break;
				}
				else if(num == 2 ) {
					foodInput = new DrinkFood(FoodKind.Drink);
					foodInput.getUserInput(input);
					foods.add(foodInput);
					break;
				}
				else if(num == 3 ) {
					foodInput = new SidedishFood(FoodKind.Sidedish);
					foodInput.getUserInput(input);
					foods.add(foodInput);
					break;
				}
				else if(num == 4 ) {
					foodInput = new SoupFood(FoodKind.Soup);
					foodInput.getUserInput(input);
					foods.add(foodInput);
					break;
				}
				else if(num == 5 ) {
					foodInput = new CanFood(FoodKind.Can);
					foodInput.getUserInput(input);
					foods.add(foodInput);
					break;
				}
				else {
					System.out.print("1,2,3,4,5번중 음식의 종류를 고르세요");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 - 5 on kind");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public void deletefood() {
		System.out.print("음식번호:");
		int number = input.nextInt();
		int index = findIndex(number);
		removefromFoods(index,number);
	}
	
	public int findIndex(int number) {
		int index = -1;
		for (int i = 0;i<foods.size(); i++) {
			if(foods.get(i).getNumber() == number) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromFoods(int index, int number) {
		if (index >=0) {
			foods.remove(index);
			System.out.println("음식번호" + number+ "이 삭제되었습니다.");
			return 1;
		}
		else {
			System.out.println("음식이 등록되지 않았습니다.");
			return -1;
		}
	}
					
	public void editfood() {
		System.out.print("음식번호:");
		int foodnumber = input.nextInt();
		for (int i = 0;i<foods.size(); i++) {
			FoodInput food = foods.get(i);
			if(food.getNumber() == foodnumber) {
				int j = -1;
				while (j != 6) {
					showEditMenu();
					j = input.nextInt();
					switch(j) {
					case 1:
						food.setFoodNumber(input);
						break;
					case 2:
						food.setFoodName(input );
						break;
					case 3:
						food.setFoodAmount(input );
						break;
					case 4:
						food.setFoodDate(input );
						break;
					case 5:
						food.setFoodExperation(input );
						break;
					default:
					continue;
					}
					
				}
			}
		}
	}
	public void veiwfoods() {

		for (int i = 0;i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
		
	}
	

	public void showEditMenu() {
		System.out.println("음식 정보 수정 메뉴");
		System.out.println("1. 번호 수정");
		System.out.println("2. 이름 수정");
		System.out.println("3. 양 수정");
		System.out.println("4. 넣은 날짜 수정");
		System.out.println("5. 유동기한 수정");
		System.out.println("6. 나가기");
		System.out.println("Select one number between 1 - 6");
	}
}
