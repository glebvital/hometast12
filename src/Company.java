import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        if (employee!=null){
            employees.add(employee);
        }
    }
    public void removeEmployee(int id){
        for (Employee employee : employees){
            if (id==employee.getId()){
                System.out.println(employee.getName()+" have been fired from company");
                employees.removeIf(employee1 -> (employee instanceof Employee));
            }
        }
    }
    public void listEmployees(){
        System.out.println("--------------");
        for (Employee employee:employees){
            if (employee instanceof Manager){
                System.out.println(employee.getDetails());
            } else if (employee instanceof Engineer) {
                System.out.println(employee.getDetails());
            }
        }
        System.out.println("--------------");
    }
}
