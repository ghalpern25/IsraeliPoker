package dev.halpern.IsraeliPoker;
public class Card {

    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card(int card) {
        value = card % 13;
        suit = card / 13;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public int getInt() {
        return value + (suit * 13);
    }

    @Override
    public String toString() {
        return "{" + value + ", " + suit + "}";
    }
}
