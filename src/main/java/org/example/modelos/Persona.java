package org.example.modelos;

import org.example.helpers.PersonaValidacion;

public class Persona {
//inyecto las dependencias de las validaciones
    private PersonaValidacion valide=new PersonaValidacion();

    private String nombres;
    private String correo;
    private String edad;

    public Persona() {
    }

    public Persona(String nombres, String correo, String edad) {
        this.nombres = nombres;
        this.correo = correo;
        this.edad = edad;
    }

    public void setNombres(String nombres) {
        try{
            this.valide.validarNombres(nombres);
            this.nombres=nombres;
        }
        catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }





}
