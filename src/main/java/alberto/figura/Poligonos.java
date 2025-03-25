package alberto.figura;

import alberto.util.ReadUtil;
import alberto.vista.Menu;
import org.gerdoc.model.figura.Figura;

public abstract class Poligonos extends Figura
{
    protected double apotema;
    protected double lado;

    public Poligonos(){}

    public Poligonos(double apotema, double lado)
    {
        this.apotema=apotema;
        this.lado=lado;
    }
    @Override
    public double area(){return (perimetro()*apotema)/2;}

    @Override
    public abstract double perimetro();

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void leerDatos() {
        Menu.menuLado();
        lado= ReadUtil.getInstance().leerInt();
        Menu.menuApotema();
        apotema=ReadUtil.getInstance().leerInt();
    }
}
