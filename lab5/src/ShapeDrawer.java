import javax.swing.*;
import java.awt.*;

public class ShapeDrawer extends JFrame
{
    JPanel[] pnl = new JPanel[20];
    public ShapeDrawer()
    {
        setLayout(new GridLayout(4,5));
        for (int i = 0; i < pnl.length; i++)
        {
            GraphicsPanel panel = new GraphicsPanel();
            pnl[i] = new JPanel();
            pnl[i].setBackground(Color.white);
            pnl[i].add(panel);
            add(pnl[i]);
        }
        setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args)
    {
        new ShapeDrawer().setVisible(true);
    }
}




