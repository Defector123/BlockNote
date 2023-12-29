import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    private JTextArea text;

    public Interface() {
        super("BlockNote");
        super.setSize(400, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(2, 1));

        text = new JTextArea("", 50, 50);
        text.setFont(new Font("Dialog", Font.PLAIN, 14));
        text.setTabSize(10);

        JButton save = new JButton("Сохранить");
        Preservation preservation = new Preservation(text);
        save.addActionListener(preservation);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(save);

        container.add(panel);
        container.add(new JScrollPane(text));

        setVisible(true);
    }


}
