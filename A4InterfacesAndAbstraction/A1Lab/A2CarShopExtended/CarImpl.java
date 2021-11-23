package A4InterfacesAndAbstraction.A1Lab.A2CarShopExtended;

public class CarImpl implements Car {

    private final String model;
    private final String color;
    private final Integer horsePower;
    private final String countryProduced;

    protected CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires%n",getModel(), getCountryProduced(), Car.TIRES);
    }
}
