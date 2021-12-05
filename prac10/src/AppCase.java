import javax.swing.*;
import java.awt.event.ActionEvent;

public class AppCase extends JFrame {
    public AppCase(ICreateDocument factory) {
        super("Какое-то приложение");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu(factory));
        setJMenuBar(menuBar);
        setSize(600,400);
        setVisible(true);
    }
    private JMenu createFileMenu(ICreateDocument factory) {
        final IDocument[] document = new IDocument[1];
        JMenu file = new JMenu("Файл");
        JMenuItem create = new JMenuItem("Новый");
        create.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    AppCase.super.remove(document[0].getPanel());
                } catch (NullPointerException e2) {
                    System.out.println("Начальной панели не было");
                }
                document[0] = factory.createNew();
                AppCase.super.add(document[0].getPanel());
                setVisible(true);
            }
        });

        JMenuItem open = new JMenuItem("Открыть");
        open.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    AppCase.super.remove(document[0].getPanel());
                } catch (NullPointerException e2) {
                    System.out.println("Начальной панели не было");
                }
                document[0] = factory.createOpen();
                AppCase.super.add(document[0].getPanel());
                setVisible(true);
            }
        });

        JMenuItem save = new JMenuItem("Сохранить");
        save.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document[0].saveFile();
            }
        });

        JMenuItem exit = new JMenuItem("Выход");
        exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        file.add(create);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        return file;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppCase(new CreateTextDocument());
            }
        });
    }
}
