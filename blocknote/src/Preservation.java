import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Preservation implements ActionListener {

    private final JTextArea textArea;

    public Preservation(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        saveTextToFile(textArea.getText());
    }

    private void saveTextToFile(String textToSave) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(textToSave);
            writer.close();
            JOptionPane.showMessageDialog(null, "Текст успешно сохранен в файл output.txt");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл.");
            e.printStackTrace();
        }
    }
}
