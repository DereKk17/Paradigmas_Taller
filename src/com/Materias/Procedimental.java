package com.Materias;

import java.util.Scanner;

public class Procedimental {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        final String [] ASIGNATURASDISPONIBLES = {"1. Modelacion Matematica", "2. Arquitectura de computadores", "3. Fisica Electromagentica","4. Paradigmas de Programacion", "5. Estructura de Datos lineales", "6. cultura Religiosa"};
        String [] asignaturasInscirtas = {null, null, null, null, null, null};

        System.out.println("BIENVENIDO AL AREA DE INCRIPCION DE ASIGNATURAS");
        System.out.println("dijite el numero deseado para acceder al menu");

        int entrada = 1;

        while(entrada != 0){
            mostrarMenu();
            int menu = leer.nextInt();
            switch (menu){
                case 1:
                    mostrar(asignaturasInscirtas);
                    break;
                case 2:
                    mostrar(ASIGNATURASDISPONIBLES);
                    int a = preguntar();

                    if(a == 1){
                        add(asignaturasInscirtas, ASIGNATURASDISPONIBLES[0]);
                    }else if(a == 2){
                        add(asignaturasInscirtas, ASIGNATURASDISPONIBLES[1]);
                    }else if(a == 3){
                        add(asignaturasInscirtas, ASIGNATURASDISPONIBLES[2]);
                    }else if(a == 4){
                        add(asignaturasInscirtas, ASIGNATURASDISPONIBLES[3]);
                    }else if(a == 5){
                        add(asignaturasInscirtas, ASIGNATURASDISPONIBLES[4]);
                    }else if(a == 6){
                        add(asignaturasInscirtas, ASIGNATURASDISPONIBLES[5]);
                    }
                    break;
                case 3:
                    mostrar(asignaturasInscirtas);
                    int b = preguntar();

                    if(b == 1){
                        eliminar(asignaturasInscirtas, ASIGNATURASDISPONIBLES[0]);
                    }else if(b == 2){
                        eliminar(asignaturasInscirtas, ASIGNATURASDISPONIBLES[1]);
                    }else if(b == 3){
                        eliminar(asignaturasInscirtas, ASIGNATURASDISPONIBLES[2]);
                    }else if(b == 4){
                        eliminar(asignaturasInscirtas, ASIGNATURASDISPONIBLES[3]);
                    }else if(b == 5){
                        eliminar(asignaturasInscirtas, ASIGNATURASDISPONIBLES[4]);
                    }else if(b == 6){
                        eliminar(asignaturasInscirtas, ASIGNATURASDISPONIBLES[5]);
                    }
                    break;
                case 4:
                    mostrar(asignaturasInscirtas);
                    break;
                case 5:
                    System.out.println("sus materias han sido inscritas correctamente? ");
                    break;
                case 6:
                    entrada = 0;
                    break;
            }
        }

    }

    static void mostrarMenu(){
        System.out.println();
        System.out.println();
        System.out.println("1.revisar asignaturas disponibles");
        System.out.println("2. inscribir asignaturas");
        System.out.println("3. Cancelar asinaturas preinscritas");
        System.out.println("4. Mostrar asignaturas preinscritas");
        System.out.println("5. liquidar materia");
        System.out.println("0. salir");
    }

    static void mostrar(String[] arreglo){
        if(arreglo != null){
            for(int i =0; i < arreglo.length;i++){
                if(arreglo[i] == null){
                    break;
                }
                else
                    System.out.print(arreglo[i] + "    ");
            }

        }
    }

   static int preguntar(){
       System.out.println();
       System.out.println("ingrese el numero de la asignatura a inscribir");
       int materia = leer.nextInt();

       return materia;
   }

    static void add(String [] arreglo, String elemento){
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == null){
                arreglo[i] = elemento;
                break;
            }
        }
    }

    static void eliminar(String[] arreglo, String elemento){
        for(int i = 0; i < 3; i++){
            if(arreglo[i] == elemento){
                arreglo[i] = null;
            }
        }
    }
}
