public class StateContext {
    private state state;

    public StateContext() {
        state = new RunningState(); // Initial state
    }

    public void setState(state state) {
        this.state = state;
    }

    public state getState() {
        return state;
    }

    public void endGame() {
        if (!(state instanceof EndState)) {
            state = new EndState();
            state.handleEndGame();
        }
    }
}
