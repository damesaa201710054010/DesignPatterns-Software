
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danys
 */
public interface ClientDao extends CRUD<Client> {
    @Override
    public List<Client> getAll();
    @Override
    public Client get(int id);

    /**
     *
     * @param id
     */
    @Override
    public void update(int id);

    /**
     *
     * @param id
     */
    @Override
    public void delete(int id);
    @Override
    public void post(Client t);
}
