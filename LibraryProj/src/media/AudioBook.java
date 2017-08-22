package media;

import java.util.Date;

public class AudioBook extends Book {
	private String Narrator;
	private int Duration;

	public AudioBook(String name, String publisher, Date publicationDate) {
		super();
	}

	public AudioBook(int id, String name, String publisher, Date publicationDate, String narrator, int duration) {

		Narrator = narrator;
		Duration = duration;
	}

	@Override
	public String toString() {
		return "AudioBook [Narrator=" + Narrator + ", Duration=" + Duration + "]";
	}

	
}
