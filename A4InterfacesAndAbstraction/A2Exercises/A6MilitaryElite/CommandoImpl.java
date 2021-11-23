package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

import java.util.ArrayList;
import java.util.List;


public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary,corps);
        this.missions = new ArrayList<>();
    }

    public void addMission(Mission mission){
        missions.add(mission);
    }

    @Override
    public List<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" +  "Missions:";
    }
}
