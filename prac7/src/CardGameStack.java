import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class CardGameStack {
    private int steps = 0;
    private final Stack<Integer> firstDeck;
    private final Stack<Integer> secondDeck;

    public CardGameStack(){
        firstDeck = new Stack<>();
        secondDeck = new Stack<>();
    }
    public void addCardFirstDeck(int number){
        firstDeck.push(number);
    }
    public void addCardSecondDeck(int number){
        secondDeck.push(number);
    }
    public void reverseDecks(){
        Collections.reverse(firstDeck);
        Collections.reverse(secondDeck);
    }
    private void winnerFirst(){
        int cardPlayerOne = firstDeck.peek();
        int cardPlayerTwo = secondDeck.peek();
        firstDeck.pop();
        secondDeck.pop();
        Collections.reverse(firstDeck);
        firstDeck.push(cardPlayerOne);
        firstDeck.push(cardPlayerTwo);
        Collections.reverse(firstDeck);
    }
    private void winnerSecond(){
        int cardPlayerOne = firstDeck.peek();
        int cardPlayerTwo = secondDeck.peek();
        firstDeck.pop();
        secondDeck.pop();
        Collections.reverse(secondDeck);
        secondDeck.push(cardPlayerOne);
        secondDeck.push(cardPlayerTwo);
        Collections.reverse(secondDeck);
    }
    public void doStep(){
        if (firstDeck.peek() == 0){
            winnerFirst();
        }
        else if (secondDeck.peek() == 0){
            winnerSecond();
        }
        else if (firstDeck.peek() > secondDeck.peek()){
            winnerFirst();
        }
        else {
            winnerSecond();
        }
        steps+=1;
    }

    public static void main(String[] args) {
        CardGameStack game = new CardGameStack();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять карт первой колоды:");
        for (int i = 1;i <= 5; i++){
            game.addCardFirstDeck(input.nextInt());
        }
        System.out.println("Введите пять карт второй колоды:");
        for (int i = 1;i <= 5; i++){
            game.addCardSecondDeck(input.nextInt());
        }
        game.reverseDecks();
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
