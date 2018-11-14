
package groupProject;
 
    public class Item{
    public String itemName;
    public double weight;
    private double paidPrice;
    private double salePrice;
    public String description;
    
    //Constructor
    
    public Item(String itemName, double weight, 
            String description, double paidPrice, double salePrice)
    {
        this.itemName = itemName;
        this.weight = weight;
        this.description = description;
        this.paidPrice = paidPrice; 
        this.salePrice = salePrice;
    }
    
    public boolean setpaidPrice(double paidPrice)
    {
        if (paidPrice > 0)
        {
            this.paidPrice = paidPrice;
            return true;
        }
        else
            return false;
    }
    
    public double getpaidPrice()
    {
        return paidPrice;
    }
    
    public boolean setsalePrice(double salePrice)
    {
        if (salePrice > 0)
        {
            this.salePrice = salePrice;
            return true;
        }
        else
            return false;
    }
    
    public double getsalePrice()
    {
        return salePrice;
    }
    
    public String toString()
    {
	return("this is item class");
    }
    
}
