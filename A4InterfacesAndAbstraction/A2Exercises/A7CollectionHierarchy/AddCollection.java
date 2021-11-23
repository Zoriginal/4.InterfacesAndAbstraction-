package A4InterfacesAndAbstraction.A2Exercises.A7CollectionHierarchy;

public class AddCollection extends Collection implements Addable{

    @Override
    public int add(String element) {
        super.getItems().add(element);
        return super.getItems().indexOf(element);
    }
}
