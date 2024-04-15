// concrete factory
public class WildCardFactory implements CardFactory {
    // implementing createCard method for WildCard
    @Override
    public Card createCard(int cardNumber, Color cardColor, int cardCode) {
        return new WildCard(cardCode);
    }

}
