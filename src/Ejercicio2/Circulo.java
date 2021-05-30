package Ejercicio2;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(int radio){
        this.radio=radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2); // PI*Radio al cuadrado
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
