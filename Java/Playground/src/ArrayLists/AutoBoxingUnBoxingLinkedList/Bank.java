package ArrayLists.AutoBoxingUnBoxingLinkedList;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String nameOfBranch, ArrayList<Branch> branches) {
        this.name = nameOfBranch;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String nameOfBranch){
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(nameOfBranch)){
                return checkedBranch;
            }
        }
        return null;
    }



    public boolean addBranch(String nameOfBranch) {
        if(findBranch(nameOfBranch) == null){
            this.branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction){
        Branch branch = findBranch(nameOfBranch);
        if(branch != null){
            return branch.newCustomer(nameOfCustomer, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transactionAmount){
        Branch branch = findBranch(nameOfBranch);
        if(branch != null){
            return branch.addCustomerTransaction(nameOfCustomer, transactionAmount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("details" + branch.getName());

//            ArrayList<Customer> branchCustomers = branch.getCustomers();
//            for (int i = 0; i < branchCustomers.size(); i++) {
//                Customer branchCustomer = new Customer()
//            }
        }
        return false;
    }


}
