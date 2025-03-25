package org.Vazquez.Rojas.Diego.model.figuras3;

import org.Vazquez.Rojas.Diego.model.Equilatero;

public class Paralelogramo extends Equilatero {

    public Paralelogramo() {
    }

    public Paralelogramo(double base, double altura, double lado1) {
        super(base, altura, lado1);
    }

    public double area()
    {
        return (base * altura)/2;
    }

    public double perimetro()
    {
        return (lado1 * 2) + (base * 2);
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
    }
}
