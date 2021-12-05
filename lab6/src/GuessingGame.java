import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuessingGame extends JFrame {
    int counter = 0;
    int neededNumber = (int)(Math.random()* 21);
    String higherLower;
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman", Font.BOLD,20);
    JButton guess = new JButton("Попробовать угадать");
    GuessingGame()
    {
        super("Игра-угадайка");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(350, 200);
        add(jta);
        jta.setForeground(Color.BLUE);
        jta.setFont(fnt);
        add(guess);
        guess.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent event)
        {
            if (Integer.parseInt(jta.getText()) == neededNumber) {
                int result = JOptionPane.showConfirmDialog(null, "Вы угадали число", "Результат", JOptionPane.DEFAULT_OPTION);
                if (result == 0) System.exit(0);
            }
            else
            {
                if (neededNumber > Integer.parseInt(jta.getText())) {
                    higherLower = "больше";
                }
                else {
                    higherLower = "меньше";
                }
                counter+=1;
                JOptionPane.showMessageDialog(null, "Вы не угадали число, оно " + higherLower);
                if (counter == 3){
                    int exit_result = JOptionPane.showConfirmDialog(null, "Вы проиграли", "Результат", JOptionPane.DEFAULT_OPTION);
                    if (exit_result == 0) System.exit(0);
                }
            }
        }
        });
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new GuessingGame();
    }
}
