package client;

import javax.swing.*;

public enum Orientation {
    VERTICAL(BoxLayout.Y_AXIS),
    HORIZONTAL(BoxLayout.X_AXIS);

    private final int swingAxis;

    Orientation(int swingAxis){
        this.swingAxis = swingAxis;
    }

    public int getAxis(){
        return swingAxis;
    }
}
