package Sample_Test;

import java.util.Scanner;
public class final_q5 {
	public static void main(String[] args) {
		double[] array1 = new double[100];
		double[] array2 = new double[100];
		
		// read from the keyboard
		Scanner key = new Scanner(System.in);
		System.out.print("Enter all 200 doubles?");
		for(int i = 0; i < 100; i++) {
			array1[i] = key.nextDouble(); 
		}
		for(int k = 0; k < 100; k++) {
			array2[k] = key.nextDouble();
		}
		
		System.out.println(innerProduct(array1, array2));
		
		key.close();
	}
	
	public static double innerProduct(double[] firstArray, double[] secondArray) {
		double sum = 0;
		for(int i = 0; i < firstArray.length; i++) {
			sum += firstArray[i]*secondArray[i];
		}
		
		return(sum);
	}
}
