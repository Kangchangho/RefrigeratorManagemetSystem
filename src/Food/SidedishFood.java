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
		System.out.println("�������� : "+ skind + "���Ĺ�ȣ :"+ number + 
				 "�� �����̸� : " +name +" ��:"+amount+ " ��¥:"+ date+" �������:"+experation);
	}
	
}


