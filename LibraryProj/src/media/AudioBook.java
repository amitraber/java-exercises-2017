package media;

import java.util.Date;

public class AudioBook extends Book {
	private String Narrator;
	private int Duration;

	public AudioBook(String name, String publisher, Date publicationDate, MediaStatus status) {
		super(name, publisher, publicationDate, status);
	}

	public AudioBook(int id, String name, String publisher, Date publicationDate, MediaStatus status, String narrator, int duration) {
		super(name, publisher, publicationDate, status);
		Narrator = narrator;
		Duration = duration;
	}

	@Override
	public String toString() {
		return "AudioBook [Narrator=" + Narrator + ", Duration=" + Duration + "]";
	}

	
}
