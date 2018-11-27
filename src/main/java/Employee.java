import static jdk.nashorn.internal.objects.NativeMath.round;

public abstract class Employee {

    protected String name;
    protected double salary;
    private String niNumber;

    public Employee(String name,String niNumber,double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void raiseSalary(double raise){
        if (raise >= 0.01) {
            this.salary += raise;
        }
    }

    public double bonus(){
        double bonus = (this.salary/100);
        return bonus;
    }
}
