
import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Mesa
 */
public interface ConnectionDB {
    public Connection connectionOn() throws Exception;
    public void connectionOff() throws Exception;
}
