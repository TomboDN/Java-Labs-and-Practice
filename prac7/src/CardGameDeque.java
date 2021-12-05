import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class CardGameDeque {
    private int steps = 0;
    private final Deque<Integer> firstDeck;
    private final Deque<Integer> secondDeck;

    public CardGameDeque(){
        firstDeck = new LinkedList<>();
        secondDeck = new LinkedList<>();
    }
    public void addCardFirstDeck(int number){
        firstDeck.addLast(number);
    }
    public void addCardSecondDeck(int number){
        secondDeck.addLast(number);
    }
    private void winnerFirst(){
        int cardPlayerOne = firstDeck.removeFirst();
        int cardPlayerTwo = secondDeck.removeFirst();
        firstDeck.addLast(cardPlayerOne);
        firstDeck.addLast(cardPlayerTwo);
    }
    private void winnerSecond(){
        int cardPlayerOne = firstDeck.removeFirst();
        int cardPlayerTwo = secondDeck.removeFirst();
        secondDeck.addLast(cardPlayerOne);
        secondDeck.addLast(cardPlayerTwo);
    }
    public void doStep(){
        if (firstDeck.getFirst() == 0){
            winnerFirst();
        }
        else if (secondDeck.getFirst() == 0){
            winnerSecond();
        }
        else if (firstDeck.getFirst() > secondDeck.getFirst()){
            winnerFirst();
        }
        else {
            winnerSecond();
        }
        steps+=1;
    }

    public static void main(String[] args) {
        CardGameDeque game = new CardGameDeque();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять карт первой колоды:");
        for (int i = 1;i <= 5; i++){
            game.addCardFirstDeck(input.nextInt());
        }
        System.out.println("Введите пять карт второй колоды:");
        for (int i = 1;i <= 5; i++){
            game.addCardSecondDeck(input.nextInt());
        }
        while (true){
            if (game.steps >= 106){
                System.out.println("\nbotva");
                break;
            }
            if (game.firstDeck.isEmpty()){
                System.out.println("second "+game.steps);
                break;
            }
            if (game.secondDeck.isEmpty()){
                System.out.println("first "+game.steps);
                break;
            }
            game.doStep();
        }
    }
}
