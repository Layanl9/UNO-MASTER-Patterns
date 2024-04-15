// concrete factory
public class ReverseCardFactory implements CardFactory {
    // implementing createCard method for ReverseCard
    @Override
    public Card createCard(int cardScore, Color cardColor, int cardCode){
        return new ReverseCard(cardColor, cardCode);
    }

}
