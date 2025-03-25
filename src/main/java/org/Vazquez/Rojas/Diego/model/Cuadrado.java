package org.Vazquez.Rojas.Diego.model;

import org.Vazquez.Rojas.Diego.util.ReadUtil;
import org.Vazquez.Rojas.Diego.vista.Menu;
import org.gerdoc.model.figura.Figura;

public class Cuadrado extends Figura
{

    private double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    public double area()
    {
        return lado*lado;
    }

    public double perimetro()
    {
        return lado*4;
    }

    public void leerDatos() {
        Menu.menuCuadrado();
        lado = ReadUtil.getInstance().leerInt();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}