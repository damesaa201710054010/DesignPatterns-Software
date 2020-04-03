/*
 * This class is only representative
 */

/**
 *
 * @author Daniel Mesa
 */
public class OracleConnection implements ConnectionDB{
    
    private static OracleConnection connection;
    
    private OracleConnection(){}
    
    public static OracleConnection getInstance(){
        if(connection == null){
            connection = new OracleConnection();
        }
        return connection;
    }
    
    /*@Override
    public Connection connectionOn(){
        System.out.println("DataBase connected");
    }*/
    
    @Override
    public void connectionOff(){
        System.out.println("Database desconnected");
    }
}
