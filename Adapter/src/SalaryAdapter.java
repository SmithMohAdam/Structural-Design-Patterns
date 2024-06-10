public class SalaryAdapter extends SalaryCalculator{

    private Employee emp;

    public Double calcSalary(MachineOperator operator){
        if(emp == null){
            emp = new Employee();
        }
        emp.setName(operator.getName());
        emp.setBasicSalary(operator.getBasicSalary());
       return super.calcSalary(emp);
    }
}
