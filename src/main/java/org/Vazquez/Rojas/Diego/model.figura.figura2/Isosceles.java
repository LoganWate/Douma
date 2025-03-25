package org.Vazquez.Rojas.Diego.model.figura.figura2;

import org.Vazquez.Rojas.Diego.model.Equilatero;
import org.Vazquez.Rojas.Diego.util.ReadUtil;
import org.Vazquez.Rojas.Diego.vista.Menu;

public class Isosceles extends Equilatero
{
    protected double lado2;

    public Isosceles(double base, double altura, double lado1, double lado2)
    {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }

    public Isosceles() {
    }

    public double getLado2()
    {
        return lado1;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro()
    {
        return 2*lado1+ lado2;
    }

    public void leerDatos() {
        super.leerDatos();
        Menu.menuLado2();
        lado2 = ReadUtil.getInstance().leerInt();

    }
}
