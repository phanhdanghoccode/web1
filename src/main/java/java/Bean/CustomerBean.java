/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java.Bean;


public class CustomerBean 
{
    String customerID;
    String customerName;
    String customerPhone;
    String customerAddress;
    String customerPassportNumber;

    public CustomerBean() {
    }

    public void setCustomerPassportNumber(String customerPassportNumber) {
        this.customerPassportNumber = customerPassportNumber;
    }

    public String getCustomerPassportNumber() {
        return customerPassportNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
}
