package ArrayLists.AutoBoxingUnBoxingLinkedList;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String nameOfBranch) {
        this.name = nameOfBranch;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if(findCustomer(nameOfCustomer) == null) {
        this.customers.add(new Customer(nameOfCustomer, initialTransaction));
        return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transactionAmount) {
        Customer exsistingCustomer = findCustomer(nameOfCustomer);
        if(exsistingCustomer != null){
            exsistingCustomer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName(i).equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
