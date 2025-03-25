package org.Vazquez.Rojas.Diego.model.figuras3;

import org.Vazquez.Rojas.Diego.util.ReadUtil;
import org.Vazquez.Rojas.Diego.vista.Menu;
import org.gerdoc.model.figura.Figura;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area()
    {
        return (radio*radio)*Math.PI;
    }

    public double perimetro()
    {
        return (radio * 2)*Math.PI;
    }

    @Override
    public void leerDatos() {
        Menu.menuRadio();
        radio = ReadUtil.getInstance().leerInt();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
