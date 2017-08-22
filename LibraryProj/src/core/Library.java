package core;

import java.util.Date;
import java.util.HashMap;

import media.*;

public class Library {

	private HashMap bookSet;

    public Library( HashMap <Integer, Media > bookSet) {
        this.bookSet = bookSet;

    }

    public void checkoutMedia(int media) {
	}
	
	public void returnMedia(int media) {
	}
	
	public void addToLibrary(Media media) {
    //    bookSet.put(media.getId(),media);

        if (media instanceof AudioBook)
        {
            return;
        }
        if (media instanceof Book)
        {
            return;
        }
        if (media instanceof Magazine)
        {
            return;
        }

    }


}
