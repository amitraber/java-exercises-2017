package inheritance.triathion;

/**
 * Created by yoavl_000 on 14/08/2017.
 */
public class Triathion extends Race {
    public String field;


    public String type()
    {

        return field;
    }

    public String winnerString(Team teamOne, Team teamTwo)
    {
        if(teamOne.avergeSpeedOfTeam()>teamTwo.avergeSpeedOfTeam())
        {
            return "the winner are the first team";
        }
        else //notice that if TeamOne speed == teamTwo speed. then TeamTwo wins.
        {

            return "the winner are the second team";
        }

    }

}
