package alberto.figura;

import alberto.util.ReadUtil;
import alberto.vista.Menu;
import org.gerdoc.model.figura.Figura;

public abstract class Circunferencia extends Figura
{
    protected double radio;

    public Circunferencia(){}

    public Circunferencia(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return Math.PI*2*radio;
    }

    @Override
    public void leerDatos() {
        Menu.menuRadio();
        radio= ReadUtil.getInstance().leerInt();
    }
}
