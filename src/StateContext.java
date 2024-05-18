public class StateContext {
    private State state;

    public StateContext() {
        state = new RunningState(); // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

}
