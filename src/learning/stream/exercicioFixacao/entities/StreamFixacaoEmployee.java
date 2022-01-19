package stream.exercicioFixacao.entities;

public class StreamFixacaoEmployee {

    private String name;
    private String email;
    private Double salary;

    public StreamFixacaoEmployee(String name, String email, Double salario) {
        this.name = name;
        this.email = email;
        this.salary = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
