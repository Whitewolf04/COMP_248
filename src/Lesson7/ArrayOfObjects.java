package Lesson7;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone[][] myNumber = new Telephone[10][10];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
			myNumber[i][j] = new Telephone(514848242);
			System.out.println(myNumber[i][j].ring());
			}
		}		
	}

}
