package org.example;

import java.util.Scanner;
import org.example.ListaDeTareas;
import org.example.Tarea;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ListaDeTareas para gestionar las tareas
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para almacenar la opción seleccionada por el usuario
        int opcion;
        do {
            // Menú de opciones
            System.out.println("\n==== Gestor de Tareas ====");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Mostrar Tareas");
            System.out.println("3. Marcar como Completada");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            // Realiza acciones según la opción seleccionada por usuario
            switch (opcion) {
                case 1:
                    // Agrega una nueva tarea
                    System.out.print("Ingrese la descripción de la tarea: ");
                    scanner.nextLine();  // Limpiar el buffer del teclado
                    String descripcion = scanner.nextLine();
                    listaDeTareas.agregarTarea(descripcion);
                    break;
                case 2:
                    // Muestra todas las tareas en la lista
                    listaDeTareas.mostrarTareas();
                    break;
                case 3:
                    // Marca una tarea como completada
                    System.out.print("Ingrese el índice de la tarea a marcar como completada: ");
                    int indice = scanner.nextInt();
                    listaDeTareas.marcarComoCompletada(indice);
                    break;
                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del Gestor de Tareas.");
                    break;
                default:
                    // Mensaje default
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);  // Continua el bucle hasta que el usuario elija salir
    }
}
