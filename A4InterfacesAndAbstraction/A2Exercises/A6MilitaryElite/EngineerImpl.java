package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

import java.util.ArrayList;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer{
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary,Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" + "Repairs:";
    }
}
