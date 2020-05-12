package Food;

import java.util.Scanner;

public abstract class Food {
	
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
	
	public abstract void printInfo();
		
}	


