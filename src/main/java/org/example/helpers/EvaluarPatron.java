package org.example.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluarPatron {

    public EvaluarPatron() {
    }

    //metodo para evaluar patrones entre un string y un regex en java
    public boolean evaluarPatron(String cadenaCualquiera, String cualquierRegex){
        Pattern patron=Pattern.compile(cualquierRegex);
        Matcher coincidencia=patron.matcher(cadenaCualquiera);
        if (coincidencia.matches()){
            return true;
        } else {
            return false;
        }
    }
}
