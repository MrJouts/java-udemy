public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();

        bobsAccount.setNumber("1239081293");
        bobsAccount.setBalance(1000);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("bob@hotmail.com");
        bobsAccount.setCustomerPhone("7364-0833");

        bobsAccount.depositFunds(500);
        bobsAccount.withdrawFunds(800);
        bobsAccount.withdrawFunds(2200);
    }
}