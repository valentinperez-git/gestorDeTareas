package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.Tarea;

public class ListaDeTareas {
    private List<Tarea> tareas;

    // Constructor para inicializar la lista de tareas
    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }

    // Método para agregar una nueva tarea a la lista
    public void agregarTarea(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareas.add(tarea);
    }

    // Método para mostrar todas las tareas en la lista
    public void mostrarTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    // Método para marcar una tarea como completada según el índice proporcionado
    public void marcarComoCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).marcarComoCompletada();
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }
}
