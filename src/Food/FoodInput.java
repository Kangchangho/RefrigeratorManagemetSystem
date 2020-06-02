package Food;

import java.util.Scanner;

import exception.DateFormatException;

public interface FoodInput {
	public int getNumber();
	public void setName(String name);
	public void setNumber(int number);
	public void setAmount(String amount);
	public void setDate(String date) throws DateFormatException;
	public void setExperation(String experation);
	public void printInfo();

	public void getUserInput(Scanner input);
	public void setFoodNumber(Scanner input );
	public void setFoodName(Scanner input );
	public void setFoodAmount(Scanner input );
	public void setFoodDate(Scanner input );
	public void setFoodExperation(Scanner input );
}
