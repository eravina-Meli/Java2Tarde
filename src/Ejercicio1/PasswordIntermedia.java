package Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PasswordIntermedia extends Password {
    public PasswordIntermedia(String regex) {
        super(regex);
    }

    @Override
    public void setValue(String pwd) {
        try {
            Pattern pat = Pattern.compile("[a-zA-Z]{8,16}");
            Matcher mat = pat.matcher(pwd);

            if (mat.matches()) {
                System.out.println("La Password es correcta");
            } else {
                System.out.println("Comprobar si el String cadena está formado por un mínimo de 5 " +
                        "letras mayúsculas o minúsculas y un máximo de 10");
            }
        }catch (PatternSyntaxException e){
            e.printStackTrace();
        }
    }
}
