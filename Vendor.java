
package groupProject;

public class Vendor {
    public String vendorName;
    public String vendorAddress;
    public String vendorPhoneNumber;
    
    public Vendor(String vendorName, String vendorAddress, String vendorPhoneNumber)
    {
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
    
    public String toString()
    {
        return("this is Vendor class");
    }
}
