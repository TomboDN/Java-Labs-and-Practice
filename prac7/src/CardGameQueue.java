import java.util.*;

public class CardGameQueue {
    private int steps = 0;
    private final Queue<Integer> firstDeck;
    private final Queue<Integer> secondDeck;

    public CardGameQueue(){
        firstDeck = new LinkedList<>();
        secondDeck = new LinkedList<>();
    }
    public void addCardFirstDeck(int number){
        firstDeck.offer(number);
    }
    public void addCardSecondDeck(int number){
        secondDeck.offer(number);
    }
    private void winnerFirst(){
        int cardPlayerOne = firstDeck.remove();
        int cardPlayerTwo = secondDeck.remove();
        firstDeck.offer(cardPlayerOne);
        firstDeck.offer(cardPlayerTwo);
    }
    private void winnerSecond(){
        int cardPlayerOne = firstDeck.remove();
        int cardPlayerTwo = secondDeck.remove();
        secondDeck.offer(cardPlayerOne);
        secondDeck.offer(cardPlayerTwo);
    }
    public void doStep(){
        if (firstDeck.element() == 0){
            winnerFirst();
        }
        else if (secondDeck.element() == 0){
            winnerSecond();
        }
        else if (firstDeck.element() > secondDeck.element()){
            winnerFirst();
        }
        else {
            winnerSecond();
        }
        steps+=1;
    }

    public static void main(String[] args) {
        CardGameQueue game = new CardGameQueue();
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
