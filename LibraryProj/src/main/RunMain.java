package main;

import media.AudioBook;
import media.Book;
import media.MediaStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class RunMain {

	public static void main(String[] args) throws ParseException {



		Book b1 = new Book("book1", "Borka",Utils.convertDateFormat(getTime()), MediaStatus.AVAILABALE);
        AudioBook ab1 = new AudioBook("audio1","Borka", date, MediaStatus.AVAILABALE);
	}

}
