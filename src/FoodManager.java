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
		System.out.print("넣은 날짜:");
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
			int i = 5;
			while (i != 6) {
				System.out.println("음식 정보 수정 메뉴");
				System.out.println("1. 번호 수정");
				System.out.println("2. 이름 수정");
				System.out.println("3. 양 수정");
				System.out.println("4. 넣은 날짜 수정");
				System.out.println("5. 유동기한 수정");
				System.out.println("6. 나가기");
				System.out.println("Select one number between 1 - 6");
				i = input.nextInt();
				if (i == 1) {
					System.out.print("음식번호 :");
					food.number = input.nextInt();
					
				}	
				else if (i == 2) {
					System.out.print("음식이름 :");
					food.name = input.next();
					
				}	
				else if (i == 3) {
					System.out.print("음식의 양:");
					food.amount = input.next();
				}	
				else if (i == 4) {
					System.out.print("넣은 날짜:");
					food.date = input.next();
				}	
				else if (i == 5) {
					System.out.print("유통기한 :");
					food.experation = input.next();
					
				}	
				else
					continue;
			}	
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
