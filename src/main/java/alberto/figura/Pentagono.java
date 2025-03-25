package alberto.figura;

public class Pentagono extends Poligonos {

    public Pentagono(){}

    public Pentagono(double apotema, double lado) {
        super(apotema, lado);
    }

    @Override
    public double perimetro() {
        return lado*5;
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
    }
}
