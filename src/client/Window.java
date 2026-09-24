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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, orientation.getAxis()));
    }

    /*JPanel addPanel(Orientation orientation){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, orientation.getAxis()));
        panel.setComponentOrientation(null);

        panels.add(panel);
        return panel;
    }

    JButton addButton(JPanel panel){
        JButton button = new JButton("button");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
        buttons.add(button);
        return button;
    }

    *//*void addBorder(JComponent component, JPanel panel, int topIndent, int leftIndent, int bottomIndent, int rightIndent){
        JPanel tempPanel = new JPanel();
        tempPanel.setLayout(new BoxLayout(tempPanel, Orientation.VERTICAL.getAxis()));
        tempPanel.setSize(component.getSize());
        tempPanel.add(component);
        tempPanel.setBorder(BorderFactory.createEmptyBorder(topIndent,leftIndent,bottomIndent,rightIndent));
        panel.add(tempPanel);
    }*//*

    JComponent addTextArea(JPanel panel, boolean withScroll, int width, int height){
        JTextArea textArea = new JTextArea(2,20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        Font font = new Font("Times new roman", Font.PLAIN, 18);
        textArea.setFont(font);

        if(withScroll){
            JScrollPane textScroll = new JScrollPane(
                    textArea,
                    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
            );

            textScroll.setMaximumSize(new Dimension(width, height));
            panel.add(textScroll);
            return textScroll;
        }else{
            panel.setMaximumSize(new Dimension(width, height));
            panel.add(textArea);
            return textArea;
        }
    }


    JScrollPane addScroll(JPanel panel){
        return new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }*/

    // try smth

    JPanel createPanel(Orientation orient){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, orient.getAxis()));
        panel.setComponentOrientation(null);
        panels.add(panel);
        return panel;
    }

    JPanel createPanel(Orientation orient, int prefMaxWidth, int prefMaxHeight){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, orient.getAxis()));
        panel.setComponentOrientation(null);
        panel.setMaximumSize(new Dimension(prefMaxWidth, prefMaxHeight));
        panel.setPreferredSize(new Dimension(prefMaxWidth, prefMaxHeight));
        panels.add(panel);
        return panel;
    }

    JButton createButton(String title){
        JButton button = new JButton(title);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttons.add(button);
        return button;
    }

    JButton createButton(String title, int prefMaxWidth, int prefMaxHeight){
        JButton button = new JButton(title);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(prefMaxWidth, prefMaxHeight));
        button.setPreferredSize(new Dimension(prefMaxWidth, prefMaxHeight));
        buttons.add(button);
        return button;
    }

    JTextArea createTextArea(int rows, int columns, int fontType, int fontSize){
        JTextArea textArea = new JTextArea(rows,columns);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        Font font = new Font("Times new roman", fontType, fontSize);
        textArea.setFont(font);
        return textArea;
    }

    JTextArea createTextArea(int rows, int columns, int fontType, int fontSize, int prefMaxWidth, int prefMaxHeight){
        JTextArea textArea = new JTextArea(rows,columns);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        Font font = new Font("Times new roman", fontType, fontSize);
        textArea.setFont(font);
        textArea.setPreferredSize(new Dimension(prefMaxWidth, prefMaxHeight));
        textArea.setMaximumSize(new Dimension(prefMaxWidth, prefMaxHeight));
        return textArea;
    }

    JScrollPane addScroll(JComponent component){
        JScrollPane scrollPane = new JScrollPane(component, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        return scrollPane;
    }

    JScrollPane addScroll(JComponent component, int prefMaxWidth, int prefMaxHeight){
        JScrollPane scrollPane = addScroll(component);
        scrollPane.setPreferredSize(new Dimension(prefMaxWidth, prefMaxHeight));
        scrollPane.setMaximumSize(new Dimension(prefMaxWidth, prefMaxHeight));
        return scrollPane;
    }

    JPanel addBorder(JComponent component, int topIndent, int leftIndent, int bottomIndent, int rightIndent) {
        JPanel tempPanel = new JPanel();
        tempPanel.setLayout(new BoxLayout(tempPanel, Orientation.VERTICAL.getAxis()));

        tempPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, component.getMaximumSize().height + topIndent + bottomIndent));

        tempPanel.add(component);
        tempPanel.setBorder(BorderFactory.createEmptyBorder(topIndent, leftIndent, bottomIndent, rightIndent));
        return tempPanel;
    }
}
