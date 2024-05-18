public class EndState implements state {
    @Override
    public void handleEndGame() {
        System.out.println("Game has ended. Thank you for playing!");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "End State";
    }
}
