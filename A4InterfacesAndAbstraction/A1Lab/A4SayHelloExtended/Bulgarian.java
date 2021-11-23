package A4InterfacesAndAbstraction.A1Lab.A4SayHelloExtended;

public class Bulgarian extends BasePerson{
    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
