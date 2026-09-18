package client;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        //Window window = new Window();
        Window window = new Window("ToDoList", 50, 50, true, Orientation.HORIZONTAL);

        JPanel mainPanel = window.addPanel(Orientation.HORIZONTAL);
        window.setContentPane(mainPanel);

        window.setVisible(true);

        JPanel panelL = window.addPanel(Orientation.VERTICAL);
        JPanel panelR = window.addPanel(Orientation.VERTICAL);

        window.addButton(panelL);
        window.addButton(panelL);
        window.addButton(panelL);
        window.addButton(panelL);
        window.addButton(panelL);
        window.addTextArea(panelR);
        window.addTextArea(panelR);
        window.addTextArea(panelR);
        window.addTextArea(panelR);
        window.addTextArea(panelR);

        JScrollPane scrollPane = window.addScroll(mainPanel);
        window.setContentPane(scrollPane);

        window.revalidate();
        window.repaint();
    }
}
