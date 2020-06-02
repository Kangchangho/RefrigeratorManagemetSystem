package Food;

import java.util.Scanner;

public class DrinkFood extends Food{
	
	public DrinkFood(FoodKind kind) {
		this.kind = kind;
	}
	
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		
		char answer = 'x';
		while (answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("캔 음료수 인가요?(Y/n)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.print("(캔의 갯수)");
				setFoodAmount(input);
				break;
			}
			else if(answer == 'n' || answer =='N') {
				System.out.print("(남은 음료의 양)");
				setFoodAmount(input);
				break;
			}
			else {
			}
		}	
		setFoodDate(input);
		setFoodExperation(input );
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("음식종류 : "+ skind + "음식번호 :"+ number + 
				 "번 음식이름 : " +name +" 양:"+amount+ " 날짜:"+ date+" 유통기한:"+experation);
	}
}
