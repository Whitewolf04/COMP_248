package Lesson6;

public class Coin {
	private final int HEAD = 0;
	private final int TAIL = 1;
	private int face;
	
	public void flip() {
		face = (int)(Math.random()*2);
		return; // This return can be written or not written because void method does not return any value
	}
	
	public boolean isHead() {
		return (face == HEAD);
	}
	
	public boolean isTail() {
		return (face == TAIL);
	}
	
	public void flip5() {
		for (int i = 0; i < 5; i++) {
			flip();
		}
	}
}
