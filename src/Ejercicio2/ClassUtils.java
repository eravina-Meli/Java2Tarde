package Ejercicio2;

public class ClassUtils {

    public static double areaPromedio(FiguraGeometrica arr[]){
        //Calcular el area promedio de las figuras contenidas en el array
        double area=0;

        for (FiguraGeometrica f : arr){
            area += f.area();
        }

        return area/arr.length;
    }
}
