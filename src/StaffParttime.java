public class StaffParttime extends Staff {
           public  int workinghours;

    public StaffParttime(int workinghours) {
        this.workinghours = workinghours;
    }

    public StaffParttime(int id, String name, int age, int phoneNumber, String email, int workinghours) {
        super(id, name, age, phoneNumber, email);
        this.workinghours = workinghours;
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }

    @Override
    public String toString() {
        return "StaffParttime{" +
                "workinghours=" + workinghours +
                '}';
    }
    public int getSalary(){
        return  (int) (getWorkinghours() * 10000);
    }
}
