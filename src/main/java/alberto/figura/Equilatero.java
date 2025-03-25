package alberto.figura;

import alberto.util.ReadUtil;
import alberto.vista.Menu;

public class Equilatero extends Triangulo {


    public Equilatero(){}



    public Equilatero(double base, double altura, double lado1)
    {
        super(base, altura);
        this.lado1=lado1;
    }

    protected double lado1;

    public Equilatero(double lado1){this.lado1=lado1;}

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public double perimetro() {
        return lado1*3;
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
        Menu.menuLado1();
        lado1= ReadUtil.getInstance().leerInt();
    }
}
