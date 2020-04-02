/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danys
 */
public class Client {
    private int idClient;
    private String name ;
    private String lastName ;
    private char gender ;
    private String birthDate ;
    private String maritalStatus ;
    
    public Client(int idClient, String name, String lastName, 
            char gender, String birthDate, String maritalStatus){
        this.idClient = idClient;
        this.name = name;
        this.lastName= lastName;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
    }
    
    public int getIdClient(){
        return this.idClient;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
    public String getMaritalStatus(){
        return this.maritalStatus;
    }
    
    public char getGender(){
        return this.gender;
    }
    
    public void setIdClient(int idClient){
        this.idClient = idClient;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
    
    public void setGender(char gender){
        this.gender = gender;
    }
    
}
