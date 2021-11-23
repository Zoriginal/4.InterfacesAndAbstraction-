package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }
    @Override
    public void addPrivate(PrivateImpl privates) {
        this.privates.add(privates);
    }
    @Override
    public String toString() {
        privates = privates.stream().sorted((x,y) -> y.getId() - x.getId()).collect(Collectors.toList());
        String priv = "";
        for (PrivateImpl aPrivate : privates) {
            priv = priv.concat("\r\n" +  "  " + aPrivate.toString());
        }
        return super.toString() + "\r\n" + "Privates:" + priv ;
    }
}
