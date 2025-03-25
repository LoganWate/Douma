package alberto.figura3;

public class Octagono extends Hexagono{
    public Octagono(){}

    public Octagono(double apotema, double lado)
    {
        super(apotema,lado);
    }

    @Override
    public double perimetro() {
        return lado*8;
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
    }
}
