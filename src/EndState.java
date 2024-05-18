public class EndState implements GameState {
    @Override
    public void handleGame(StateContext context) {
        System.out.println("Game has ended. Thank you for playing!");
        System.exit(0);
    }
    
    public String toString() {
        return "End State";
    }
}
