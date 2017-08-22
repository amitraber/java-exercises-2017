package media;

import java.util.Date;

public class Book extends Media{


	public Book(String name, String publisher, Date publicationDate, MediaStatus status) {
		super(id, name, publisher, publicationDate, status);
	}

	@Override
	public int getFine() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxLoan() {
		// TODO Auto-generated method stub
		return 0;
	}

}
