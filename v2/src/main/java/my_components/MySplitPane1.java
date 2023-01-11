package my_components;

import interfaces.MainPanel;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import javax.swing.JSplitPane;

public class MySplitPane1 extends JSplitPane{
    
    MainPanel mainPanel;

    public MySplitPane1() {
        configure();
    }

    public MySplitPane1(int newOrientation) {
        super(newOrientation);
        configure();
    }

    public MySplitPane1(int newOrientation, boolean newContinuousLayout) {
        super(newOrientation, newContinuousLayout);
        configure();
    }

    public MySplitPane1(MainPanel mainPanel, int newOrientation, Component newLeftComponent, Component newRightComponent) {
        super(newOrientation, newLeftComponent, newRightComponent);
        this.mainPanel = mainPanel;
        configure();
    }

    public MySplitPane1(int newOrientation, boolean newContinuousLayout, Component newLeftComponent, Component newRightComponent) {
        super(newOrientation, newContinuousLayout, newLeftComponent, newRightComponent);
        configure();
    }
    
    
    private void configure(){
        this.addPropertyChangeListener(JSplitPane.DIVIDER_LOCATION_PROPERTY, (PropertyChangeEvent pce) -> {
            this.mainPanel.resizeComponents();
        });
    }
}
