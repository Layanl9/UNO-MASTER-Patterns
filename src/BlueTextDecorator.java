public class BlueTextDecorator extends PersonDecorator{
    public BlueTextDecorator(Person decoratedPerson) {
        super(decoratedPerson);
    }

    @Override
    public String getFirstName() {
        String blueText;
        blueText= Color.getColorCodeString(Color.BLUE) + super.getFirstName() + Color.getColorCodeString(Color.RESET);
        return blueText;
    }

}
