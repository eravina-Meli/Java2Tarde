package Ejercicio2;

public class mainEjercicio2 {
    public static void main(String[] args) {
        double area =0;
        FiguraGeometrica[] figuras = {
                //new Circulo(10),
                new Rectangulo(20,10),
                new Triangulo(5,15)
        };

            area = ClassUtils.areaPromedio(figuras);
            System.out.println("El area promedio de las figuras es : " + area);
    }
}
