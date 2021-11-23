package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName,String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        String codeName = String.format("%nCode Number: %s",this.codeNumber);
        return super.toString() + codeName;
    }
}
