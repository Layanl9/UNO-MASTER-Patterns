// The abstract decorator class wrapping Person
public abstract class PersonDecorator extends Person {
    protected Person decoratedPerson;

    public PersonDecorator(Person decoratedPerson) {
        super(decoratedPerson.getFirstName(), decoratedPerson.getLastName(), decoratedPerson.getAge(), decoratedPerson.getGender());
        this.decoratedPerson = decoratedPerson;
    }

    @Override
    public String getFirstName() {
        return decoratedPerson.getFirstName();
    }
}