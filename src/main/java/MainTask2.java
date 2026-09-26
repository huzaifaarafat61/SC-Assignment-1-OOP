public class MainTask2 {

    public static void main(String[] args) {

        Employee[] employees = {
            new Developer("Ali", 80000, 15000),
            new SalesManager("Ahmed", 70000, 500000, 0.05),
            new Developer("Usman", 90000, 20000),
            new SalesManager("Hamza", 75000, 400000, 0.04)
        };

        for (Employee employee : employees) {

            System.out.println(
                employee.getName() +
                " Final Pay: Rs. " +
                employee.calculatePay()
            );
        }
    }
}