package A4InterfacesAndAbstraction.A1Lab.A6Ferrari;

public class Ferrari implements Car{
    private final String driverName;
    private final String MODEL = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",MODEL,brakes(),gas(),driverName);
    }
}
