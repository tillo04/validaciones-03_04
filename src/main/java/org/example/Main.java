package org.example;

import org.example.modelos.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //como suo la clase persona

         Persona objeto=new Persona();

        Scanner lea=new Scanner(System.in);

        System.out.println("dijite su nombre: ");
        objeto.setNombres(lea.nextLine());
    }
}