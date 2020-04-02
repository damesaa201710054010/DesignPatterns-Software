/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danys
 */
public class MySqlConnection implements Connection{
    private static MySqlConnection connection;
    private String user;
    private String pass;
    private String DB_URL;
    private String JDBC_driver;
    private MySqlConnection(){}
    
    public static MySqlConnection getInstance(){
        if(connection == null){
            connection = new MySqlConnection();
        }
        return connection;
    }
    
    @Override
    public void connectionOn(){
        
    }
    
    @Override
    public void connectionOff(){
        
    }
}
