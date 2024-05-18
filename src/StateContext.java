public class StateContext {
    private GameState state;

    public StateContext() {
        state = new RunningState(); // Initial state
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public GameState getState() {
        return state;
    }

}
