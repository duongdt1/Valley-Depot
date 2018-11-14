
package groupProject;

public class Sale {
    Item itemName;
    public int quantity;
    java.util.Date date;
    
    
    public Sale(Item itemName, int quantity, 
            java.util.Date date)
    {
        this.itemName = itemName;
        this.quantity = quantity;
        this.date = date;
    }
    
    public String toString()
    {
        return "";
    }
}
