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
			System.out.print("��������� �ֳ���?(Y/n)");
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
		System.out.println("�������� : "+ skind + "���Ĺ�ȣ :"+ number + 
				 "�� �����̸� : " +name +" ��:"+amount);
	}
}
