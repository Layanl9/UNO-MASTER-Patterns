public class RestartGameState implements State{
    @Override
    public void handleGame(StateContext context){
        context.setState(this);
        GameCreation.reset();
        Run.playUNO();
    }

}
