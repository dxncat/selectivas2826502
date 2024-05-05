package org.cgmtl.selectivas.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Scanner notain = new Scanner(System.in);
        System.out.print("Ingrese la nota:  ");
        String nota = notain.nextLine();
        Estudiante estudiante = new Estudiante(Float.parseFloat(nota));

        if (estudiante.nota == 10){
            System.out.println("Aprobado");
        }
        else if (estudiante.nota > 10){
            System.out.println("Seguro has introducido la nota correcta??");
            System.out.println("no puedes superar el 10");
            System.out.println("Nota ingresada: " + estudiante.nota);
        }
        else if (estudiante.nota >= 7 && estudiante.nota < 10){
            System.out.println("Regular");
        }
        else if (estudiante.nota >= 4 && estudiante.nota < 7){
            System.out.println("reprobado");
        }
        notain.close();
    }
}