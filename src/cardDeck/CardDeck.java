package cardDeck;

import java.util.*;

public class CardDeck {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();

        List<Card> cards = new ArrayList<>();
        List<Card> used = new ArrayList<>();
        //   List<Card> allCards = new ArrayList<>();

        cardDeck.pachetDeCarti(cards);
        cardDeck.allCardsAfisare(cards);

        cardDeck.dealHand(5, cards, used);
       cardDeck.dealHand(5, cards, used);
//        cardDeck.dealHand(5, cards, used);
//        cardDeck.shuffle(used, cards);
        cardDeck.usedCardsAfisare(used);
        cardDeck.getUsedCardCount(used);
        cardDeck.getAvailableCardCount(cards);
    }

    private void allCardsAfisare(List<Card> cards) {
        for (int j = 0; j < cards.size(); j++) {
            System.out.print(cards.get(j).getPriorityNumbers() + " ");
            System.out.println(cards.get(j).getType());
        }
    }

    private void pachetDeCarti(List<Card> cards) { // available cards
        for (int i = 2; i <= 14; i++) {
            Card card1 = new Card();
            card1.setType("diamonds \u200B♦\u200B");
            card1.setPriorityNumbers(i);
            cards.add(card1);
            Card card2 = new Card();
            card2.setType("clubs ♣");
            card2.setPriorityNumbers(i);
            cards.add(card2);
            Card card3 = new Card();
            card3.setType("hearts \u200B♥\u200B");
            card3.setPriorityNumbers(i);
            cards.add(card3);
            Card card4 = new Card();
            card4.setType("spades ♠");
            card4.setPriorityNumbers(i);
            cards.add(card4);

        }
    }

    List<Card> dealHand(int cardss, List<Card> cards, List<Card> used) {

        for (int i = 0; i < cardss; i++) {
            Random r = new Random();
            int low = 0;
            int high = 52;
            int result = r.nextInt(high - low) + low;
            System.out.println("Ai ales cartea " + cards.get(result).getType() + cards.get(result).getPriorityNumbers());
            used.add(cards.get(result));
            cards.remove(cards.get(result));

        }

        System.out.println("Size " + cards.size());
        return cards;
    }

    void shuffle(List<Card> used, List<Card> cards) {
        cards.addAll(used);
        used.clear();
        System.out.println("Numarul de carti disponibile " + cards.size());
        Collections.shuffle(cards);
    }

    private void usedCardsAfisare(List<Card> used) {
        System.out.println("Used cards");
        for (int j = 0; j < used.size(); j++) {
            System.out.print(used.get(j).getPriorityNumbers() + " ");
            System.out.println(used.get(j).getType());
        }
    }

    void getAvailableCardCount(List<Card> cards) {
        System.out.println("Cartile care sunt disponibile "+cards.size());
    }

    void getUsedCardCount(List<Card> used) {
        System.out.println("Cartile care sunt folosite " + used.size());
    }
}


