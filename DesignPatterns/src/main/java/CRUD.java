
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danys
 * @param <T>
 */
public interface CRUD <T>{
    public List<T> getAll();
    public T get(int id);
    public void update(int id);
    public void delete(int id);
    public void post(T t);
}
