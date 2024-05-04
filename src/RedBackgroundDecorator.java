// A concrete decorator adding a red background to the person's name
public class RedBackgroundDecorator extends PersonDecorator {

    public RedBackgroundDecorator(Person decoratedPerson) {
        super(decoratedPerson);
    }

    @Override
    public String getFirstName() {
        String redBackground;
        redBackground= Color.getColorCodeString(Color.RED_B) + super.getFirstName() + Color.getColorCodeString(Color.RESET);
        return redBackground;
    }
}