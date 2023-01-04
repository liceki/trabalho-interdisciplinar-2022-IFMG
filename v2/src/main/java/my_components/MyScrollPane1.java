package my_components;

import java.awt.Component;
import javax.swing.JScrollPane;
import tools.MouseWheelController;

public class MyScrollPane1 extends JScrollPane {

    MouseWheelController mwc;
    
    public MyScrollPane1(Component view, int vsbPolicy, int hsbPolicy) {
        super(view, vsbPolicy, hsbPolicy);
        setSpeed();
    }

    public MyScrollPane1(Component view) {
        super(view);
        setSpeed();
    }

    public MyScrollPane1(int vsbPolicy, int hsbPolicy) {
        super(vsbPolicy, hsbPolicy);
        setSpeed();
    }

    public MyScrollPane1() {
        setSpeed();
    }
    
    private void setSpeed(){
        this.getVerticalScrollBar().setUnitIncrement(16);
        this.getHorizontalScrollBar().setUnitIncrement(10);
        
        this.mwc = new MouseWheelController(this, 7);
    }
}
