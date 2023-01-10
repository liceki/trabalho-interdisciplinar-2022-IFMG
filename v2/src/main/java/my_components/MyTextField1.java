package my_components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class MyTextField1 extends JTextField {
    private final Color DEFAULT_BACKGROUND_COLOR = new Color(52, 58, 64);

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

    private void configureTextField() {
        this.setText("");
        this.setFont(new Font("Dialog", 1, 14));
        this.setBackground(DEFAULT_BACKGROUND_COLOR);
        this.setForeground(new Color(255, 255, 255));
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        
        FocusListener highlighter = new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                e.getComponent().setBackground(new Color(44, 50, 58));
            }

            @Override
            public void focusLost(FocusEvent e) {
                e.getComponent().setBackground(DEFAULT_BACKGROUND_COLOR);
            }
        };
        
        this.addFocusListener(highlighter);
    }
}
