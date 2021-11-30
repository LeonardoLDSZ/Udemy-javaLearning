package polimorfismo.entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee(){}

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getvaluePerHour() {
        return valuePerHour;
    }

    public void setvaluePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public double payment(){
        return hours * valuePerHour;
    }
}
