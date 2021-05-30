package Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PasswordFuerte extends Password {

    public PasswordFuerte(String pwd) {
        super(pwd);
    }

    @Override
    public void setValue(String pwd){
        try {
            Pattern pat = Pattern.compile("^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$");
            Matcher mat = pat.matcher(pwd);

            if (mat.matches()) {
                System.out.println("La Password es correcta");
            } else {
                System.out.println("La contraseña debe tener al menos entre 8 y 16 caracteres, " +
                        "al menos un dígito, al menos una minúscula, al menos una mayúscula " +
                        "y al menos un caracter no alfanumérico.");
            }
        }catch (PatternSyntaxException e){
            e.printStackTrace();
        }
    }

}
