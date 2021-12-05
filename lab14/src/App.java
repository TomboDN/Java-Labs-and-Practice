import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class App {
    JFrame frame = new JFrame();
    JButton num0 = new JButton("0");
    JButton num1 = new JButton("1");
    JButton num2 = new JButton("2");
    JButton num3 = new JButton("3");
    JButton num4 = new JButton("4");
    JButton num5 = new JButton("5");
    JButton num6 = new JButton("6");
    JButton num7 = new JButton("7");
    JButton num8 = new JButton("8");
    JButton num9 = new JButton("9");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton equal = new JButton("=");
    JButton multiply = new JButton("*");
    JButton subtract = new JButton("/");
    JButton leftBracket = new JButton("(");
    JButton rightBracket = new JButton(")");
    JButton erase = new JButton("C");
    JButton eraseOne = new JButton("<--");
    JTextField label = new JTextField("");

    App(){
        frame.setTitle("Калькулятор");
        num0.setBounds(50, 290, 50, 50);
        plus.setBounds(120, 290, 50, 50);
        minus.setBounds(190, 290, 50, 50);
        equal.setBounds(260, 290, 50, 50);
        num1.setBounds(50, 220, 50, 50);
        num2.setBounds(120, 220, 50, 50);
        num3.setBounds(190, 220, 50, 50);
        multiply.setBounds(260, 220, 50, 50);
        num4.setBounds(50, 150, 50, 50);
        num5.setBounds(120, 150, 50, 50);
        num6.setBounds(190, 150, 50, 50);
        subtract.setBounds(260, 150, 50, 50);
        num7.setBounds(50, 80, 50, 50);
        num8.setBounds(120, 80, 50, 50);
        num9.setBounds(190, 80, 50, 50);
        leftBracket.setBounds(260, 80, 50, 25);
        rightBracket.setBounds(260, 105, 50, 25);
        label.setBounds(50, 35, 330, 40);
        erase.setBounds(330, 290, 50, 50);
        eraseOne.setBounds(330, 220, 50, 50);

        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "0");
            }
        });
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "1");
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "2");
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "3");
            }
        });
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "4");
            }
        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "5");
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "6");
            }
        });
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "7");
            }
        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "8");
            }
        });
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "9");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "+");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "-");
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "*");
            }
        });
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "/");
            }
        });
        leftBracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "(");
            }
        });
        rightBracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + ")");
            }
        });
        erase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("");
            }
        });
        eraseOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText().substring(0, label.getText().length()-1));
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReversePolish gotRPN = new ReversePolish();
                List<String> listOfExpressions = gotRPN.parseExpression(label.getText());
                boolean isRight = ReversePolish.isRight;
                if (isRight){
                    for (String str : listOfExpressions){
                        System.out.println(str + " ");
                    }
                    System.out.println();
                    label.setText(String.valueOf(DecimalCalc.decimalCalc(listOfExpressions)));
                }
                else {
                    label.setText("");
                    JOptionPane.showMessageDialog(frame, "Запись с ошибками");
                }
            }
        });
        frame.add(num0);
        frame.add(plus);
        frame.add(minus);
        frame.add(equal);
        frame.add(num1);
        frame.add(num2);
        frame.add(num3);
        frame.add(multiply);
        frame.add(num4);
        frame.add(num5);
        frame.add(num6);
        frame.add(subtract);
        frame.add(num7);
        frame.add(num8);
        frame.add(num9);
        frame.add(leftBracket);
        frame.add(rightBracket);
        frame.add(label);
        frame.add(erase);
        frame.add(eraseOne);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
