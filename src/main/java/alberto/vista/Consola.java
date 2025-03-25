package alberto.vista;

import alberto.figura.Equilatero;
import alberto.figura.Pentagono;
import alberto.figura2.Circulo;
import alberto.figura2.Escaleno;
import alberto.figura2.Isosceles;
import alberto.figura3.Cuadrado;
import alberto.figura3.Hexagono;
import alberto.figura3.Octagono;
import alberto.figura3.Rectangulo;
import alberto.util.ReadUtil;
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

    public static Consola getInstance()
    {
        if(consola==null)
        {
            consola=new Consola();
        }
        return consola;
    }



    @Override
    public void run()
    {
        boolean flag=true;
        int opcion=0;
        Figura figura=null;
        while(flag)
        {
            figura=null;
            Menu.principal();
            opcion=ReadUtil.getInstance().leerInt();
            switch (opcion)
            {
                case 1:
                    figura=new Cuadrado();
                    break;
                case 2:
                    figura=new Rectangulo();
                    break;
                case 3:
                    figura=new Equilatero();
                    break;
                case 4:
                    figura=new Isosceles();
                    break;
                case 5:
                    figura=new Escaleno();
                    break;
                case 6:
                    figura=new Pentagono();
                    break;
                case 7:
                    figura=new Hexagono();
                    break;
                case 8:
                    figura= new Octagono();
                    break;
                case 9:
                    figura=new Circulo();
                    break;
                case 10:
                    flag=false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if ((figura!=null))
            {
                ((SolicitaDatos)figura).leerDatos();
                Menu.print(figura);
                historiales.addFigura(figura);
            }
        }

    }
    @Override
    public void addHistoriales(Historiales historiales) {
        {
            this.historiales = historiales;
        }
    }
}
