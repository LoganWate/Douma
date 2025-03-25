package org.Vazquez.Rojas.Diego.vista;

import org.Vazquez.Rojas.Diego.model.Cuadrado;
import org.Vazquez.Rojas.Diego.model.Equilatero;
import org.Vazquez.Rojas.Diego.model.figura.figura2.Escaleno;
import org.Vazquez.Rojas.Diego.model.figura.figura2.Isosceles;
import org.Vazquez.Rojas.Diego.model.figuras3.Circulo;
import org.Vazquez.Rojas.Diego.model.figuras3.Paralelogramo;
import org.Vazquez.Rojas.Diego.model.figuras3.Rectangulo;
import org.Vazquez.Rojas.Diego.model.figuras3.Rombo;
import org.Vazquez.Rojas.Diego.util.ReadUtil;
import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.SolicitaDatos;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Historiales historiales;

    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if( consola == null )
        {
            consola = new Consola( );
        }
        return consola;
    }

    @Override
    public void run()
    {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while( flag )
        {
            figura = null;
            Menu.principal( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    figura = new Cuadrado(  );
                    break;
                case 2:
                    figura = new Equilatero( );
                    break;
                case 3:
                    figura = new Isosceles();
                    break;
                case 4:
                    figura = new Escaleno();
                    break;
                case 5:
                    figura = new Circulo();
                    break;
                case 6:
                    figura = new Paralelogramo();
                    break;
                case 7:
                    figura = new Rectangulo();
                    break;
                case 8:
                    figura = new Rombo();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( figura != null )
            {
                ((SolicitaDatos)figura).leerDatos();
                Menu.print( figura );
                historiales.addFigura( figura );
            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = (Historiales) historiales;
    }


}
