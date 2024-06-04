class Manager extends Employee {
    private String department;
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    String getDetails() {
        return "Manager name: "+getName()+", Manager id: "+getId()+", Manager salary: "+getSalary()+", Manager department: "+getDepartment();
    }
}
