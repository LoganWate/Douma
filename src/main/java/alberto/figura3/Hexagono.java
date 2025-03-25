package alberto.figura3;

import alberto.figura.Pentagono;

public class Hexagono extends Pentagono {
    public Hexagono(){}

    public Hexagono(double apotema, double lado)
    {
        super(apotema,lado);
    }
    @Override
    public double perimetro() {
        return lado*6;
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
    }
}
