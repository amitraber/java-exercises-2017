package media;

import java.util.Date;

public abstract class Media {

	private int id;
	private String name;
	private String publisher;
	private Date publicationDate;
	private MediaStatus status;
	private Date checkOutDate;
	private int idCounter = 0;

	public Media(String name, String publisher, Date publicationDate, MediaStatus status) {
		this.id = idCounter++;
		this.name = name;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.status = status;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public MediaStatus getStatus() {
		return status;
	}
	public void setStatus(MediaStatus status) {
		this.status = status;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
	public abstract int getFine ();
	public abstract int getMaxLoan ();
	@Override
	public String toString() {
		return "Media [name=" + name + ", id=" + id + ", publisher=" + publisher + ", publicationDate="
				+ publicationDate + ", status=" + status + ", checkOutDate=" + checkOutDate + "]";
	}

	
	
	
}
