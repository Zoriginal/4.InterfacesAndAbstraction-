package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
