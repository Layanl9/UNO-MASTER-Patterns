public class RunningState implements State {
    @Override
    public void handleGame(StateContext context) {
        System.out.println("Running State.");
    }

    @Override
    public String toString() {
        return "Running State";
    }
}
