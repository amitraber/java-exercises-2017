package inheritance.triathion;

import inheritance.Movable;

/**
 * Created by yoavl_000 on 14/08/2017.
 */
public class Team {
    public Movable groundMember;
    public  Movable airMember;
    public Movable waterMember;

    public Team(Movable groundMember, Movable airMember, Movable waterMember) {
        this.groundMember = groundMember;
        this.airMember = airMember;
        this.waterMember = waterMember;
    }

    public  void startRace(int[] args)
    {

    }

    public  void switchMembers()
    {

    }

    public  void advance()
    {

    }

    public  int avergeSpeedOfTeam()
    {
        int averageSpeed= (groundMember.getBaseSpeed()+groundMember.getTopSpeed() +
                airMember.getTopSpeed()+airMember.getBaseSpeed() +
                waterMember.getBaseSpeed()+waterMember.getTopSpeed())
                /3;

        return averageSpeed;

    }

    @Override
    public String toString() {
        return "Team{" +
                  groundMember+
                 airMember
                 + waterMember +
                '}';
    }
}
