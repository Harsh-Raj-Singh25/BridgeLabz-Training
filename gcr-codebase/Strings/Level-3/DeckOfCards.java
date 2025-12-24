import java.util.*;
public class DeckOfCards {
	// declare static variables for suits and ranks 
    static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
	// methods
	// for initialization of deck 
    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
	// for shuffling deck
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
	// for distribution of cards
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute");
        }
        String[][] players = new String[numPlayers][cardsPerPlayer];
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[i * cardsPerPlayer + j];
            }
        }
        return players;
    }
	// for printing cards of players
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        int numPlayers = 4;
        int cardsPerPlayer = 5;
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
        printPlayersCards(players);
    }
}