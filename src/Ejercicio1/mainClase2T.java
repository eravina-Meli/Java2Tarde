package Ejercicio1;

public class mainClase2T {
    public static void main(String[] args) {
        //La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula,
        // al menos una mayúscula y al menos un caracter no alfanumérico.
       String regex = "Carreatondine";
       //PasswordFuerte p = new PasswordFuerte(regex);

        PasswordIntermedia intermedia = new PasswordIntermedia(regex);
    }
}
