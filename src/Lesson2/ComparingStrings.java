package Lesson2;

public class ComparingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString = "Ditconmemay";
		String secondString = "Ditconmemay";
		String thirdString = "DITconmemay";
		
		if (firstString.equals(secondString) == true)
			System.out.println("First method to compare strings");
		if (firstString.compareTo(thirdString) == 0)
			System.out.println("System is wrong");
		else if (firstString.compareTo(thirdString) < 0)
			System.out.println("Wrong again lmao");
		else if (secondString.compareTo(thirdString) > 0)
			System.out.println("This is how to use the method compare to!");
		

	}

}
