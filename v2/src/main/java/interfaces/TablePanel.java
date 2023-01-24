package interfaces;


public interface TablePanel {
    public TableModel getTableModel();
    public void updateTable();
    public void resizeScrollPanelTable(int firstDivider, int secondDivider);
    public void configureTable();
}
