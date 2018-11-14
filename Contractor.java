
package groupProject;

public class Contractor extends Customer {
    public String businessName; 
    
    public static int contractorNum = 0; 
    
    public Contractor() {
        super();
        this.businessName = ""; 
        contractorNum++; 
    }
    public Contractor(String firstName, String lastName, String address, String phone, 
            String email, String businessName) {
        
        super(firstName, lastName, address, phone, email);
        this.businessName = businessName; 
        
        contractorNum++;
        
    }
    
}

