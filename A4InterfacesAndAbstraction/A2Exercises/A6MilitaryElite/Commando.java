package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
