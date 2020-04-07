
public class Food {

	String name;
	int number;
	String amount;
	String date;
	String experation;
	
	public Food() {
	}
	
	public Food(String name,int number,String amount, String date,String experation ) {
		this.name = name;
		this.number = number;
		this.amount = amount;
		this.date = date;
		this.experation = experation;
	}
	
	public void printInfo() {
		System.out.println("음식이름 :"+name+"음식번호:"+ number+  "양:"+amount+ "날짜:"+ date+"유통기한:"+experation);
	}
}	

