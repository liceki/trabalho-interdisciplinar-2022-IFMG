package my_components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class MyTextField1 extends JTextField{

    public MyTextField1() {
        configureTextField();
    }

    public MyTextField1(String text) {
        super(text);
        configureTextField();
    }

    public MyTextField1(int columns) {
        super(columns);
        configureTextField();
    }

    public MyTextField1(String text, int columns) {
        super(text, columns);
        configureTextField();
    }

    public MyTextField1(Document doc, String text, int columns) {
        super(doc, text, columns);
        configureTextField();
    }
    
    private void configureTextField(){
        this.setText("");
        this.setFont(new Font("Dialog", 1, 14));
        this.setBackground(new Color(52,58,64));
        this.setForeground(new Color(255, 255, 255));
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255,255,255)));
    }
}
