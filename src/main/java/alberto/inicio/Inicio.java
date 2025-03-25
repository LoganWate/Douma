package alberto.inicio;

import alberto.util.ReadUtil;
import alberto.vista.Consola;
import alberto.vista.Menu;
import alberto.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public class Inicio {

    public Inicio(){}


    public static void main(String[] args)
    {
    boolean flag=true;
    int opcion=0;
    Ejecutable ejecutable =null;
    while(flag)
    {
        ejecutable=null;
        Menu.principal2();
        opcion=ReadUtil.getInstance().leerInt();
        switch (opcion)
        {
            case 1:
                ejecutable=Consola.getInstance();
                break;
            case 2:
                ejecutable=Ventana.getInstance();
                break;
            case 3:
                flag=false;
                break;
            default:
                Menu.opcionInvalida();
        }
        if(ejecutable !=null)
        {
            ejecutable.run();
        }
    }
    }
}
