package alberto.figura3;

import alberto.util.ReadUtil;
import alberto.vista.Menu;
import org.gerdoc.model.figura.Figura;

public class Cuadrado extends Figura
{
    private double lado;

    public Cuadrado(){}

    public Cuadrado(double lado){this.lado=lado;}

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public void leerDatos() {
        Menu.menuLado();
        lado= ReadUtil.getInstance().leerInt();
    }

}
