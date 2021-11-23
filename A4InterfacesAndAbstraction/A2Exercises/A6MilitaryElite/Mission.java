package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        setState(state);
    }

    public String getCodeName() {
        return codeName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        try {
            this.state = state;
        }catch (Exception ex){
            return;
        }
    }

    private void completeMission() {
        this.state = State.FINISHED;
    }
    @Override
    public String toString() {
        String st;
        if(state.name().equals("IN_PROGRESS")){
            st = "inProgress";
        }else {
            st = "finished";
        }
        return String.format("  Code Name: %s State: %s",codeName,st);
    }
}
