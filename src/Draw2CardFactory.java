// concrete factory
public class Draw2CardFactory implements CardFactory {
    // implementing createCard method for Draw2Card
    @Override
    public Card createCard(int cardScore, Color cardColor, int cardCode) {
        return new Draw2Card(cardColor, cardCode);
    }
}
