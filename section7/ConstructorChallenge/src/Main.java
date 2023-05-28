public class Main {
    public static void main(String[] args) {
        Customer nobody = new Customer();
        System.out.println(nobody.getName());
        System.out.println(nobody.getEmail());
        System.out.println(nobody.getCreditLimit());

        Customer maria = new Customer("maria", "maria@mail.com");
        System.out.println(maria.getName());
        System.out.println(maria.getEmail());
        System.out.println(maria.getCreditLimit());

        Customer bob = new Customer("Bob", 10000.00, "bob@email.com");
        System.out.println(bob.getName());
        System.out.println(bob.getEmail());
        System.out.println(bob.getCreditLimit());
    }
}