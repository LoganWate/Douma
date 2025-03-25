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

import javax.swing.*;


public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private Historiales historiales;

    private Ventana() {

        super("Ventana de figuras");
        init();
    }

    private void init() {
        jLabel = new JLabel("Bienvenido");
        jLabel.setBounds(10, 10, 100, 20);


        JLabel ingreselado = new JLabel("Ingrese el lado");
        ingreselado.setBounds(10, 20, 100, 20);

        jTextField = new JTextField();
        jTextField.setBounds(10, 40, 100, 20);

        jButton = new JButton("Calcular para cuadrado");
        jButton.setBounds(10, 60, 200, 20);


        jButton.addActionListener(p -> {
            Figura figura = new Cuadrado();
            ((Cuadrado) figura).setLado(ReadUtil.string2Integer(jTextField.getText()));

            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroCuadrado = new JLabel("Perimetro " + figura.perimetro());
            perimetroCuadrado.setBounds(10, 80, 100, 20);
            getContentPane().add(perimetroCuadrado);

            JLabel areaCuadrado = new JLabel("Area " + figura.area());
            areaCuadrado.setBounds(10, 90, 100, 20);
            getContentPane().add(areaCuadrado);
            getContentPane().repaint();
        });


        JLabel ingresebase = new JLabel("Ingrese la base");
        ingresebase.setBounds(10, 110, 100, 20);

        JTextField base = new JTextField();
        base.setBounds(10, 130, 100, 20);

        JLabel ingresealtura = new JLabel("Ingrese la altura");
        ingresealtura.setBounds(10, 150, 120, 20);

        JTextField altura = new JTextField();
        altura.setBounds(10, 170, 120, 20);

        JButton recboton = new JButton("Calcular para rectangulo");
        recboton.setBounds(10, 190, 200, 20);


        recboton.addActionListener(p -> {
            Figura figura = new Rectangulo();
            ((Rectangulo) figura).setBase(ReadUtil.string2Integer(base.getText()));


            ((Rectangulo) figura).setAltura(ReadUtil.string2Integer(altura.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroRectangulo = new JLabel("Perimetro " + figura.perimetro());
            perimetroRectangulo.setBounds(10, 210, 100, 20);
            getContentPane().add(perimetroRectangulo);

            JLabel areaRectangulo = new JLabel("Area " + figura.area());
            areaRectangulo.setBounds(10, 230, 100, 20);
            getContentPane().add(areaRectangulo);
            getContentPane().repaint();
        });

        JLabel ingresebase2 = new JLabel("Ingrese la base");
        ingresebase2.setBounds(10, 250, 100, 20);

        JTextField base2 = new JTextField();
        base2.setBounds(10, 270, 100, 20);

        JLabel ingresealtura2 = new JLabel("Ingrese la altura");
        ingresealtura2.setBounds(10, 290, 120, 20);

        JTextField altura2 = new JTextField();
        altura2.setBounds(10, 310, 120, 20);

        JLabel ingreselado1 = new JLabel("Ingrese el lado");
        ingreselado1.setBounds(10, 330, 200, 20);

        JTextField lado1 = new JTextField();
        lado1.setBounds(10, 350, 120, 20);

        JButton triboton = new JButton("Calcular para triangulo equilatero");
        triboton.setBounds(10, 370, 300, 20);


        triboton.addActionListener(p -> {
            Figura figura = new Equilatero();
            ((Equilatero) figura).setBase(ReadUtil.string2Integer(base2.getText()));
            ((Equilatero) figura).setLado1(ReadUtil.string2Integer(lado1.getText()));
            ((Equilatero) figura).setAltura(ReadUtil.string2Integer(altura2.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroTriangulo = new JLabel("Perimetro " + figura.perimetro());
            perimetroTriangulo.setBounds(10, 390, 100, 20);
            getContentPane().add(perimetroTriangulo);

            JLabel areaTriangulo = new JLabel("Area " + figura.area());
            areaTriangulo.setBounds(10, 410, 100, 20);
            getContentPane().add(areaTriangulo);
            getContentPane().repaint();
        });


        JLabel ingresebase3 = new JLabel("Ingrese la base");
        ingresebase3.setBounds(10, 430, 100, 20);

        JTextField base3 = new JTextField();
        base3.setBounds(10, 450, 100, 20);

        JLabel ingresealtura3 = new JLabel("Ingrese la altura");
        ingresealtura3.setBounds(10, 470, 120, 20);

        JTextField altura3 = new JTextField();
        altura3.setBounds(10, 490, 120, 20);

        JLabel ingreselado12 = new JLabel("Ingrese el lado");
        ingreselado12.setBounds(10, 510, 200, 20);

        JTextField lado12 = new JTextField();
        lado12.setBounds(10, 530, 120, 20);

        JLabel ingreselado2 = new JLabel("Ingrese el lado 2");
        ingreselado2.setBounds(10, 550, 120, 20);

        JTextField lado2 = new JTextField();
        lado2.setBounds(10, 570, 120, 20);

        JButton tri2boton = new JButton("Calcular para triangulo isosceles");
        tri2boton.setBounds(10, 590, 300, 20);


        tri2boton.addActionListener(p -> {
            Figura figura = new Isosceles();
            ((Isosceles) figura).setBase(ReadUtil.string2Integer(base3.getText()));
            ((Isosceles) figura).setLado1(ReadUtil.string2Integer(lado12.getText()));
            ((Isosceles) figura).setAltura(ReadUtil.string2Integer(altura3.getText()));
            ((Isosceles) figura).setLado2(ReadUtil.string2Integer(lado2.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroTriangulo2 = new JLabel("Perimetro " + figura.perimetro());
            perimetroTriangulo2.setBounds(10, 610, 100, 20);
            getContentPane().add(perimetroTriangulo2);

            JLabel areaTriangulo2 = new JLabel("Area " + figura.area());
            areaTriangulo2.setBounds(10, 630, 100, 20);
            getContentPane().add(areaTriangulo2);
            getContentPane().repaint();
        });

        JLabel ingresebase4 = new JLabel("Ingrese la base");
        ingresebase4.setBounds(400, 20, 100, 20);

        JTextField base4 = new JTextField();
        base4.setBounds(400, 40, 100, 20);

        JLabel ingresealtura4 = new JLabel("Ingrese la altura");
        ingresealtura4.setBounds(400, 60, 120, 20);

        JTextField altura4 = new JTextField();
        altura4.setBounds(400, 80, 120, 20);

        JLabel ingreselado13 = new JLabel("Ingrese el lado");
        ingreselado13.setBounds(400, 100, 200, 20);

        JTextField lado13 = new JTextField();
        lado13.setBounds(400, 120, 120, 20);

        JLabel ingreselado21 = new JLabel("Ingrese el lado 2");
        ingreselado21.setBounds(400, 140, 120, 20);

        JTextField lado21 = new JTextField();
        lado21.setBounds(400, 160, 120, 20);

        JLabel ingreselado3 = new JLabel("Ingrese el lado 3");
        ingreselado3.setBounds(400, 180, 120, 20);

        JTextField lado3 = new JTextField();
        lado3.setBounds(400, 200, 120, 20);

        JButton tri3boton = new JButton("Calcular para triangulo escaleno");
        tri3boton.setBounds(400, 220, 300, 20);


        tri3boton.addActionListener(p -> {
            Figura figura = new Escaleno();
            ((Escaleno) figura).setBase(ReadUtil.string2Integer(base4.getText()));
            ((Escaleno) figura).setLado1(ReadUtil.string2Integer(lado13.getText()));
            ((Escaleno) figura).setAltura(ReadUtil.string2Integer(altura4.getText()));
            ((Escaleno) figura).setLado2(ReadUtil.string2Integer(lado21.getText()));
            ((Escaleno) figura).setLado3(ReadUtil.string2Integer(lado3.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroTriangulo2 = new JLabel("Perimetro " + figura.perimetro());
            perimetroTriangulo2.setBounds(400, 240, 100, 20);
            getContentPane().add(perimetroTriangulo2);

            JLabel areaTriangulo2 = new JLabel("Area " + figura.area());
            areaTriangulo2.setBounds(400, 260, 100, 20);
            getContentPane().add(areaTriangulo2);
            getContentPane().repaint();
        });


        JLabel ingreseladop = new JLabel("Ingrese el lado");
        ingreseladop.setBounds(400, 280, 100, 20);

        JTextField ladop = new JTextField();
        ladop.setBounds(400, 300, 100, 20);

        JLabel ingreseapotema = new JLabel("Ingrese el apotema");
        ingreseapotema.setBounds(400, 320, 120, 20);

        JTextField apotema = new JTextField();
        apotema.setBounds(400, 340, 120, 20);

        JButton penboton = new JButton("Calcular para pentagono");
        penboton.setBounds(400, 360, 200, 20);


        penboton.addActionListener(p -> {
            Figura figura = new Pentagono();
            ((Pentagono) figura).setLado(ReadUtil.string2Integer(ladop.getText()));


            ((Pentagono) figura).setApotema(ReadUtil.string2Integer(apotema.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroPentagono = new JLabel("Perimetro " + figura.perimetro());
            perimetroPentagono.setBounds(400, 380, 100, 20);
            getContentPane().add(perimetroPentagono);

            JLabel areaPentagono = new JLabel("Area " + figura.area());
            areaPentagono.setBounds(400, 400, 100, 20);
            getContentPane().add(areaPentagono);
            getContentPane().repaint();
        });

        JLabel ingreseladoh = new JLabel("Ingrese el lado");
        ingreseladoh.setBounds(400, 420, 100, 20);

        JTextField ladoh = new JTextField();
        ladoh.setBounds(400, 440, 100, 20);

        JLabel ingreseapotema2 = new JLabel("Ingrese el apotema");
        ingreseapotema2.setBounds(400, 460, 120, 20);

        JTextField apotema2 = new JTextField();
        apotema2.setBounds(400, 480, 120, 20);

        JButton hexboton = new JButton("Calcular para hexagono");
        hexboton.setBounds(400, 500, 200, 20);


        hexboton.addActionListener(p -> {
            Figura figura = new Hexagono();
            ((Hexagono) figura).setLado(ReadUtil.string2Integer(ladoh.getText()));

            ((Hexagono) figura).setApotema(ReadUtil.string2Integer(apotema2.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroHexagono = new JLabel("Perimetro " + figura.perimetro());
            perimetroHexagono.setBounds(400, 520, 100, 20);
            getContentPane().add(perimetroHexagono);

            JLabel areaHexagono = new JLabel("Area " + figura.area());
            areaHexagono.setBounds(400, 540, 100, 20);
            getContentPane().add(areaHexagono);
            getContentPane().repaint();
        });


        JLabel ingreseladoo = new JLabel("Ingrese el lado");
        ingreseladoo.setBounds(400, 560, 100, 20);

        JTextField ladoo = new JTextField();
        ladoo.setBounds(400, 580, 100, 20);

        JLabel ingreseapotema3 = new JLabel("Ingrese el apotema");
        ingreseapotema3.setBounds(400, 600, 120, 20);

        JTextField apotema3 = new JTextField();
        apotema3.setBounds(400, 620, 120, 20);

        JButton octboton = new JButton("Calcular para octagono");
        octboton.setBounds(400, 640, 200, 20);


        octboton.addActionListener(p -> {
            Figura figura = new Octagono();
            ((Octagono) figura).setLado(ReadUtil.string2Integer(ladoo.getText()));


            ((Octagono) figura).setApotema(ReadUtil.string2Integer(apotema3.getText()));
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroOctagono = new JLabel("Perimetro " + figura.perimetro());
            perimetroOctagono.setBounds(400, 660, 100, 20);
            getContentPane().add(perimetroOctagono);

            JLabel areaOctagono = new JLabel("Area " + figura.area());
            areaOctagono.setBounds(400, 680, 100, 20);
            getContentPane().add(areaOctagono);
            getContentPane().repaint();
        });

        JLabel ingreseradio = new JLabel("Ingrese el radio");
        ingreseradio.setBounds(790, 20, 100, 20);

        JTextField radio = new JTextField();
        radio.setBounds(790, 40, 100, 20);

        JButton circboton = new JButton("Calcular para circulo");
        circboton.setBounds(790, 60, 200, 20);


        circboton.addActionListener(p -> {
            Figura figura = new Circulo();
            ((Circulo) figura).setRadio(ReadUtil.string2Integer(radio.getText()));

            System.out.println(figura.area());
            System.out.println(figura.perimetro());
            historiales.addFigura( figura );

            JLabel perimetroCirculo = new JLabel("Perimetro " + figura.perimetro());
            perimetroCirculo.setBounds(790, 80, 100, 20);
            getContentPane().add(perimetroCirculo);

            JLabel areaCirculo = new JLabel("Area " + figura.area());
            areaCirculo.setBounds(790, 100, 100, 20);
            getContentPane().add(areaCirculo);
            getContentPane().repaint();
        });

        JButton cerrar = new JButton("Salir");
        cerrar.setBounds(10, 650, 150, 20);
        cerrar.addActionListener(p -> {
            System.exit(0);
        });

        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(jTextField);
        getContentPane().add(jButton);
        getContentPane().add(ingreselado);
        getContentPane().add(cerrar);

        getContentPane().add(ingresebase);
        getContentPane().add(ingresealtura);
        getContentPane().add(recboton);
        getContentPane().add(base);
        getContentPane().add(altura);

        getContentPane().add(ingreselado1);
        getContentPane().add(ingresealtura2);
        getContentPane().add(ingresebase2);
        getContentPane().add(triboton);
        getContentPane().add(base2);
        getContentPane().add(altura2);
        getContentPane().add(lado1);

        getContentPane().add(ingreselado12);
        getContentPane().add(ingreselado2);
        getContentPane().add(ingresealtura3);
        getContentPane().add(ingresebase3);
        getContentPane().add(tri2boton);
        getContentPane().add(base3);
        getContentPane().add(altura3);
        getContentPane().add(lado2);
        getContentPane().add(lado12);

        getContentPane().add(ingreselado13);
        getContentPane().add(ingreselado21);
        getContentPane().add(ingresealtura4);
        getContentPane().add(ingresebase4);
        getContentPane().add(tri3boton);
        getContentPane().add(base4);
        getContentPane().add(altura4);
        getContentPane().add(lado21);
        getContentPane().add(lado13);
        getContentPane().add(lado3);
        getContentPane().add(ingreselado3);

        getContentPane().add(ingreseapotema);
        getContentPane().add(ingreseladop);
        getContentPane().add(penboton);
        getContentPane().add(apotema);
        getContentPane().add(ladop);

        getContentPane().add(ingreseapotema2);
        getContentPane().add(ingreseladoh);
        getContentPane().add(hexboton);
        getContentPane().add(apotema2);
        getContentPane().add(ladoh);

        getContentPane().add(ingreseapotema3);
        getContentPane().add(ingreseladoo);
        getContentPane().add(octboton);
        getContentPane().add(apotema3);
        getContentPane().add(ladoo);

        getContentPane().add(ingreseradio);
        getContentPane().add(radio);
        getContentPane().add(circboton);
    }


    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {

        setBounds(100, 100, 400, 300);
        setVisible(true);
    }

    @Override
    public void addHistoriales(Historiales historiales) {

            this.historiales = historiales;

    }
}

