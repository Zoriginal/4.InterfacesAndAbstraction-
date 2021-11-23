package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

public enum State {
    IN_PROGRESS,
    FINISHED;

    public static State parseState(String state) {
        switch (state) {
            case "inProgress":
                return IN_PROGRESS;
            case "finished":
                return FINISHED;
            default:
                throw new IllegalArgumentException("");
        }
    }
}
