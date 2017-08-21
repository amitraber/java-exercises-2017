package library;

import library.media.Media;

import java.util.ArrayList;
import java.util.HashMap;

import static library.media.MediaStatus.AVAILABLE;
import static library.media.MediaStatus.LOANED;

/**
 * Created by yoavl_000 on 21/08/2017.
 */
public class Library {
   private HashMap bookset;
    private static int id;
   private ArrayList<Media> listOfMedia= new ArrayList<Media>();

   public boolean checkOutMedia(int check, Media mediaToLoan, String lenderName)
   {
       if(check>14)
       {
           System.out.println("sorry " + lenderName + " you cannot loan a book more then 14 days");
           return false;
       }
       else if (check<0)
       {
           System.out.println("sorry " +lenderName +  "you cannot loan a book lass then one day");
           return false;
       }


           if (mediaToLoan.status == AVAILABLE) {
               System.out.println(lenderName + ", the media ia available, you may loan it");
               mediaToLoan.setStatus(LOANED);
               return true;
           }
           else {
               System.out.println("sorry " + lenderName + " the media is LOANED");
               return false;
           }

       }



    public void returnMedia(int check)
    {

    }

    public void addToLibrary(Media media)
    {
        media.setId(id);
        listOfMedia.add(media);
        bookset.put(media.getId(), media.getName());
        id++;
    }

    public void printStatusOfAllBooks()
    {
        for (Media media: listOfMedia)
        {
            System.out.println(media.getStatus());
        }

    }


}
