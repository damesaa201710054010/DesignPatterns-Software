
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Daniel Mesa
 */
public class ClientDaoImpl implements ClientDao {
    
    @Override
    public List<Client> getAll(){
        
    }
    @Override
    public Client get(int id){
        
    }
    @Override
    public void update(int id){
        
    }
    @Override
    public void delete(int id){
        
    }
    @Override
    public void post(Client t){
        try{
             ConnectionDB connect = Fabrica.getConnection("MySql");
             Connection conec = connect.connectionOn();
             PreparedStatement st = conec.prepareStatement("INSERT INTO Client (nombre) VALUES(?)");
             st.setString(0, x);
        }catch(Exception e){
            
        }finally {
            
        }
    }
}
