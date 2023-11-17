package org.example;
public class Tarea {
    // Atributos
    private String descripcion;  // Descripción de la tarea
    private boolean completada;  // Indica si está completada o no

    // Constructor de la clase Tarea que recibe la descripción como parámetro
    public Tarea(String descripcion) {
        // Inicialización de la descripción y establecimiento de la tarea como no completada al inicio
        this.descripcion = descripcion;
        this.completada = false;
    }

    // Método para obtener la descripción de la tarea
    public String getDescripcion() {
        return descripcion;
    }

    // Método para verificar si la tarea está completada
    public boolean estaCompletada() {
        return completada;
    }

    // Método para marcar la tarea como completada
    public void marcarComoCompletada() {
        this.completada = true;
    }

    // Método toString que devuelve una representación en cadena de la tarea
    @Override
    public String toString() {
        return "Tarea: " + descripcion + " | Completada: " + completada;
    }
}
