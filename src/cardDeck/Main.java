package cardDeck;


public class Main {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();

        cardDeck.pachetDeCarti();
        cardDeck.allCardsAfisare();

        cardDeck.dealHand(5);
        cardDeck.dealHand(5);
        cardDeck.dealHand(5);
        cardDeck.dealHand(50);
        cardDeck.dealHand(50);
        cardDeck.dealHand(5);
        cardDeck.shuffle();
        cardDeck.usedCardsAfisare();
        cardDeck.getUsedCardCount();
        cardDeck.getAvailableCardCount();
    }
}
