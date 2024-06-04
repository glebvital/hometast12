class Engineer extends Employee{
    private String specialty;

    public Engineer(String name, int id, double salary, String specialty) {
        super(name, id, salary);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    String getDetails() {
        return "Engineer name: "+getName()+", Engineer id: "+getId()+", Engineer salary: "+getSalary()+", Engineer specialty: "+ getSpecialty();
    }
}
