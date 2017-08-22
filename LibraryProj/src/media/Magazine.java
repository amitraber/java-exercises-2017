package media;

import java.util.Date;

public class Magazine extends Media{
 private String issueNo;

	public Magazine(int id, String name, String publisher, Date publicationDate, MediaStatus status) {
		super();
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
