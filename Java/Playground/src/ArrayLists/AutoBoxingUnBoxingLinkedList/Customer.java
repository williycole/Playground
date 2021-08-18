package ArrayLists.AutoBoxingUnBoxingLinkedList;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String nameOfCustomer, double initialAmount) {
        this.name = nameOfCustomer;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public String getName(int i) {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }
}
