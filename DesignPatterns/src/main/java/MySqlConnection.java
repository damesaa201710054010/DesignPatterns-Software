import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Daniel Mesa
 */
public class MySqlConnection implements ConnectionDB{
    private static MySqlConnection connection;
    private Connection conec;
    private String user = "root";
    private String pass = "2611";
    private String DB_URL = "jdbc:mysql://localhost:3306/receipts";
    private String JDBC_driver = "com.mysql.jdbc.Driver";
    
    private MySqlConnection(){}
    
    public static MySqlConnection getInstance(){
        if(connection == null){
            connection = new MySqlConnection();
        }
        return connection;
    }
    
    @Override
    public Connection connectionOn() throws Exception{
        try{
            conec = DriverManager.getConnection(DB_URL, user, pass);
            Class.forName(JDBC_driver);
            return conec;
        }catch(Exception e){
            throw e;
        }
    }
    
    @Override
    public void connectionOff() throws Exception{
        if(conec != null){
            if(!conec.isClosed()){
                conec.close();
            }
        }
    }
}
