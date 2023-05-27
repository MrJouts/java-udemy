public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("123123123", 5000.00, "Bob Brown", "bob@hotmail.com", "9739-872");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.depositFunds(500);
        bobsAccount.withdrawFunds(800);
        bobsAccount.withdrawFunds(2200);
    }
}