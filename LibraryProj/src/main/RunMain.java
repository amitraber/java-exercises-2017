package main;

import media.AudioBook;
import media.Book;
import media.MediaStatus;

import java.text.ParseException;


public class RunMain {

	public static void main(String[] args) throws ParseException {



		Book b1 = new Book("book1", "Borka",Utils.convertDateFormat("20/11/2017"));
        AudioBook ab1 = new AudioBook("audio1","Borka", Utils.convertDateFormat("12/03/2017"), MediaStatus.AVAILABALE);
	}

}
