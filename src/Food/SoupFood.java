package Food;

import java.util.Scanner;

public class SoupFood extends Food {
	public SoupFood(FoodKind kind) {
		this.kind = kind;
	}
	public void getUserInput(Scanner input) {
		
		setFoodNumber(input);
		setFoodName(input);
		setFoodAmount(input);
		setFoodDate(input);
		setFoodExperation(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("�������� : "+ skind + "���Ĺ�ȣ :"+ number + 
				 "�� �����̸� : " +name +" ��:"+amount+ " ��¥:"+ date+" �������:"+experation);
	}
}
