package Food;

import java.util.Scanner;

public class CanFood extends Food {
	
	public CanFood (FoodKind kind) {
		this.kind = kind;
	}
	
	public void getUserInput(Scanner input) {
		setFoodNumber(input);
		setFoodName(input);
		
		char answer = 'x';
		while (answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("유통기한이 있나요?(Y/n)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				setFoodDate(input);
				setFoodExperation(input );
				break;
			}
			else if(answer == 'n' || answer =='N') {
				break;
			}
			else {
			}
		}
		setFoodAmount(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("음식종류 : "+ skind + "음식번호 :"+ number + 
				 "번 음식이름 : " +name +" 양:"+amount);
	}
}
