package client;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        //Window window = new Window();
        Window window = new Window("ToDoList", 50, 50, true, Orientation.HORIZONTAL);

        JPanel mainPanel = window.addPanel(Orientation.VERTICAL);
        window.setContentPane(mainPanel);



        JScrollPane scrollPane = window.addScroll(mainPanel);
        window.setContentPane(scrollPane);

        JPanel panelL = window.addPanel(Orientation.VERTICAL);
        JPanel panelR = window.addPanel(Orientation.VERTICAL);

        for (int i = 0; i < 5; i++) {
            JPanel tempPanel = window.addPanel(Orientation.HORIZONTAL);
            //window.addButton(tempPanel, 10, 10);
            JButton button = window.addButton(tempPanel);
            window.addBorder(button,tempPanel, 10, 10, 10, 10);
            window.addTextArea(tempPanel, true, Integer.MAX_VALUE, 50);
            mainPanel.add(tempPanel);
        }
        window.setVisible(true);
        /*window.revalidate();
        window.repaint();*/
    }
}
