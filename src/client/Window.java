package client;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    Window(){
        super("Title");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth, screenHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    Window(String title, int width, int height, boolean percentOfScreen){
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
    }
}
