package com.Materias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Estructurado{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        final String [] ASIGNATURASDISPONIBLES = {"1. Modelacion Matematica", "2. Arquitectura de computadores", "3. Fisica Electromagentica","4. Paradigmas de Programacion", "5. Estructura de Datos lineales", "6. cultura Religiosa"};
        String [] asignaturasInscirtas = {null, null, null, null, null, null};
        System.out.println("BIENVENIDO AL AREA DE INCRIPCION DE ASIGNATURAS");
        System.out.println("dijite el numero deseado para acceder al menu");



        int entrada = 1;
        while(entrada != 0) {
            System.out.println();
            System.out.println();
            System.out.println("1.revisar asignaturas disponibles");
            System.out.println("2. inscribir asignaturas");
            System.out.println("3. Cancelar asinaturas preinscritas");
            System.out.println("4. Mostrar asignaturas preinscritas");
            System.out.println("5. liquidar materia");
            System.out.println("0. salir");
            int menu = leer.nextInt();
            switch (menu) {
                case 1: {
                        for(int i =0; i < ASIGNATURASDISPONIBLES.length;i++) {
                            System.out.print(ASIGNATURASDISPONIBLES[i] + "    ");

                        }

                    break;
                }
                case 2: {
                    for(int i =0; i < ASIGNATURASDISPONIBLES.length;i++) {
                        System.out.print(ASIGNATURASDISPONIBLES[i] + "    ");

                        }
                    System.out.println();
                    System.out.println("ingrese el numero de la asignatura a inscribir");
                    int materia = leer.nextInt();

                    if (materia == 1) {
                        for (int i = 0; i < 6; i++) {
                            if (asignaturasInscirtas[i] == null) {
                                asignaturasInscirtas[i] = ASIGNATURASDISPONIBLES[0];
                                break;
                            }
                        }
                        System.out.println("asignatrua preinscrita " + ASIGNATURASDISPONIBLES[0]);

                    } else if (materia == 2) {
                        for(int i = 0; i < 6; i++) {
                            if (asignaturasInscirtas[i] == null) {
                                asignaturasInscirtas[i] = ASIGNATURASDISPONIBLES[1];
                                break;
                            }
                        }
                        System.out.println("asignatrua preinscrita " + ASIGNATURASDISPONIBLES[1]);

                    } else if (materia == 3) {
                        for(int i = 0; i < 6; i++) {
                            if (asignaturasInscirtas[i] == null) {
                                asignaturasInscirtas[i] = ASIGNATURASDISPONIBLES[2];
                                break;
                            }
                        }
                        System.out.println("asignatrua preinscrita " + ASIGNATURASDISPONIBLES[2]);

                    } else if (materia == 4) {
                        for(int i = 0; i < 6; i++) {
                            if (asignaturasInscirtas[i] == null) {
                                asignaturasInscirtas[i] = ASIGNATURASDISPONIBLES[3];
                                break;
                            }
                        }
                        System.out.println("asignatrua preinscrita " + ASIGNATURASDISPONIBLES[3]);

                    } else if (materia == 5) {
                        for(int i = 0; i < 6; i++) {
                            if (asignaturasInscirtas[i] == null) {
                                asignaturasInscirtas[i] = ASIGNATURASDISPONIBLES[4];
                                break;
                            }
                         }
                        System.out.println("asignatrua preinscrita " + ASIGNATURASDISPONIBLES[4]);

                    } else if (materia == 6) {
                        for(int i = 0; i < 6; i++) {
                            if (asignaturasInscirtas[i] == null) {
                                asignaturasInscirtas[i] = ASIGNATURASDISPONIBLES[5];
                                break;
                            }
                        }
                        System.out.println("asignatrua preinscrita " + ASIGNATURASDISPONIBLES[5]);
                    }
                    break;
                }
                case 3: {
                    if (asignaturasInscirtas == null) {
                        System.out.println("no tienes asignaturas inscritas");
                    } else {
                        for(int i =0; i < asignaturasInscirtas.length;i++){
                            if(asignaturasInscirtas[i] == null){
                                break;
                            }
                            else
                                System.out.print(asignaturasInscirtas[i] + "    ");
                        }
                        System.out.println();
                        System.out.println("ingrese el numerp de la materia para cancelar: ");
                        int materia_cancelar = leer.nextInt();

                        if (materia_cancelar == 1) {
                            for(int i = 0; i < asignaturasInscirtas.length; i++){
                                if(asignaturasInscirtas[i] == ASIGNATURASDISPONIBLES[0]){
                                    asignaturasInscirtas[i] = null;
                                }
                            }
                            System.out.println("asignatura cancelada 1. Arquitectura de computadores" );
                        } else if (materia_cancelar == 2) {
                            for(int i = 0; i < asignaturasInscirtas.length; i++){
                                if(asignaturasInscirtas[i] == ASIGNATURASDISPONIBLES[1]){
                                    asignaturasInscirtas[i] = null;
                                }
                            }
                            System.out.println("asignatura cancelada 2. Arquitectura de computadores");
                        } else if (materia_cancelar == 3) {
                            for (int i = 0; i < asignaturasInscirtas.length; i++) {
                                if (asignaturasInscirtas[i] == ASIGNATURASDISPONIBLES[2]) {
                                    asignaturasInscirtas[i] = null;
                                }
                            }
                            System.out.println("asignatura cancelada 3. Fisica Electromagentica");
                        }else if (materia_cancelar == 4) {
                            for (int i = 0; i < asignaturasInscirtas.length; i++) {
                                if (asignaturasInscirtas[i] == ASIGNATURASDISPONIBLES[3]) {
                                    asignaturasInscirtas[i] = null;
                                }
                            }
                            System.out.println("asignatura cancelada 4. Paradigmas de Programacion");
                        } else if (materia_cancelar == 5) {
                            for (int i = 0; i < asignaturasInscirtas.length; i++) {
                                if (asignaturasInscirtas[i] == ASIGNATURASDISPONIBLES[4]) {
                                    asignaturasInscirtas[i] = null;
                                }
                            }
                            System.out.println("asignatura cancelada 5. Estructura de Datos lineales");
                        } else if (materia_cancelar == 6) {
                            for (int i = 0; i < asignaturasInscirtas.length; i++) {
                                if (asignaturasInscirtas[i] == ASIGNATURASDISPONIBLES[5]) {
                                    asignaturasInscirtas[i] = null;
                                }
                            }
                            System.out.println("asignatura cancelada 6. cultura Religiosa");
                        }
                    }
                    break;
                }

                case 4: {
                    if(asignaturasInscirtas != null){
                        for(int i =0; i < asignaturasInscirtas.length;i++){
                            if(asignaturasInscirtas[i] == null){
                                break;
                            }
                            else
                                System.out.print(asignaturasInscirtas[i] + "    ");
                        }

                    }
                    else{
                        System.out.println("no tiene asignturas inscritas");
                    }
                        break;
                }

                case 5: {
                    System.out.println("sus materias han sido inscritas correctamente? ");
                    break;
                }
                case 0: {
                    entrada =0
                    ;
                }
                default:
                    break;
            }
        }
    }
}

