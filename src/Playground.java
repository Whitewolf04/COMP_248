
public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Method(4, 5, 6));
	}
	public static int Method(int ...a){
		int count = 0;
		for(int i:a) {
			if(i >= 5) {
				count += 1;
			}
		}
		return(count);
	}
}
