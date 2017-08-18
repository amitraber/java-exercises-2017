package inheritance;

import inheritance.animal.Animal;
import inheritance.animal.Dog;
import inheritance.animal.Eagle;
import inheritance.animal.Fish;
import inheritance.triathion.Team;
import inheritance.triathion.Triathion;
import inheritance.vehicles.Car;
import inheritance.vehicles.Helicopter;
import inheritance.vehicles.Submarine;

import java.util.ArrayList;

/**
 * Created by yoavl_000 on 11/08/2017.
 */
public class Main {

    public static void main(String[] args) {
        Triathion firstRace= new Triathion();


        Car audi= new Car();
        Helicopter aphci= new Helicopter();
        Submarine yellowSubmarine= new Submarine();

        Team vehicleTeam= new Team(audi,aphci ,yellowSubmarine);


        Dog dogi= new Dog();
        Eagle birdi= new Eagle();
        Fish fishi= new Fish();

        Team animalTeam= new Team (dogi,birdi, fishi);

        System.out.println( firstRace.winnerString(vehicleTeam, animalTeam));


        Triathion secondRace= new Triathion();

        Team dogTeam= new Team(dogi, dogi, dogi);

        System.out.println( firstRace.winnerString(dogTeam, animalTeam));


    }
}