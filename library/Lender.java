package library;

import library.media.Media;
import library.media.MediaStatus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/**
 * Created by yoavl_000 on 21/08/2017.
 */
public class Lender {
    public String name;
    public int id;



    public int timeOfLoan;
    public Media currentMedia;

    public Lender(String name) {
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Media checkOutMedia(int timeOfLoan, Library library, Media mediaToLoan)
    {
        if(library.checkOutMedia(timeOfLoan,mediaToLoan, getName()))
        {
            System.out.println(getName()+ "has loaned" + mediaToLoan.getName() + "for "+ timeOfLoan +"days");
            currentMedia=mediaToLoan;
            DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

            mediaToLoan.setCheckedOutDate(dateFormat);
            setTimeOfLoan(timeOfLoan);
        }
        else
        {
            System.out.println(getName()+ "has NOT loaned" + mediaToLoan.getName() + "for "+ timeOfLoan +"days");
        }
        return  mediaToLoan;

    }

    public void returnMedia( Library library, Media mediaToReturn)
    {
        if(mediaToReturn.getName()==currentMedia.getName())
        {
           // String dateInString =  (mediaToReturn.getCheckedOutDate()).toString();
          //  long dateInLong= new Long(dateInString).longValue();
            // if   Duration.ofDays(dateInLong)>14;
            if (getTimeOfLoan()>14)
            {

                System.out.println("you have returned " + mediaToReturn.getName() +"successfully" );
                setTimeOfLoan(0);
                mediaToReturn.setStatus(MediaStatus.AVAILABLE);
                currentMedia=null;
            }
            else
            {
                System.out.println("you have returned " + mediaToReturn.getName() +", but you must pay a fine" );
                setTimeOfLoan(0);
                mediaToReturn.setStatus(MediaStatus.AVAILABLE);
                currentMedia=null;
            }

        }

    }

    public int getTimeOfLoan() {
        return timeOfLoan;
    }

    public void setTimeOfLoan(int timeOfLoan) {
        this.timeOfLoan = timeOfLoan;
    }


}
