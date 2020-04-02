/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danys
 */
public class OracleConnection implements Connection{
    
    private static OracleConnection connection;
    
    private OracleConnection(){}
    
    public static OracleConnection getInstance(){
        if(connection == null){
            connection = new OracleConnection();
        }
        return connection;
    }
    
    @Override
    public void connectionOn(){
        System.out.println("DataBase connected");
    }
    
    @Override
    public void connectionOff(){
        System.out.println("Database desconnected");
    }
}
