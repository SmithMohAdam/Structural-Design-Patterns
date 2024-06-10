public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        SalaryAdapter adapter = new SalaryAdapter();
        MachineOperator operator = new MachineOperator();
        operator.setName("Ali");
        operator.setBasicSalary(2000.00);


        Double sl = adapter.calcSalary(operator);

        System.out.println(sl);

    }
}