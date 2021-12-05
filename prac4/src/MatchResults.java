import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MatchResults extends JFrame {
    JPanel[] pnl = new JPanel[2];
    int milanScore = 0;
    int madridScore = 0;
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    public MatchResults(){
        setLayout(new GridLayout(2,1));
        pnl[0] = new JPanel();
        add(pnl[0]);
        pnl[0].add(lastScorer);
        pnl[0].add(result);
        pnl[0].add(winner);

        pnl[1] = new JPanel();
        add(pnl[1]);
        pnl[1].add(milan);
        pnl[1].add(madrid);
        milan.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event){
                milanScore+=1;
                lastScorer.setText("Last Scorer: AC Milan");
                result.setText("Result: "+milanScore+" X "+madridScore);
                if (milanScore > madridScore)
                    winner.setText("Winner: AC Milan");
                else if (milanScore < madridScore)
                    winner.setText("Winner: Real Madrid");
                else winner.setText("Winner: DRAW");
            }
        });
        madrid.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event){
                madridScore+=1;
                lastScorer.setText("Last Scorer: Real Madrid");
                result.setText("Result: "+milanScore+" X "+madridScore);
                if (milanScore > madridScore)
                    winner.setText("Winner: AC Milan");
                else if (milanScore < madridScore)
                    winner.setText("Winner: Real Madrid");
                else winner.setText("Winner: DRAW");
            }
        });
        setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MatchResults().setVisible(true);
    }
}
