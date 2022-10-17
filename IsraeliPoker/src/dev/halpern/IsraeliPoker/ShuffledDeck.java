package dev.halpern.IsraeliPoker;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffledDeck {
    private LinkedList<Card> deck = new LinkedList<>();
    public ShuffledDeck() {
        for (int i = Card.SPADES; i <= Card.CLUBS; i++) {
            for (int j = Card.ACE; j <= Card.KING; j++) {
                deck.add(new Card(j, i));
            }
        }
        Collections.shuffle(deck);
    }

    public int remainingCards() {
        return deck.size();
    }

    public Card draw() {
        return deck.pop();
    }
}
