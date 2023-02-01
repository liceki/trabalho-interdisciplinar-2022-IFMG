package my_components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import javax.swing.text.Document;

public class MyPasswordField1 extends JPasswordField{
    private final Color DEFAULT_BACKGROUND_COLOR = new Color(52, 58, 64);

    public MyPasswordField1() {
        configurePasswordField();
    }

    public MyPasswordField1(String text) {
        super(text);
        configurePasswordField();
    }

    public MyPasswordField1(int columns) {
        super(columns);
        configurePasswordField();
    }

    public MyPasswordField1(String text, int columns) {
        super(text, columns);
        configurePasswordField();
    }

    public MyPasswordField1(Document doc, String text, int columns) {
        super(doc, text, columns);
        configurePasswordField();
    }

    private void configurePasswordField() {
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
