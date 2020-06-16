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
			System.out.print("ĵ ����� �ΰ���?(Y/n)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.print("(ĵ�� ����)");
				setFoodAmount(input);
				break;
			}
			else if(answer == 'n' || answer =='N') {
				System.out.print("(���� ������ ��)");
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
		System.out.println("�������� : "+ skind + "���Ĺ�ȣ :"+ number + 
				 "�� �����̸� : " +name +" ��:"+amount+ " ��¥:"+ date+" �������:"+experation);
	}
}