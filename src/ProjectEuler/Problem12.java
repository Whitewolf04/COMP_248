package ProjectEuler;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		int[] triangleNum = new int[13000];
		
		// 2. User prompt:
		
		// 3. Core logic:
		for (int i = 11999; i < triangleNum.length; i++) {
			for (int k = 0; k <= i; k++)
				triangleNum[i] += k;
		}
		
		for (int t = 0; t < triangleNum.length; t++) {
			int count = 0;
			for (int num = 1; num <= triangleNum[t]; num++) {
				if (triangleNum[t] % num == 0)
					count += 1;
			}
			System.out.println(triangleNum[t] + ": " + count);
			if (count > 500) {
				System.out.println("This is the number: " + triangleNum[t]);
				break;
			}
		}
		
		// 4. Output:
		
		// 5. Clean up:
		

	}

}
