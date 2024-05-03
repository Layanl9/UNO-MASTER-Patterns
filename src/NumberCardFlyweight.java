// Concrete Flyweight Factory
import java.util.HashMap;
public class NumberCardFlyweight implements CardFactory {
    private static final HashMap<String, NumberCard> numberCardPool = new HashMap<>();

    @Override
    public Card createCard(int cardNumber, Color cardColor, int cardCode) {
        String key = cardNumber + "-" + cardColor.toString();

        if(numberCardPool.containsKey(key)){
            return numberCardPool.get(key);
        }
        else{
            NumberCard numberCard = new NumberCard(cardNumber, cardColor, cardCode);
            numberCardPool.put(key, numberCard);
            return numberCard;
        }
    }
}