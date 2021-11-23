package A4InterfacesAndAbstraction.A1Lab.A4SayHelloExtended;

public class European extends BasePerson{
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
