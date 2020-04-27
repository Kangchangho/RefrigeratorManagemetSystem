package Food;

import java.util.Scanner;

public class Food {
	
	protected FoodKind Kind = FoodKind.Drink;
	protected String name;
	protected int number;
	protected String amount;
	protected String date;
	protected String experation;
	
	public Food() {
	}
	
	public Food(String name,int number,String amount, String date,String experation ) {
		this.name = name;
		this.number = number;
		this.amount = amount;
		this.date = date;
		this.experation = experation;
	}
	public FoodKind getKind() {
		return Kind;
	}

	public void setKind(FoodKind kind) {
		Kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getExperation() {
		return experation;
	}

	public void setExperation(String experation) {
		this.experation = experation;
	}
	public void printInfo() {
		System.out.println("�����̸� :"+name+" ���Ĺ�ȣ:"+ number+  "�� ��:"+amount+ " ��¥:"+ date+" �������:"+experation);
	}
	public void getUserInput(Scanner input) {
		
		System.out.print("���Ĺ�ȣ :");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("�����̸� :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("������ ��:");
		String amount = input.next();
		this.setAmount(amount);
		
		System.out.print("���� ��¥:");
		String date = input.next();
		this.setDate(date);
		
		System.out.print("������� :");
		String experation = input.next();
		this.setExperation(experation);
	}
}	


