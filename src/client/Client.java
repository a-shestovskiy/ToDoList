package client;

import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        Window window = new Window("ToDoList", 50, 50, true, Orientation.HORIZONTAL);

        JPanel mainPanel = window.createPanel(Orientation.VERTICAL);
        JScrollPane mainScroll = window.addScroll(mainPanel);
        window.setContentPane(mainScroll);

        for (int i = 0; i < 10; i++) {
            JPanel tempPanel = new JPanel(new BorderLayout());

            JButton button = window.createButton("Кнопочка", 120, 35);
            JTextArea textArea = window.createTextArea(2, 10, Font.PLAIN, 18);

            JScrollPane scrollTextArea = window.addScroll(textArea, Integer.MAX_VALUE, 50);

            JPanel borderedButton = window.addBorder(button, 15, 10, 10, 10);

            JPanel borderedText = window.addBorder(scrollTextArea, 10, 10, 10, 10);

            tempPanel.add(borderedButton, BorderLayout.WEST);
            tempPanel.add(borderedText, BorderLayout.CENTER);

            mainPanel.add(tempPanel);
        }

        window.setVisible(true);
    }
}