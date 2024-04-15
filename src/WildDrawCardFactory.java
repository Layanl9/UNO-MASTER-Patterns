// concrete factory
public class WildDrawCardFactory implements CardFactory {
    // implementing createCard method for WildDrawCard
    @Override
    public Card createCard(int cardNumber, Color cardColor, int cardCode) {
        return new WildDrawCard(cardCode);
    }

}
