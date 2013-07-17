
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
class Triangulo {

    private double altura;
    private double base;
    private double area;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setCalcularArea() {
        area = (base * altura) / 2;
    }

    public double getArea() {
        return area;
    }
}
