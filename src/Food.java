
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
		System.out.println("�����̸� :"+name+"���Ĺ�ȣ:"+ number+  "��:"+amount+ "��¥:"+ date+"�������:"+experation);
	}
}	

