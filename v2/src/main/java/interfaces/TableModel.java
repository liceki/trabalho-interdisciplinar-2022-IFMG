package interfaces;

import java.util.List;

public interface TableModel {
    public void loadObjects();
    public void setResults(List results);
    public void addObject(Object obj);
    public Object getObjectAtRowIndex(int rowIndex);
    public void removeObjectAtRowIndex(int rowIndex);
}
