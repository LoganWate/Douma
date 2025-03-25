package org.Vazquez.Rojas.Diego.model.figuras3;

import org.Vazquez.Rojas.Diego.model.Triangulo;

public class Rectangulo extends Triangulo {

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }


    public double area()
    {
        return base * altura;
    }

    public double perimetro()
    {
        return (base * 2) + (altura * 2);
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
    }
}
