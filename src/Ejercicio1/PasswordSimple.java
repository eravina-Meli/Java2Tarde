package Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PasswordSimple extends Password {

    public PasswordSimple(String regex) {
        super(regex);
    }

    @Override
    public void setValue(String pwd) {
        try {
            Pattern pat = Pattern.compile(".*carre.*");
            Matcher mat = pat.matcher(pwd);

            if (mat.matches()) {
                System.out.println("La Password es correcta");
            } else {
                System.out.println("La password necesita contener entre 5 u 8 digitos, una letra Mayuscula o minuscula, " +
                        "un digito o el caracter _ .");
            }
        }catch (PatternSyntaxException e){
            e.printStackTrace();
        }
    }
}
