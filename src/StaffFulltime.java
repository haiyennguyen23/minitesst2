public class StaffFulltime extends Staff{
    private double bonus;
    private double fine;
    private int salary;

    public StaffFulltime() {
    }

//    @Override
//    public int getSalary() {
//        return getSalary() + getBonus() -getFine();
//
//    }

    public StaffFulltime(int id, String name, int age, int phoneNumber, String email) {
        super(id, name, age, phoneNumber, email);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StaffFulltime{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", salary=" + salary +
                '}';
    }

}
