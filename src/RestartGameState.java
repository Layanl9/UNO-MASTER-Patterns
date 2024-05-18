public class RestartGameState implements GameState{
    @Override
    public void handleGame(StateContext context){
        context.setState(this);
        GameCreation.reset();
        Run.playUNO();
    }

}
