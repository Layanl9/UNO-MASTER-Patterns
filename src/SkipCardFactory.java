// concrete factory
public class SkipCardFactory implements CardFactory {
    // implementing createCard method for SkipCard
    @Override
    public Card createCard(int cardNumber, Color cardColor, int cardCode){
        return new SkipCard(cardColor, cardCode);
    }

}
