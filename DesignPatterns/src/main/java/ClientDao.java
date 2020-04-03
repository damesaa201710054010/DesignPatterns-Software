
import java.util.List;

/**
 *
 * @author Daniel Mesa
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
