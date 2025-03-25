package org.Vazquez.Rojas.Diego.inicio;

import org.Vazquez.Rojas.Diego.historial.Historial;
import org.Vazquez.Rojas.Diego.historial.Historiales;
import org.Vazquez.Rojas.Diego.util.ReadUtil;
import org.Vazquez.Rojas.Diego.vista.Consola;
import org.Vazquez.Rojas.Diego.vista.Menu;
import org.Vazquez.Rojas.Diego.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public class Inicio
{

    /**
     * Default constructor
     */
    public Inicio()
    {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        Historiales historiales = null;
        historiales = Historial.getInstance();
        while( flag )
        {
            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:
                    historiales.imprimir();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                //ejecutable.addHistoriales((org.gerdoc.historial.Historiales) historiales);
                ejecutable.run( );
            }

        }



    }

}