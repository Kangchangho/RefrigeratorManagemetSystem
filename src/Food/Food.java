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
		if (!date.contains("년") && !date.equals("") ){
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
			skind = "음료.";
			break;
		case Fruit:
			skind = "과일.";
			break;
		case Sidedish:
			skind = "반찬.";
			break;
		case Soup:	
			skind = "국.";
			break;
		case Can:	
			skind = "통조림.";
			break;
		default:	
		}
		return skind;
	}
	
	public void setFoodNumber(Scanner input ) {
		System.out.print("음식번호 :");
		int number = input.nextInt();
		this.setNumber(number);
		
	}
	public void setFoodName(Scanner input ) {
		System.out.print("음식이름 :");
		String name = input.next();
		this.setName(name);
		
	}
	public void setFoodAmount(Scanner input ) {
		System.out.print("음식의 양:");
		String amount = input.next();
		this.setAmount(amount);
		
	}
	public void setFoodDate(Scanner input ) {
		String date = "";
		while(!date.contains("년")) {
			System.out.print("넣은 날짜(년,월,일) :");
			date = input.next();
			try {
				this.setDate(date);
			} catch (DateFormatException e) {
				System.out.print("연도 도  정확히 기재해주세요.");
			}
		}
	}
	public void setFoodExperation(Scanner input ) {
		System.out.print("유통기한 :");
		String experation = input.next();
		this.setExperation(experation);
		
	}
}	


