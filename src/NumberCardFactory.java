// concrete factory
public class NumberCardFactory implements CardFactory {
    // implementing createCard method for NumberCard
    @Override
    public Card createCard(int cardNumber, Color cardColor, int cardCode) {
        return new NumberCard(cardNumber, cardColor, cardCode);
    }
}
