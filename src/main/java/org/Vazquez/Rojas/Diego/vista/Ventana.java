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

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private Historiales historiales;
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private JLabel cuadrado1;
    private JLabel cuadrado2;
    private JLabel cuadrado3;
    private JLabel cuadrado4;
    private JLabel cuadrado5;

    private JLabel equilateroTitulo;
    private JLabel equilateroBase;
    private JTextField equilateroBaseDato;
    private JLabel equilateroAltura;
    private JTextField equilateroAlturaDato;
    private JLabel equilateroLado;
    private JTextField equilateroLadoDato;
    private JLabel equilateroArea;
    private JLabel equilateroPerimetro;
    private JButton equilateroBotton;

    private JLabel isocelesTitulo;
    private JLabel isocelesBase;
    private JTextField isocelesBaseDato;
    private JLabel isocelesAltura;
    private JTextField isocelesAlturaDato;
    private JLabel isocelesLado;
    private JTextField isocelesLadoDato;
    private JLabel isocelesLado2;
    private JTextField isocelesLado2Dato;
    private JLabel isocelesArea;
    private JLabel isocelesPerimetro;
    private JButton isocelesBotton;

    private JLabel escalenoTitulo;
    private JLabel escalenoBase;
    private JTextField escalenoBaseDato;
    private JLabel escalenoAltura;
    private JTextField escalenoAlturaDato;
    private JLabel escalenoLado;
    private JTextField escalenoLadoDato;
    private JLabel escalenoLado2;
    private JTextField escalenoLado2Dato;
    private JLabel escalenoLado3;
    private JTextField escalenoLado3Dato;
    private JLabel escalenoArea;
    private JLabel escalenoPerimetro;
    private JButton escalenoBotton;

    private JLabel circuloTitulo;
    private JLabel circuloRadio;
    private JTextField circuloRadioDato;
    private JLabel circuloArea;
    private JLabel circuloPerimetro;
    private JButton circuloBotton;

    private JLabel paralelogramoTitulo;
    private JLabel paralelogramoBase;
    private JTextField paralelogramoBaseDato;
    private JLabel paralelogramoAltura;
    private JTextField paralelogramoAlturaDato;
    private JLabel paralelogramoLado;
    private JTextField paralelogramoLadoDato;
    private JLabel paralelogramoArea;
    private JLabel paralelogramoPerimetro;
    private JButton paralelogramoBotton;

    private JLabel rectanguloTitulo;
    private JLabel rectanguloBase;
    private JTextField rectanguloBaseDato;
    private JLabel rectanguloAltura;
    private JTextField rectanguloAlturaDato;
    private JLabel rectanguloArea;
    private JLabel rectanguloPerimetro;
    private JButton rectanguloBotton;

    private JLabel romboTitulo;
    private JLabel romboDiagonalMenor;
    private JTextField romboDiagonalMenorDato;
    private JLabel romboDiagonalMayor;
    private JTextField romboDiagonalMayorDato;
    private JLabel romboLado;
    private JTextField romboLadoDato;
    private JLabel romboArea;
    private JLabel romboPerimetro;
    private JButton romboBotton;

    private Ventana()
    {
        super( "Ventana de fuguras " );
        init();
    }

    public void init () {
        jLabel = new JLabel("Welcome");
        jLabel.setBounds(10, 10, 100, 20);

        cuadrado1 = new JLabel("Llene los datos de la figura que desee calcular: ");
        cuadrado1.setBounds(10, 30, 300, 20);

        cuadrado2 = new JLabel("---CUADRADO---");
        cuadrado2.setBounds(10, 60, 300, 20);

        cuadrado3 = new JLabel("Ingrese los datos del lado");
        cuadrado3.setBounds(10, 80, 300, 20);

        jTextField = new JTextField();
        jTextField.setBounds(10, 110, 100, 20);

        jButton = new JButton("Calcular");
        jButton.setBounds(10, 140, 100, 20);

        cuadrado4 = new JLabel("Area: ");
        cuadrado4.setBounds(10, 160, 100, 20);

        cuadrado5 = new JLabel("Perimetro: ");
        cuadrado5.setBounds(10, 180, 100, 20);

        jButton.addActionListener(p -> {
            Figura figura = new Cuadrado();
            ((Cuadrado) figura).setLado(ReadUtil.string2Integer(jTextField.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            cuadrado4.setText("Area: " + figura.area());
            cuadrado5.setText("Perimetro: " + figura.perimetro());
        });

        equilateroTitulo = new JLabel("---EQUILATERO---");
        equilateroTitulo.setBounds(10, 210, 200, 20);

        equilateroAltura = new JLabel("Ingresa la medida de la altura: ");
        equilateroAltura.setBounds(10, 230, 200, 20);
        equilateroAlturaDato = new JTextField();
        equilateroAlturaDato.setBounds(200, 230, 100, 20);

        equilateroBase = new JLabel("Ingresa la medida de la base: ");
        equilateroBase.setBounds(10, 250, 200, 20);
        equilateroBaseDato = new JTextField();
        equilateroBaseDato.setBounds(200, 250, 100, 20);

        equilateroLado = new JLabel("Ingresa la medida del lado: ");
        equilateroLado.setBounds(10, 270, 200, 20);
        equilateroLadoDato = new JTextField();
        equilateroLadoDato.setBounds(200, 270, 100, 20);

        equilateroArea = new JLabel("Area: ");
        equilateroArea.setBounds(10, 290, 100, 20);

        equilateroPerimetro = new JLabel("Perimetro: ");
        equilateroPerimetro.setBounds(10, 310, 100, 20);

        equilateroBotton = new JButton("Calcular");
        equilateroBotton.setBounds(10, 340, 100, 20);
        equilateroBotton.addActionListener(p -> {
            Figura figura = new Equilatero();
            ((Equilatero) figura).setAltura(ReadUtil.string2Integer(equilateroAlturaDato.getText()));
            ((Equilatero) figura).setBase(ReadUtil.string2Integer(equilateroBaseDato.getText()));
            ((Equilatero) figura).setLado(ReadUtil.string2Integer(equilateroLadoDato.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            equilateroArea.setText("Area: " + figura.area());
            equilateroPerimetro.setText("Perimetro: " + figura.perimetro());
        });


        isocelesTitulo = new JLabel("---ISOSCELES---");
        isocelesTitulo.setBounds(10, 370, 200, 20);

        isocelesAltura = new JLabel("Ingresa la medida de la altura: ");
        isocelesAltura.setBounds(10, 390, 200, 20);
        isocelesAlturaDato = new JTextField();
        isocelesAlturaDato.setBounds(200, 390, 100, 20);

        isocelesBase = new JLabel("Ingresa la medida de la base: ");
        isocelesBase.setBounds(10, 410, 200, 20);
        isocelesBaseDato = new JTextField();
        isocelesBaseDato.setBounds(200, 410, 100, 20);

        isocelesLado = new JLabel("Ingresa la medida del lado: ");
        isocelesLado.setBounds(10, 430, 200, 20);
        isocelesLadoDato = new JTextField();
        isocelesLadoDato.setBounds(200, 430, 100, 20);

        isocelesLado2 = new JLabel("Ingresa la medida del lado 2: ");
        isocelesLado2.setBounds(10, 450, 200, 20);
        isocelesLado2Dato = new JTextField();
        isocelesLado2Dato.setBounds(200, 450, 100, 20);

        isocelesArea = new JLabel("Area: ");
        isocelesArea.setBounds(10, 470, 100, 20);

        isocelesPerimetro = new JLabel("Perimetro: ");
        isocelesPerimetro.setBounds(10, 490, 100, 20);

        isocelesBotton = new JButton("Calcular");
        isocelesBotton.setBounds(10, 520, 100, 20);
        isocelesBotton.addActionListener(p -> {
            Figura figura = new Isosceles();
            ((Isosceles) figura).setAltura(ReadUtil.string2Integer(isocelesAlturaDato.getText()));
            ((Isosceles) figura).setBase(ReadUtil.string2Integer(isocelesBaseDato.getText()));
            ((Isosceles) figura).setLado(ReadUtil.string2Integer(isocelesLadoDato.getText()));
            ((Isosceles) figura).setLado2(ReadUtil.string2Integer(isocelesLado2Dato.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            isocelesArea.setText("Area: " + figura.area());
            isocelesPerimetro.setText("Perimetro: " + figura.perimetro());
        });

        escalenoTitulo = new JLabel("---ESCALENO---");
        escalenoTitulo.setBounds(10, 550, 200, 20);

        escalenoAltura = new JLabel("Ingresa la medida de la altura: ");
        escalenoAltura.setBounds(10, 570, 200, 20);
        escalenoAlturaDato = new JTextField();
        escalenoAlturaDato.setBounds(200, 570, 100, 20);

        escalenoBase = new JLabel("Ingresa la medida de la base: ");
        escalenoBase.setBounds(10, 590, 200, 20);
        escalenoBaseDato = new JTextField();
        escalenoBaseDato.setBounds(200, 590, 100, 20);

        escalenoLado = new JLabel("Ingresa la medida del lado: ");
        escalenoLado.setBounds(10, 610, 200, 20);
        escalenoLadoDato = new JTextField();
        escalenoLadoDato.setBounds(200, 610, 100, 20);

        escalenoLado2 = new JLabel("Ingresa la medida del lado 2: ");
        escalenoLado2.setBounds(10, 630, 200, 20);
        escalenoLado2Dato = new JTextField();
        escalenoLado2Dato.setBounds(200, 630, 100, 20);

        escalenoLado3 = new JLabel("Ingresa la medida del lado 2: ");
        escalenoLado3.setBounds(10, 650, 200, 20);
        escalenoLado3Dato = new JTextField();
        escalenoLado3Dato.setBounds(200, 650, 100, 20);

        escalenoArea = new JLabel("Area: ");
        escalenoArea.setBounds(10, 670, 100, 20);

        escalenoPerimetro = new JLabel("Perimetro: ");
        escalenoPerimetro.setBounds(10, 690, 100, 20);

        escalenoBotton = new JButton("Calcular");
        escalenoBotton.setBounds(10, 710, 100, 20);
        escalenoBotton.addActionListener(p -> {
            Figura figura = new Escaleno();
            ((Escaleno) figura).setAltura(ReadUtil.string2Integer(escalenoAlturaDato.getText()));
            ((Escaleno) figura).setBase(ReadUtil.string2Integer(escalenoBaseDato.getText()));
            ((Escaleno) figura).setLado(ReadUtil.string2Integer(escalenoLadoDato.getText()));
            ((Escaleno) figura).setLado2(ReadUtil.string2Integer(escalenoLado2Dato.getText()));
            ((Escaleno) figura).setLado3(ReadUtil.string2Integer(escalenoLado3Dato.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            escalenoArea.setText("Area: " + figura.area());
            escalenoPerimetro.setText("Perimetro: " + figura.perimetro());
        });

        circuloTitulo = new JLabel("---CIRCULO---");
        circuloTitulo.setBounds(400, 10, 200, 20);

        circuloRadio = new JLabel("Ingresa la medida del radio: ");
        circuloRadio.setBounds(400, 30, 200, 20);
        circuloRadioDato = new JTextField();
        circuloRadioDato.setBounds(600, 30, 100, 20);

        circuloArea = new JLabel("Area: ");
        circuloArea.setBounds(400, 50, 100, 20);

        circuloPerimetro = new JLabel("Perimetro: ");
        circuloPerimetro.setBounds(400, 70, 100, 20);

        circuloBotton = new JButton("Calcular");
        circuloBotton.setBounds(400, 100, 100, 20);
        circuloBotton.addActionListener(p -> {
            Figura figura = new Circulo();
            ((Circulo) figura).setRadio(ReadUtil.string2Integer(circuloRadioDato.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            circuloArea.setText("Area: " + figura.area());
            circuloPerimetro.setText("Perimetro: " + figura.perimetro());
        });

        paralelogramoTitulo = new JLabel("---PARALELOGRAMO---");
        paralelogramoTitulo.setBounds(400, 130, 200, 20);

        paralelogramoAltura = new JLabel("Ingresa la medida de la altura: ");
        paralelogramoAltura.setBounds(400, 150, 200, 20);
        paralelogramoAlturaDato = new JTextField();
        paralelogramoAlturaDato.setBounds(600, 150, 100, 20);

        paralelogramoBase = new JLabel("Ingresa la medida de la base: ");
        paralelogramoBase.setBounds(400, 170, 200, 20);
        paralelogramoBaseDato = new JTextField();
        paralelogramoBaseDato.setBounds(600, 170, 100, 20);

        paralelogramoLado = new JLabel("Ingresa la medida del lado: ");
        paralelogramoLado.setBounds(400, 190, 200, 20);
        paralelogramoLadoDato = new JTextField();
        paralelogramoLadoDato.setBounds(600, 190, 100, 20);

        paralelogramoArea = new JLabel("Area: ");
        paralelogramoArea.setBounds(400, 210, 100, 20);

        paralelogramoPerimetro = new JLabel("Perimetro: ");
        paralelogramoPerimetro.setBounds(400, 230, 100, 20);

        paralelogramoBotton = new JButton("Calcular");
        paralelogramoBotton.setBounds(400, 260, 100, 20);
        paralelogramoBotton.addActionListener(p -> {
            Figura figura = new Paralelogramo();
            ((Paralelogramo) figura).setAltura(ReadUtil.string2Integer(paralelogramoAlturaDato.getText()));
            ((Paralelogramo) figura).setBase(ReadUtil.string2Integer(paralelogramoBaseDato.getText()));
            ((Paralelogramo) figura).setLado(ReadUtil.string2Integer(paralelogramoLadoDato.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            paralelogramoArea.setText("Area: " + figura.area());
            paralelogramoPerimetro.setText("Perimetro: " + figura.perimetro());
        });

        rectanguloTitulo = new JLabel("---RECTANGULO---");
        rectanguloTitulo.setBounds(400, 290, 200, 20);

        rectanguloAltura = new JLabel("Ingresa la medida de la altura: ");
        rectanguloAltura.setBounds(400, 310, 200, 20);
        rectanguloAlturaDato = new JTextField();
        rectanguloAlturaDato.setBounds(600, 310, 100, 20);

        rectanguloBase = new JLabel("Ingresa la medida de la base: ");
        rectanguloBase.setBounds(400, 330, 200, 20);
        rectanguloBaseDato = new JTextField();
        rectanguloBaseDato.setBounds(600, 330, 100, 20);

        rectanguloArea = new JLabel("Area: ");
        rectanguloArea.setBounds(400, 350, 100, 20);

        rectanguloPerimetro = new JLabel("Perimetro: ");
        rectanguloPerimetro.setBounds(400, 370, 100, 20);

        rectanguloBotton = new JButton("Calcular");
        rectanguloBotton.setBounds(400, 400, 100, 20);
        rectanguloBotton.addActionListener(p -> {
            Figura figura = new Rectangulo();
            ((Rectangulo) figura).setAltura(ReadUtil.string2Integer(rectanguloAlturaDato.getText()));
            ((Rectangulo) figura).setBase(ReadUtil.string2Integer(rectanguloBaseDato.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            rectanguloArea.setText("Area: " + figura.area());
            rectanguloPerimetro.setText("Perimetro: " + figura.perimetro());
        });

        romboTitulo = new JLabel("---ROMBO---");
        romboTitulo.setBounds(400, 430, 200, 20);

        romboDiagonalMayor = new JLabel("Ingresa la medida de la DiagonalMayor: ");
        romboDiagonalMayor.setBounds(400, 450, 250, 20);
        romboDiagonalMayorDato = new JTextField();
        romboDiagonalMayorDato.setBounds(650, 450, 100, 20);

        romboDiagonalMenor = new JLabel("Ingresa la medida de la DiagonalMenor: ");
        romboDiagonalMenor.setBounds(400, 470, 250, 20);
        romboDiagonalMenorDato = new JTextField();
        romboDiagonalMenorDato.setBounds(650, 470, 100, 20);

        romboLado = new JLabel("Ingresa la medida del lado: ");
        romboLado.setBounds(400, 490, 200, 20);
        romboLadoDato = new JTextField();
        romboLadoDato.setBounds(650, 490, 100, 20);

        romboArea = new JLabel("Area: ");
        romboArea.setBounds(400, 510, 100, 20);

        romboPerimetro = new JLabel("Perimetro: ");
        romboPerimetro.setBounds(400, 530, 100, 20);

        romboBotton = new JButton("Calcular");
        romboBotton.setBounds(400, 560, 100, 20);
        romboBotton.addActionListener(p -> {
            Figura figura = new Rombo();
            ((Rombo) figura).setDiagonalMayor(ReadUtil.string2Integer(romboDiagonalMayorDato.getText()));
            ((Rombo) figura).setDiagonalMenor(ReadUtil.string2Integer(romboDiagonalMenorDato.getText()));
            ((Rombo) figura).setLadoR(ReadUtil.string2Integer(romboLadoDato.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );
            romboArea.setText("Area: " + figura.area());
            romboPerimetro.setText("Perimetro: " + figura.perimetro());
        });

//Cuadrado
        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(cuadrado1);
        getContentPane().add(cuadrado2);
        getContentPane().add(cuadrado3);
        getContentPane().add(cuadrado4);
        getContentPane().add(cuadrado5);
        getContentPane().add(jTextField);
        getContentPane().add(jButton);

//Equilatero
        getContentPane().add(equilateroArea);
        getContentPane().add(equilateroPerimetro);
        getContentPane().add(equilateroTitulo);
        getContentPane().add(equilateroAltura);
        getContentPane().add(equilateroAlturaDato);
        getContentPane().add(equilateroLado);
        getContentPane().add(equilateroLadoDato);
        getContentPane().add(equilateroBase);
        getContentPane().add(equilateroBaseDato);
        getContentPane().add(equilateroBotton);


//Isosceles
        getContentPane().add(isocelesArea);
        getContentPane().add(isocelesPerimetro);
        getContentPane().add(isocelesTitulo);
        getContentPane().add(isocelesAltura);
        getContentPane().add(isocelesAlturaDato);
        getContentPane().add(isocelesLado);
        getContentPane().add(isocelesLadoDato);
        getContentPane().add(isocelesLado2);
        getContentPane().add(isocelesLado2Dato);
        getContentPane().add(isocelesBase);
        getContentPane().add(isocelesBaseDato);
        getContentPane().add(isocelesBotton);

//Escaleno

        getContentPane().add(escalenoArea);
        getContentPane().add(escalenoPerimetro);
        getContentPane().add(escalenoTitulo);
        getContentPane().add(escalenoAltura);
        getContentPane().add(escalenoAlturaDato);
        getContentPane().add(escalenoLado);
        getContentPane().add(escalenoLadoDato);
        getContentPane().add(escalenoLado2);
        getContentPane().add(escalenoLado2Dato);
        getContentPane().add(escalenoLado3);
        getContentPane().add(escalenoLado3Dato);
        getContentPane().add(escalenoBase);
        getContentPane().add(escalenoBaseDato);
        getContentPane().add(escalenoBotton);

//Circulo
        getContentPane().add(circuloArea);
        getContentPane().add(circuloRadioDato);
        getContentPane().add(circuloBotton);
        getContentPane().add(circuloRadio);
        getContentPane().add(circuloPerimetro);
        getContentPane().add(circuloTitulo);

//Paralelogramo
        getContentPane().add(paralelogramoArea);
        getContentPane().add(paralelogramoPerimetro);
        getContentPane().add(paralelogramoTitulo);
        getContentPane().add(paralelogramoAltura);
        getContentPane().add(paralelogramoAlturaDato);
        getContentPane().add(paralelogramoLado);
        getContentPane().add(paralelogramoLadoDato);
        getContentPane().add(paralelogramoBase);
        getContentPane().add(paralelogramoBaseDato);
        getContentPane().add(paralelogramoBotton);
//Rectangulo
        getContentPane().add(rectanguloArea);
        getContentPane().add(rectanguloPerimetro);
        getContentPane().add(rectanguloTitulo);
        getContentPane().add(rectanguloAltura);
        getContentPane().add(rectanguloAlturaDato);
        getContentPane().add(rectanguloBase);
        getContentPane().add(rectanguloBaseDato);
        getContentPane().add(rectanguloBotton);
//Rombo
        getContentPane().add(romboArea);
        getContentPane().add(romboPerimetro);
        getContentPane().add(romboTitulo);
        getContentPane().add(romboDiagonalMayor);
        getContentPane().add(romboDiagonalMayorDato);
        getContentPane().add(romboLado);
        getContentPane().add(romboLadoDato);
        getContentPane().add(romboDiagonalMenor);
        getContentPane().add(romboDiagonalMenorDato);
        getContentPane().add(romboBotton);

        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }


    public static Ventana getInstance( )
    {
        if( ventana == null )
        {
            ventana = new Ventana( );
        }
        return ventana;
    }

    @Override
    public void run()
    {

        setBounds( 100 , 100, 400, 300 );
        setVisible( true );
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = (Historiales) historiales;
    }


}
