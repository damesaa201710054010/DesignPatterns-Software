/**
 *
 * @author Daniel Mesa
 */
public class Fabrica {
    public static ConnectionDB getConnection(String motor){
        if(motor.equalsIgnoreCase("MySql")){
            ConnectionDB c = MySqlConnection.getInstance();
            return c;
        }else if(motor.equalsIgnoreCase("ORACLE")){
            ConnectionDB c = OracleConnection.getInstance();
            return c;
        }else
        {
            ConnectionDB c = MySqlConnection.getInstance();
            return c;
        }
    }
}
