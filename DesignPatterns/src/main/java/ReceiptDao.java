
import java.util.List;


/**
 *
 * @author Daniel Mesa
 */
public interface ReceiptDao extends CRUD<Receipt> {
    @Override
    public List<Receipt> getAll();
    @Override
    public Receipt get(int id);
    @Override
    public void update(int id);
    @Override
    public void delete(int id);
    @Override
    public void post(Receipt t);
}
