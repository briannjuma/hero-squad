package Models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    // class fields
    private String name;
    private int Age;
    private String specialAbility;
    private String weakness;
    private String ability;
    private int id;
    private int squadId;


    private static List<Hero> instances = new ArrayList<>();

    // constructor
    public Hero(String name, int Age, String specialAbility, String weakness, String ability, int squadId) {
        this.name = name;
        this.Age = Age;
        this.specialAbility = specialAbility;
        this.weakness = weakness;
        this.ability = ability;
        this.squadId = squadId;
        Squad squad = Squad.find(squadId);
        squad.addHero(this);
        this.id = instances.size();
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public String getWeakness() { return weakness; }

    public String getAbility() { return ability; }

    public int getId() {
        return id;
    }

    public int getSquadId() {
        return squadId;
    }

    public static List<Hero> getAll() {
        return instances;
    }

    public static Hero findHero(int n) {
        return instances.get(n - 1);
    }

}

