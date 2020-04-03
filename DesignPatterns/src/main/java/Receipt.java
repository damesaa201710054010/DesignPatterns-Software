
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Daniel Mesa
 */
public class Receipt {
    private int nroReceipt;
    private String receiptDate;
    private int clientId;
    private int totalBill;
    private String state;
    private List<Integer> items;
    public Receipt(int nroReceipt, String receiptDate, int clientId, 
            int totalBill, String state)
    {
        this.nroReceipt = nroReceipt;
        this.receiptDate = receiptDate;
        this.clientId  = clientId;
        this.totalBill = totalBill;
        this.state = state;
        this.items = new  ArrayList<Integer>();
    }
    
    public int getNroReceipt(){
        return this.nroReceipt;
    }
    
    public String getReceiptDate(){
        return this.receiptDate;
    }
    public int getClientId(){
        return this.clientId;
    }
    public int getTotalBill(){
        return this.totalBill;
    }
    
    public String getState(){
        return this.state;
    }
    
    public void setNroReceipt(int nroReceipt){
        this.nroReceipt = nroReceipt;
    }
    
    public void setReceiptDate(String receiptDate){
         this.receiptDate = receiptDate;
    }
    public void setClientId(int clientId){
        this.clientId = clientId;
    }
    public void setTotalBill(int totalBill){
        this.totalBill = totalBill;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public void addItem(int idItem){
        //idItem = idItem;
        this.items.add(idItem);
    }
    
    public void deleteItem(int idItem){
        //idItem = idItem;
        this.items.remove(idItem);
    }   
}
