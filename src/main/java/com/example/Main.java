package main.java.com.example;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan Pérez", 20, 4.0);
        estudiante.mostrarInfo();


        CuentaBancaria cuenta = new CuentaBancaria("Ana Castrillón", 1000000.0);
        cuenta.depositar(50000.0);
        System.out.println("Saldo: " + cuenta.getSaldo());


        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        libro.mostrarDetalles();
    }
}