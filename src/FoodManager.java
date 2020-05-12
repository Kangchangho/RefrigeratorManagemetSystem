import java.util.ArrayList;
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
		int kind = 0 ;
		FoodInput foodInput;
		while(kind != 1 && kind !=2) {
		System.out.println("1. 과일");
		System.out.println("2. 음료");
		System.out.println("3. 반찬");
		System.out.println("4. 국");
		System.out.println("5. 통조림");
		System.out.print("1,2,3,4,5번중 음식의 종류를 고르세요");
		kind = input.nextInt();
			if(kind == 1) {
				foodInput = new FruitFood(FoodKind.Fruit);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if(kind == 2 ) {
				foodInput = new DrinkFood(FoodKind.Drink);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if(kind == 3 ) {
				foodInput = new SidedishFood(FoodKind.Sidedish);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if(kind == 4 ) {
				foodInput = new SoupFood(FoodKind.Soup);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else if(kind == 5 ) {
				foodInput = new CanFood(FoodKind.Can);
				foodInput.getUserInput(input);
				foods.add(foodInput);
				break;
			}
			else {
				System.out.print("1,2,3,4,5번중 음식의 종류를 고르세요");
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
						setFoodNumber(food, input);
						break;
					case 2:
						setFoodName(food, input );
						break;
					case 3:
						setFoodAmount(food, input );
						break;
					case 4:
						setFoodDate(food, input );
						break;
					case 5:
						setFoodExperation(food, input );
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
	
	public void setFoodNumber(FoodInput food,Scanner input ) {
		System.out.print("음식번호 :");
		int number = input.nextInt();
		food.setNumber(number);
		
	}
	public void setFoodName(FoodInput food,Scanner input ) {
		System.out.print("음식이름 :");
		String name = input.next();
		food.setName(name);
		
	}
	public void setFoodAmount(FoodInput food,Scanner input ) {
		System.out.print("음식의 양:");
		String amount = input.next();
		food.setAmount(amount);
		
	}
	public void setFoodDate(FoodInput food,Scanner input ) {
		System.out.print("넣은 날짜:");
		String date = input.next();
		food.setDate(date);
		
	}
	public void setFoodExperation(FoodInput food,Scanner input ) {
		System.out.print("유통기한 :");
		String experation = input.next();
		food.setExperation(experation);
		
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
