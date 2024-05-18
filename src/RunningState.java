public class RunningState implements state {
    @Override
    public void handleEndGame() {
        System.out.println("Cannot handle end game in running state.");
    }

    @Override
    public String toString() {
        return "Running State";
    }
}
