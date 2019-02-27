package lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {

    static ArrayList<String> createDeck() {
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        ArrayList<String> deck = new ArrayList<>();

        for (String suit : suits){
            for (String card : cards){
                deck.add(card + " of " + suit);
            }
        }
        return deck;
    }

    static int[] createRandomArr(int size, int from, int to) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (from + Math.random() * (to - from)));
        }
        return arr;
    }

    public static int[][] createRandomArr(int sizeX, int sizeY, int from, int to) {
        int[][] arr = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                arr[i][j] = ((int) (from + Math.random() * (to - from)));
            }
        }
        return arr;
    }
}
