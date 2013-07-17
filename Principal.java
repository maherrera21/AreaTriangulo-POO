/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Triangulo tri = new Triangulo();
        System.out.println("Base del Triángulo: ");
        double base = leer.nextDouble();
        System.out.println("Altura del Triángulo: ");
        double altura = leer.nextDouble();
        tri.setAltura(altura);
        tri.setBase(base);
        tri.setCalcularArea();
        System.out.println("El área del triángulo es: " + tri.getArea());
    }
}
