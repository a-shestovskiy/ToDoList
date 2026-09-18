package client;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Window extends JFrame {

    private List<JPanel> panels = new ArrayList<>();
    private List<JButton> buttons = new ArrayList<>();

    Window(){
        super("Title");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth, screenHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, Orientation.VERTICAL.getAxis()));
        //setContentPane(panel);
        //add(new JPanel());
    }

    Window(String title, int width, int height, boolean percentOfScreen, Orientation orientation){
        super(title);
        if(percentOfScreen){
            double widthPr = width / 100.0;
            double heightPr = height / 100.0;
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int scr = screenSize.width;
            width = (int) (widthPr * screenSize.width);
            height = (int) (heightPr * screenSize.height);
            setSize(width, height);
        } else{
            setSize(width, height);
        }
        //setLayout(new BoxLayout(this, orientation.getAxis()));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, orientation.getAxis()));
        //setContentPane(panel);
        //add(new JPanel());
    }

    //BoxLayout
    //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    JPanel addPanel(Orientation orientation){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, orientation.getAxis()));
        panel.setComponentOrientation(null);

        this.add(panel);
        panels.add(panel);
        return panel;
    }

    void addButton(JPanel panel){
        JButton button = new JButton("button");
        panel.add(button);
        buttons.add(button);
    }

    void addTextArea(JPanel panel){
        JTextArea textArea = new JTextArea(2,20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        Font font = new Font("Times new roman", Font.PLAIN, 18);
        textArea.setFont(font);
        panel.add(textArea);
    }

    JScrollPane addScroll(JPanel panel){
        return new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    JPanel getMainPanel(){
        return (JPanel) this.getContentPane();
    }
}
