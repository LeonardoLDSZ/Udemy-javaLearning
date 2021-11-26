package _01exercisesSequentialStructure.exerciseSixEntities;

public class Geometry {
    public double A;
    public double B;
    public double C;
    double pi = 3.14159;
    public double areaTriangleRectangle(){
        return A * C / 2;
    }
    public double areaCircle(){
        return pi * (C * C);
    }
    public double areaTrapeze(){
        return (A + B) * C / 2;
    }
    public double areaSquare(){
        return B * B;
    }
    public double areaRectangle(){
        return A * B;
    }

}
