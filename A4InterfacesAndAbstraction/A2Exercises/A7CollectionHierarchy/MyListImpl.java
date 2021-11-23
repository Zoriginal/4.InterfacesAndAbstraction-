package A4InterfacesAndAbstraction.A2Exercises.A7CollectionHierarchy;

public class MyListImpl extends Collection implements MyList{
    @Override
    public int getUsed() {
        return super.getItems().size();
    }

    @Override
    public String remove() {
        return super.getItems().remove(0);
    }

    @Override
    public int add(String element) {
        super.getItems().add(0,element);
        return getItems().indexOf(element);
    }
}
