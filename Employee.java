//Subclass
public class Employee extends Person  {   //Inheritance (Kalıtım)

    private  int id;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id,String name,int salary){
        super(name);
        this.id = id;
        this.salary = salary;

    }

}
