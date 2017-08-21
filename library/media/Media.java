package library.media;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by yoavl_000 on 21/08/2017.
 */
public abstract class Media {

    public DateFormat checkedOutDate;
    public String name;
    public int id;
    public MediaStatus status;
    public String publisher;
    public Date publicationDate;

    public abstract int getFine();
    public  abstract int getMaxLoan();

    public  Media(String name) {
        this.name=name;
    }


    public DateFormat getCheckedOutDate() {
        return checkedOutDate;
    }

    public void setCheckedOutDate(DateFormat checkedOutDate) {
        this.checkedOutDate = checkedOutDate;
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

    public MediaStatus getStatus() {
        return status;
    }

    public void setStatus(MediaStatus status) {
        this.status = status;
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







}
