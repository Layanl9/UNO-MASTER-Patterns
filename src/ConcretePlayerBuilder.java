// cocnrete builder
public class ConcretePlayerBuilder implements PlayerBuilder {
    private String firstName;
    private String playerPass;

    // Implement build method
    @Override
    public Player build() {
        return new Player(firstName, playerPass);
    }

    @Override
    public PlayerBuilder buildFirstName(String firstName) {
        this.firstName = firstName;
        return this;

    }

    @Override
    public PlayerBuilder buildPassword(String playerPass) {
        this.playerPass = playerPass;
        return this;
    }
}
