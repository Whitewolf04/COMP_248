package Lesson7;

public class Telephone {
	private int number;
	
	public Telephone(int number) {
		this.number = number;
	}
	
	public String ring() {
		return("dring dring");
	}
	
	public void printNumber() {
		System.out.println(this.number);
	}
}
