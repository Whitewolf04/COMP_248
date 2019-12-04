package Sample_Test;

public class Musical_Note {
	private String syllable = "MI";
	private int note = 3;
	private int duration;
	
	public Musical_Note() {
		syllable = "DO";
		note = 1;
		duration = 1;
	}
	
	public Musical_Note(int note, int duration) {
		switch(note) {
			case 1:
				this.syllable = "DO";
				this.note = 1;
				break;
			case 2:
				this.syllable = "RE";
				this.note = 2;
				break;
			case 3:
				this.syllable = "MI";
				this.note = 3;
				break;
			case 4:
				this.syllable = "FA";
				this.note = 4;
				break;
			case 5:
				this.syllable = "SOL";
				this.note = 5;
				break;
			case 6:
				this.syllable = "LA";
				this.note = 6;
				break;
			case 7:
				this.syllable = "TI";
				this.note = 7;
				break;
			default:
				this.syllable = "DO";
				this.note = 1;
		}
		
		if(duration < 0) {
			this.duration = 1;
		} else {
			this.duration = duration;
		}
	}
	
	// Accessor method
	public String getSyllable() {
		return syllable;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void shorten() {
		if(duration > 1) {
			duration -= 1;
		}
	}
	
	public String toString() {
		String result = String.format("%d-%d", note, duration);
		return(result);
	}
	
	public boolean sameSyllable(Musical_Note otherNote) {
		return(otherNote.getSyllable() == this.syllable);
	}
	
	public boolean equal(Musical_Note otherNote) {
		return(otherNote.getSyllable() == this.syllable && otherNote.getDuration() == this.duration);
	}
	
	
}
