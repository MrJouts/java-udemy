package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);


//        Customer george = new Customer("George", 10);
//        george.addTransaction(100.0);
//        george.addTransaction(140.0);
//        george.addTransaction(20.0);
//        george.addTransaction(-10.0);
//        george.addTransaction(0);
//        System.out.println(george);
//
//        Branch miamiBranch = new Branch("Miami");
//        miamiBranch.newCustomer("Carlos", 100);
//        miamiBranch.newCustomer("Maria", 100);
//        miamiBranch.newCustomer("Juan", -100);
//
//        miamiBranch.addCustomerTransaction("Carlos", 20);
//        miamiBranch.addCustomerTransaction("Carlos", -20);
//        miamiBranch.addCustomerTransaction("Pedro", 20);
//
//        System.out.println(miamiBranch);

    }
}