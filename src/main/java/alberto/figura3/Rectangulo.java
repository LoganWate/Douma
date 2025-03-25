package alberto.figura3;

import alberto.util.ReadUtil;
import alberto.vista.Menu;
import org.gerdoc.model.figura.Figura;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(){}

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return (base*2)+(altura*2);
    }

    @Override
    public void leerDatos() {
        Menu.menuBase();
        base= ReadUtil.getInstance().leerInt();
        Menu.menuAltura();
        altura=ReadUtil.getInstance().leerInt();
    }
}
