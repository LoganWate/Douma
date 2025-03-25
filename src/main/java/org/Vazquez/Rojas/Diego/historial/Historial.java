package org.Vazquez.Rojas.Diego.historial;

import org.gerdoc.model.figura.Figura;

import java.util.ArrayList;
import java.util.List;

public class Historial implements Historiales{
    private static Historial historial;
    private List<Figura> list;

    private Historial()
    {
    }

    public static Historial getInstance( )
    {
        if( historial == null )
        {
            historial = new Historial( );
        }
        return historial;
    }

    @Override
    public void addFigura( Figura figura)
    {
        if( list == null)
        {
            list = new ArrayList<Figura>();
        }
        list.add( figura );
    }

    @Override
    public void imprimir ( )
    {
        if (list == null || list.isEmpty()){
            System.out.println("Historial vacio");
            return;
        }
        list.forEach((p) -> {
            System.out.println("Area: " + p.area() );
            System.out.println("Perimetro: " + p.perimetro());
        } );

    }

}
