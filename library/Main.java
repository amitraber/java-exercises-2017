package library;

import library.media.AudioBook;
import library.media.Magazine;
import library.media.MediaStatus;

/**
 * Created by yoavl_000 on 21/08/2017.
 */
public class Main {

    public static void  Main(String[] args)
    {

        Magazine time= new Magazine();
        Magazine WashingtonPost= new Magazine();

        AudioBook lordOfTheRing= new AudioBook();
        AudioBook plato= new AudioBook();


        ///////////////////////////////////////
        Library mainLibraryTAU= new Library();
        mainLibraryTAU.addToLibrary(time);
        mainLibraryTAU.addToLibrary(WashingtonPost);
        mainLibraryTAU.addToLibrary(lordOfTheRing);
        mainLibraryTAU.addToLibrary(plato);

        plato.setStatus(MediaStatus.AVAILABLE);
        time.setStatus(MediaStatus.AVAILABLE);
        WashingtonPost.setStatus(MediaStatus.AVAILABLE);
        lordOfTheRing.setStatus(MediaStatus.AVAILABLE);


        Library MathlibraryTAU= new Library();



        ////////////////////////////////////////

        Lender orit= new Lender("orit");
        orit.checkOutMedia(14, mainLibraryTAU, time);

        ///////////////////////////////////////
        Lender layla= new Lender("Layla");
        layla.checkOutMedia(10, mainLibraryTAU, time);
        layla.checkOutMedia(10, mainLibraryTAU, lordOfTheRing);
        ////////////////////////////////////////

        orit.returnMedia(mainLibraryTAU, time);

         ///////////////////////////////////////
        ///prints the status of all books LOANED or  AVAILABLE

        mainLibraryTAU.printStatusOfAllBooks();



    }
}
