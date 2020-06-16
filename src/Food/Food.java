package Food;

import java.io.Serializable;
import java.util.Scanner;

import exception.DateFormatException;

public abstract class Food implements FoodInput , Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3644500342207589166L;
	
	protected FoodKind kind = FoodKind.Soup;
	protected String name;
	protected int number;
	protected String amount;
	protected String date;
	protected String experation;
	
	public Food() {
	}
	public Food(FoodKind kind) {
		this.kind = kind;
	}
	
	public Food(FoodKind kind,String name,int number,String amount, String date,String experation ) {
		this.kind = kind;
		this.name = name;
		this.number = number;
		this.amount = amount;
		this.date = date;
		this.experation = experation;
	}
	public FoodKind getKind() {
		return kind;
	}

	public void setKind(FoodKind kind) {
		this.kind = kind;
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

	public String getDate(){
		return date;
	}

	public void setDate(String date) throws  DateFormatException {
		if (!date.contains("��") && !date.equals("") ){
			throw new DateFormatException();
		}
		this.date = date;
	}

	public String getExperation() {
		return experation;
	}

	public void setExperation(String experation) {
		this.experation = experation;
	}
	
	public abstract void printInfo();
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) { 
		case Drink:
			skind = "����.";
			break;
		case Fruit:
			skind = "����.";
			break;
		case Sidedish:
			skind = "����.";
			break;
		case Soup:	
			skind = "��.";
			break;
		case Can:	
			skind = "������.";
			break;
		default:	
		}
		return skind;
	}
	
	public void setFoodNumber(Scanner input ) {
		System.out.print("���Ĺ�ȣ :");
		int number = input.nextInt();
		this.setNumber(number);
		
	}
	public void setFoodName(Scanner input ) {
		System.out.print("�����̸� :");
		String name = input.next();
		this.setName(name);
		
	}
	public void setFoodAmount(Scanner input ) {
		System.out.print("������ ��:");
		String amount = input.next();
		this.setAmount(amount);
		
	}
	public void setFoodDate(Scanner input ) {
		String date = "";
		while(!date.contains("��")) {
			System.out.print("���� ��¥(��,��,��) :");
			date = input.next();
			try {
				this.setDate(date);
			} catch (DateFormatException e) {
				System.out.print("���� ��  ��Ȯ�� �������ּ���.");
			}
		}
	}
	public void setFoodExperation(Scanner input ) {
		System.out.print("������� :");
		String experation = input.next();
		this.setExperation(experation);
		
	}
}	


