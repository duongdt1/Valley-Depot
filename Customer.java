
package groupProject;

public class Customer {
     public String firstName; 
    public String lastName; 
    public String address; 
    public String phone; 
    public String email; 
    public static int customerID = 0; 
    
    public Customer() { //0 parameter constructor
        firstName = ""; 
        lastName = ""; 
        address = ""; 
        phone = ""; 
        email = ""; 
        customerID++;
    }
    
    public Customer(String firstName, String lastName, String address, String phone, 
            String email) {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.address = address; 
        this.phone = phone; 
        this.email = email; 
        customerID++; 
    }
    
    
    public String toString() {
        return ""; 
    }

}
