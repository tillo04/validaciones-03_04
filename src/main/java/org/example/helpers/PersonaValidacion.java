package org.example.helpers;

public class PersonaValidacion {

    private EvaluarPatron evaluadorDeCoincidencia=new EvaluarPatron();


    public boolean validarNombres(String nombre)throws Exception {
        String exprecionRegular = "^[a-zA-Z\\s]+$";

        if (!this.evaluadorDeCoincidencia.evaluarPatron(nombre, exprecionRegular)) {
            throw new Exception("error. solo letras y espacios");
        }
        if (nombre.length() > 50) {
            throw new Exception("limite de caracteres sobrepasado");
        }
        return true;
    }



    public boolean validarCorreo(String correo) throws Exception {
        String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        if (!this.evaluadorDeCoincidencia.evaluarPatron(correo,regex)){
            throw new Exception("tiene algun error en el correo");
        }
        return true;

    }

    public boolean validarEdad(String edad)throws Exception{
        String regex="^[0-9]+$";

        if (!this.evaluadorDeCoincidencia.evaluarPatron(edad,regex)){
            throw new Exception("solo se permiten numeros");
        }
        return true;
    }
}
