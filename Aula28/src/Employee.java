public class Employee {
    public String name;
    public double grossSalary; //salário bruto
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        this.grossSalary += ((grossSalary * percentage) / 100);
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }

}

