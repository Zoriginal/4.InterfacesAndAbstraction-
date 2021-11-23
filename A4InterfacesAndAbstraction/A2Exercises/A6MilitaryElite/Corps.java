package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

public enum Corps {
    AIR_FORCES,
    MARINES;

    public static Corps parseCorps(String corps){
        switch (corps){
            case "Airforces":
                return AIR_FORCES;
            case "Marines":
                return MARINES;
            default:
                throw new IllegalArgumentException("Unknown Corps " + corps);
        }
    }
}
