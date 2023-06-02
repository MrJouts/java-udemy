public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println(tim.getAge());
        System.out.println(tim.collectPay());
        System.out.println("----------------");

        SalariedEmployee joe = new SalariedEmployee("Tim", "20/10/1986", "02/05/2022", 35_000.00);
        System.out.println(joe);
        System.out.println(joe.collectPay());
        joe.retire();
        System.out.println(joe.collectPay());
        System.out.println("----------------");

        HourlyEmployee carla = new HourlyEmployee("Carla", "15/03/1970", "12/04/2020", 15);
        System.out.println(carla);
        System.out.println(carla.collectPay());
        System.out.println(carla.getDoublePay());
    }
}