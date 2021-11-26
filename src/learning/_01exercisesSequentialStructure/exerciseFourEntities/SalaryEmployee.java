package _01exercisesSequentialStructure.exerciseFourEntities;

public class SalaryEmployee {

    public String id;
    public int hours;
    public double hoursValue;

    public double salary(){
        return hours * hoursValue;
    }

}
