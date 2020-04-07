import java.util.Scanner;

public class FoodManager {
	Food food;
	Scanner input;
	
	FoodManager(Scanner input){
		this.input = input;
	}
	
	
	
	public void addfood() {
		food = new Food();
		System.out.print("음식번호 :");
		food.number = input.nextInt();
		System.out.print("음식이름 :");
		food.name = input.next();
		System.out.print("음식의 양:");
		food.amount = input.next();
		System.out.print("넣은날짜 :");
		food.date = input.next();
		System.out.print("유통기한 :");
		food.experation = input.next();
	
	}
	public void deletefood() {
		System.out.print("음식번호:");
		int number = input.nextInt();
		System.out.print(number+"\n");
		if(food == null ) {
			System.out.println("음식이 등록되지 않았습니다.");
			return;
		}
		if(food.number == number) {
			food = null;
			System.out.println("음식이 삭제되었습니다.");
		}
	
	}
	public void editfood() {
		System.out.print("음식번호:");
		int number = input.nextInt();
		if(food.number == number) {
			System.out.println("음식이 추가되었습니다."+ number);
		}
	}
	public void veiwfood() {
		System.out.print("음식번호:");
		int number = input.nextInt();
		if(food.number == number) {
			food.printInfo();
		}	
	}
}
