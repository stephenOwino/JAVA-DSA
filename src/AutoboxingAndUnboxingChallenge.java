import java.util.ArrayList;

public class AutoboxingAndUnboxingChallenge {

    record Customer(String name, ArrayList<Double> transactions) {

        public Customer(String name, double initialDeposit) {
            this(name.toUpperCase(), new ArrayList<>(500));
            transactions.add(initialDeposit);
        }

    }

    static void main() {

        /*
Autoboxing & Unboxing Challenge Requirements

Create a simple banking application.

Create a Customer class.

Customer has a name.

Customer has an ArrayList of transactions.

Transactions must use the Double wrapper class.

A transaction can be:

A credit (positive value).

A debit (negative value).

Create a Bank class.

Bank has a name.

Bank has an ArrayList of customers.

Bank functionality:

Add a new customer if they are not already in the list.

Add a transaction to an existing customer.

Print a customer statement.

The printed statement must include:

Customer name.

List of transaction amounts.

Printing transactions must demonstrate unboxing.

*/


        Customer steve = new Customer("Steve", 1000);
        System.out.println(steve);


        Bank bank = new Bank("EQUITY");
        bank.addNewCustomer("Joyce",500);
        System.out.println(bank);


        bank.addTransaction("Joyce" , -10.25);
        bank.addTransaction("joyce" , -75.60);
        bank.printStatement("Joyce");

        bank.addNewCustomer("steve", 30);
        bank.addTransaction("steve" , 300.00);
        bank.printStatement("steve");

    }

    static class Bank {
        private String name;
        private ArrayList<Customer> customers = new ArrayList<>(5000);

        public Bank(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Bank{" +
                    "name='" + name + '\'' +
                    ", customers=" + customers +
                    '}';
        }

        private Customer getCustomer(String customerName) {
            for (var customer : customers) {
                if (customer.name().equalsIgnoreCase(customerName)) {

                    return customer;
                }
            }
            System.out.printf("Customer (%s) wasn't found %n" , customerName);
            return null;
        }
        public void addNewCustomer(String customerName, double initialDeposit){
            if (getCustomer(customerName) == null){
                Customer customer = new Customer(customerName, initialDeposit);
                customers.add(customer);
                System.out.println("New Customer added: " + customer);
            }
        }
        public void addTransaction(String name , double transactionAmount){
            Customer customer = getCustomer(name);
            if (customer != null){
                customer.transactions().add(transactionAmount);
            }
        }
        public void printStatement(String customerName){
            Customer customer = getCustomer(customerName);
            if (customer == null){
                return;
            }
            System.out.println("_".repeat(30));
            System.out.println("Customer Name: " + customer.name());
            System.out.println("Transactions: ");
            for (double d : customer.transactions()){ //unboxing
                System.out.printf("$%10.2f (%s)%n", d ,d < 0? "debit" : "credit");
            }

        }

    }
}
