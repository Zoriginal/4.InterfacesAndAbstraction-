package A4InterfacesAndAbstraction.A1Lab.A1CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();

}
