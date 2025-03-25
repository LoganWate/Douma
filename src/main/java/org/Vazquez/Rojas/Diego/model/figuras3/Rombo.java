package org.Vazquez.Rojas.Diego.model.figuras3;

import org.Vazquez.Rojas.Diego.util.ReadUtil;
import org.Vazquez.Rojas.Diego.vista.Menu;
import org.gerdoc.model.figura.Figura;

public class Rombo extends Figura {
    private double diagonalMayor;
    private double diagonalMenor;
    private double ladoR;

    public Rombo() {
    }

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.ladoR = ladoR;
    }

    public double area()
    {
        return (diagonalMayor * diagonalMenor)/2;
    }

    public double perimetro()
    {
        return ladoR * 4;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getLadoR() {
        return ladoR;
    }

    public void setLadoR(double ladoR) {
        this.ladoR = ladoR;
    }

    @Override
    public void leerDatos() {
        Menu.menuDiagonalMayor();
        diagonalMayor = ReadUtil.getInstance().leerInt();
        Menu.menuDiagonalMenor();
        diagonalMenor = ReadUtil.getInstance().leerInt();
        Menu.menuLado1();
        ladoR = ReadUtil.getInstance().leerInt();
    }
}
