import java.util.ArrayList;
import java.util.Random;

public class Cards {
    private String[] cardList = (new String[]{"Col Mustard", "Prof Plum", "Rev Green", "Mrs Peacock", "Miss Scarlett", "Mrs White",
        "Dagger", "Candlestick", "Revolver", "Lead Piping", "Rope", "Spanner",
        "Study", "Hall", "Kitchen", "Ballroom", "Library", "Billiart Room", "Dining Room", "Lounge", "Conservatory"});
 // this creates a new string array with the names  of the players, weapons and rooms

          Cards() {
        createCard();
    }
    


    private Card getCard(String name) {
        for (Card u : cards) {
            if (u.hasCardName(name)) {
                return u;
            }
        }
        return null;
    }