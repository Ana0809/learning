package cardDeck;

import java.util.*;

public class CardDeck {
    List<Card> cards = new ArrayList<>();
    List<Card> used = new ArrayList<>();
    //   List<Card> allCards = new ArrayList<>();

    void allCardsAfisare() {
        for (int j = 0; j < cards.size(); j++) {
            System.out.print(cards.get(j).getPriorityNumbers() + " ");
            System.out.println(cards.get(j).getType());
        }
    }

    void pachetDeCarti() { // available cards
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

    List<Card> dealHand(int cardss) {
        for (int i = 0; i < cardss; i++) {
            if(cards.size()>0) {
                Random r = new Random();
                int low = 0;
                int high = cards.size();
                int result = r.nextInt(high - low) + low;
                System.out.println("Ai ales cartea " + cards.get(result).getType() + cards.get(result).getPriorityNumbers());
                used.add(cards.get(result));
                cards.remove(cards.get(result));
            } else {
                System.out.println("S a golit ista de carti");
                break;
            }
        }
        System.out.println("Size " + cards.size());
        return used;
    }

    void shuffle() {
        cards.addAll(used);
        used.clear();
        System.out.println("Numarul de carti disponibile " + cards.size());
        Collections.shuffle(cards);
    }

    void usedCardsAfisare() {
        System.out.println("Used cards");
        for (int j = 0; j < used.size(); j++) {
            System.out.print(used.get(j).getPriorityNumbers() + " ");
            System.out.println(used.get(j).getType());
        }
    }

    void getAvailableCardCount() {
        System.out.println("Cartile care sunt disponibile " + cards.size());
    }

    void getUsedCardCount() {
        System.out.println("Cartile care sunt folosite " + used.size());
    }
}


