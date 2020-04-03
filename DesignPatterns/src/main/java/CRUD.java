
import java.util.List;

/**
 *
 * @author Daniel Mesa
 * @param <T>
 */
public interface CRUD <T>{
    public List<T> getAll();
    public T get(int id);
    public void update(int id);
    public void delete(int id);
    public void post(T t);
}
