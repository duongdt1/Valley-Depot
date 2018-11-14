
package groupProject;
import java.util.*; 

public class ValleyDepotApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        int menuOption = 0; 
        String firstName = ""; 
        String lastName = ""; 
        String phone = ""; 
        String address = ""; 
        String email = ""; 
        String item = ""; 
        String businessName = "";
        String vendorName = "";
        String vendorAddress = "";
        String vendorPhoneNumber = "";
        String description = ""; 
        
        int quantity = 0;
        
        double weight = 0.0; 
        double paidPrice = 0.0; 
        double salePrice = 0.0; 
        
        
        while (menuOption < 9)
        {
            System.out.println("Welcome to Valley Depot!"); 
            System.out.println("============================================");
            System.out.println("Menu Options: "); 
            System.out.println("1: Add customer");
            System.out.println("2: Edit customer"); 
            System.out.println("3: Add contractor");
            System.out.println("4: Edit contractor");
            System.out.println("5: Add item"); 
            System.out.println("6: Edit item"); 
            System.out.println("7: Enter sale"); 
            System.out.println("8: Add vendor");
            System.out.println("9: Edit vendor"); 
            System.out.println("10: Print report"); 
            System.out.println("11: Exit program"); 
            System.out.print("Select an option from above: ");
            menuOption = in.nextInt(); 
            System.out.println("============================================");
            
            //Add customer option
            if (menuOption == 1)
            {
                fillCustomerInfo(firstName, lastName, address, phone, email); 
            }
            
            //Edit customer 
            if (menuOption == 2)
            {
                
            }
            
            //Add contractor 
            if (menuOption == 3)
            {
                fillContractorInfo(firstName, lastName, address, phone, email, businessName);
            }   
            
            //Edit contractor
            if (menuOption == 4)
            {
                
            }
            
            //Add item
            if (menuOption == 5)
            {
                fillItemInfo(item, weight, paidPrice, salePrice, description);
            }
            
            //Edit item
            if (menuOption == 6)
            {
                
            }
            
            //Enter sale
            if(menuOption == 7)
            {
                fillSaleInfo(quantity);
                
            }
            
            //Add vendor
            if (menuOption == 8)
            {
                fillVendorInfo(vendorName, vendorAddress, vendorPhoneNumber);
            }
            
            //Edit vendor
            if (menuOption == 9)
            {
                
            }
            
            //Print report
            if (menuOption == 10)
            {
                
            }
            
            //Exit menu
            if (menuOption == 11)
            {
                System.exit(0);
            }
        }
     
    }
    
    public static void fillCustomerInfo(String firstName, String lastName, String address, String phone, String email)
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter customer first name: "); 
        firstName = in.nextLine(); 
        while (firstName.isEmpty())
        {
            System.out.print("Please enter a first name for customer:");
            firstName = in.nextLine(); 
        }
        System.out.print("Enter customer last name: "); 
        lastName = in.nextLine(); 
        while (lastName.isEmpty())
        {
            System.out.print("Please enter last name for customer:");
            lastName = in.nextLine(); 
        }
        System.out.print("Enter address: "); 
        address = in.nextLine(); 
        while (address.isEmpty())
        {
            System.out.print("Please enter customer's address: "); 
            address = in.nextLine(); 
        }
        System.out.print("Enter phone number: "); 
        phone = in.nextLine(); 
        while (phone.isEmpty())
        {
            System.out.print("Please enter customer's 10 digit phone number (XXXXXXXXXX)");
            phone = in.nextLine(); 
        }
        System.out.print("Enter email address: "); 
        email = in.nextLine(); 
        while (email.isEmpty())
        {
            System.out.print("Please enter customer's email address: "); 
            email = in.nextLine(); 
        }
    }
    
    public static void fillContractorInfo(String firstName, String lastName, String address, String phone, 
            String email, String businessName)
    {
        Scanner in = new Scanner(System.in); 
        
        System.out.print("Enter contractor first name: "); 
        firstName = in.nextLine(); 
        while (firstName.isEmpty())
        {
            System.out.print("Please enter a first name for contractor:");
            firstName = in.nextLine(); 
        }
        
        System.out.print("Enter contractor last name: "); 
        lastName = in.nextLine(); 
        while (lastName.isEmpty())
        {
            System.out.print("Please enter last name for contractor:");
            lastName = in.nextLine(); 
        }
        
        System.out.print("Enter address: "); 
        address = in.nextLine(); 
        while (address.isEmpty())
        {
            System.out.print("Please enter contractor's address: "); 
            address = in.nextLine();
        }
        
        System.out.print("Enter phone number: "); 
        phone = in.nextLine(); 
        while (phone.isEmpty())
        {
            System.out.print("Please enter contractor's 10 digit phone number (XXXXXXXXXX)");
            phone = in.nextLine(); 
        }
        
        System.out.print("Enter email address: "); 
        email = in.nextLine(); 
        while (email.isEmpty())
        {
            System.out.print("Please enter contractor's email address: "); 
            email = in.nextLine(); 
        }
        
        System.out.print("Enter business name: "); 
        businessName = in.nextLine(); 
        while (businessName.isEmpty())
        {
            System.out.print("Please enter contractor's business name: "); 
            email = in.nextLine(); 
        }
    }
    
    public static void fillItemInfo(String item, double weight, double pricePaid, 
            double salePrice, String description) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter item name: "); 
        item = in.nextLine(); 
        
        while (item.isEmpty())
        {
            System.out.print("Please enter item: "); 
            item = in.nextLine(); 
        }
        System.out.print("Enter item weight: "); 
        weight = in.nextDouble(); 
        
        while (weight == 0)
        {
            System.out.print("Please enter item weight: "); 
            weight = in.nextDouble();
        }
        
        System.out.print("Enter price paid: "); 
        pricePaid = in.nextDouble(); 
        
        while (pricePaid <= 0.0)
        {
            System.out.print("Please enter price paid: "); 
            pricePaid = in.nextDouble(); 
        }
        System.out.print("Enter for sale price: "); 
        salePrice = in.nextDouble(); 
        
        while (salePrice <= 0.0)
        {
            System.out.print("Please enter sale price: ");
            salePrice = in.nextDouble(); 
        }
        System.out.print("Enter item description: "); 
        description = in.nextLine(); 

        while (description.isEmpty())
        {
            System.out.print("Please enter the item's description: "); 
            description = in.nextLine(); 
        }

    }
    
    public static void fillVendorInfo (String vendorName, String vendorAddress, String vendorPhoneNumber)
    {
        Scanner in = new Scanner(System.in);
        
        while (vendorName.isEmpty())
        {
            System.out.print("Enter vendor name: ");
            vendorName = in.nextLine();
        }
        
        while (vendorAddress.isEmpty())
        {
        System.out.print("Enter vendor address: ");
        vendorName = in.nextLine();
        }
        
        while (vendorPhoneNumber.isEmpty())
        {
        System.out.print("Enter vendor phone number: ");
        vendorName = in.nextLine();
        }
    }
    
    public static void fillSaleInfo(int quantity)
    {
        Scanner in = new Scanner(System.in);
        
        while (quantity <= 0)
        {
            System.out.print("Enter sale quantity: ");
            quantity = in.nextInt();
        }

       
    }
    
}
