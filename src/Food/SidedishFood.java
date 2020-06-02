package Food;

import java.util.Scanner;

public class SidedishFood extends Food{
	public SidedishFood(FoodKind kind) {
		this.kind = kind;
	}
	public void getUserInput(Scanner input) {
		
		setFoodNumber(input);
		setFoodName(input);
		setFoodAmount(input);
		setFoodDate(input);
		setFoodExperation(input );
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("음식종류 : "+ skind + "음식번호 :"+ number + 
				 "번 음식이름 : " +name +" 양:"+amount+ " 날짜:"+ date+" 유통기한:"+experation);
	}
	
}


