package my_components;

import java.awt.Cursor;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class MyButton1 extends JButton{

    public MyButton1() {   
        super();
        ConfigureButton();
    }

    public MyButton1(Icon icon) {
        super(icon);
        ConfigureButton();
    }

    public MyButton1(String text) {
        super(text);
        ConfigureButton();
    }

    public MyButton1(Action a) {
        super(a);
        ConfigureButton();
    }

    public MyButton1(String text, Icon icon) {
        super(text, icon);
        ConfigureButton();
    }
    
    private void ConfigureButton(){
        this.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        this.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        this.setPreferredSize(new java.awt.Dimension(100, 40));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setText("");
    }
}
