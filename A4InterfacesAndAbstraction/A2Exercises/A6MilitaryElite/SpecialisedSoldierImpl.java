package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public Corps getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        try {
            this.corps = Corps.parseCorps(corps);
        }catch (Exception ex){
            throw new IllegalArgumentException("Not a valid Corp");
        }

    }
    @Override
    public String toString() {
        String corp;
        if(corps.name().equals("AIR_FORCES")){
            corp = "Corps: Airforces";
        }else{
            corp = "Corps: Marines";
        }
        return super.toString() + "\r\n" + corp;
    }
}
