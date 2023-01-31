package interfaces;

import java.util.List;

public interface Repository {
    public Object saveObject(Object obj);
    public Object findObjectById(int id);
    public Object updateObject(Object obj);
    public void deleteObject(Object objToRemove);
    public List getAllObjects();
    public List findObjectsWithFilters(Object objFilter);
    public void close();
}
