import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCode extends JFrame {
    JFrame main = new JFrame();
    JButton btnSquare = new JButton("Square");
    JButton btnRectangle = new JButton("Rectangle");
    JButton btnCircle = new JButton("Circle");
    JButton btnTriangle = new JButton("Triangle");
    JButton btnParallelogram = new JButton("Parallelogram");
    JButton btnRhombus = new JButton("Rhombus");
    JButton btnTrapezium = new JButton("Trapezium");

    JPanel jplMain = new JPanel();
    JPanel jplSquare = new JPanel();
    JPanel jplRectangle = new JPanel();
    JPanel jplCircle = new JPanel();
    JPanel jplTriangle = new JPanel();
    JPanel jplParallelogram = new JPanel();
    JPanel jplRhombus = new JPanel();
    JPanel jplTrapezium = new JPanel();

    //Circle
    JLabel jlbEnterRadius = new JLabel("Enter Radius: ");
    JTextField jtfRadius = new JTextField();
    JLabel jlbCirclePerimeter = new JLabel("Circle Perimeter: ");
    JLabel jlbCircleArea = new JLabel("Circle Area: ");
    JLabel jlbCirclePerimeterAnswer = new JLabel();
    JLabel jlbCircleAreaAnswer = new JLabel();
    JButton btnCircleClear = new JButton("Clear");
    JButton btnMainMenu = new JButton("Main Menu");
    JButton btnCircleAnswer = new JButton("Answer");
    double r =0;
    double circlePerimeterAns = 0;
    double circleAreaAns = 0;
    String str = "";
    String strCirclePerimeterAns = "";
    String strCircleAreaAns = "";

    //Square
    JLabel jlbEnterSide = new JLabel("Enter Side: ");
    JTextField jtfSide = new JTextField();
    JLabel jlbSquarePerimeter = new JLabel("Square Perimeter: ");
    JLabel jlbSquareArea = new JLabel("Square Area: ");
    JLabel jlbSquarePerimeterAnswer = new JLabel();
    JLabel jlbSquareAreaAnswer = new JLabel();
    JButton btnSquareClear = new JButton("Clear");
    JButton btnMainMenu2 = new JButton("Main Menu");
    JButton btnSquareAnswer = new JButton("Answer");
    double a = 0;
    double squarePerimeterAns = 0;
    double squareAreaAns = 0;
    String sta = "";
    String strSquarePerimeterAns = "";
    String strSquareAreaAns = "";

    //Rectangle
    JLabel jlbEnterLength = new JLabel("Enter Length: ");
    JLabel jlbEnterWidth = new JLabel("Enter Width: ");
    JTextField jtfLength = new JTextField();
    JTextField jtfWidth = new JTextField();
    JLabel jlbRectanglePerimeter = new JLabel("Rectangle Perimeter: ");
    JLabel jlbRectangleArea = new JLabel("Rectangle Area: ");
    JLabel jlbRectanglePerimeterAnswer = new JLabel();
    JLabel jlbRectangleAreaAnswer = new JLabel();
    JButton btnRectangleClear = new JButton("Clear");
    JButton btnMainMenu3 = new JButton("Main Menu");
    JButton btnRectangleAnswer = new JButton("Answer");
    double l = 0;
    double w = 0;
    double rectanglePerimeterAns = 0;
    double rectangleAreaAns = 0;
    String stl = "";
    String stw = "";
    String strRectanglePerimeterAns = "";
    String strRectangleAreaAns = "";

    //Triangle
    JLabel jlbEnterASide = new JLabel("Enter A Side: ");
    JLabel jlbEnterBase = new JLabel("Enter Base: ");
    JLabel jlbEnterCSide = new JLabel("Enter C Side: ");
    JLabel jlbEnterHeight = new JLabel("Enter Height: ");
    JTextField jtfASide = new JTextField();
    JTextField jtfBase = new JTextField();
    JTextField jtfCSide = new JTextField();
    JTextField jtfHeight = new JTextField();
    JLabel jlbTrianglePerimeter = new JLabel("Triangle Perimeter: ");
    JLabel jlbTriangleArea = new JLabel("Triangle Area: ");
    JLabel jlbTrianglePerimeterAnswer = new JLabel();
    JLabel jlbTriangleAreaAnswer = new JLabel();
    JButton btnTriangleClear = new JButton("Clear");
    JButton btnMainMenu4 = new JButton("Main Menu");
    JButton btnTriangleAnswer = new JButton("Answer");
    double aS = 0;
    double b = 0;
    double cS = 0;
    double h = 0;
    double trianglePerimeterAns = 0;
    double triangleAreaAns = 0;
    String staS = "";
    String stb = "";
    String stcS = "";
    String sth = "";
    String strTrianglePerimeterAns = "";
    String strTriangleAreaAns = "";

    //Parallelogram
    JLabel jlbParaEnterASide = new JLabel("Enter A Side: ");
    JLabel jlbParaEnterBase = new JLabel("Enter Base: ");
    JLabel jlbParaEnterHeight = new JLabel("Enter Height: ");
    JTextField jtfParaASide = new JTextField();
    JTextField jtfParaBase = new JTextField();
    JTextField jtfParaHeight = new JTextField();
    JLabel jlbParaPerimeter = new JLabel("Parallelogram Perimeter: ");
    JLabel jlbParaArea = new JLabel("Parallelogram Area: ");
    JLabel jlbParaPerimeterAnswer = new JLabel();
    JLabel jlbParaAreaAnswer = new JLabel();
    JButton btnParaClear = new JButton("Clear");
    JButton btnMainMenu5 = new JButton("Main Menu");
    JButton btnParaAnswer = new JButton("Answer");
    double aPS = 0;
    double bP = 0;
    double hP = 0;
    double paraPerimeterAns = 0;
    double paraAreaAns = 0;
    String sPtaS = "";
    String sPtb = "";
    String sPth = "";
    String strParaPerimeterAns = "";
    String strParaAreaAns = "";

    //Rhombus
    JLabel jlbRhombusEnterASide = new JLabel("Enter A Side: ");
    JLabel jlbRhombusEnterP = new JLabel("Enter p Diagonal: ");
    JLabel jlbRhombusEnterQ = new JLabel("Enter q Diagonal: ");
    JTextField jtfRhombusASide = new JTextField();
    JTextField jtfRhombusP = new JTextField();
    JTextField jtfRhombusQ = new JTextField();
    JLabel jlbRhombusPerimeter = new JLabel("Rhombus Perimeter: ");
    JLabel jlbRhombusArea = new JLabel("Rhombus Area: ");
    JLabel jlbRhombusPerimeterAnswer = new JLabel();
    JLabel jlbRhombusAreaAnswer = new JLabel();
    JButton btnRhombusClear = new JButton("Clear");
    JButton btnMainMenu6 = new JButton("Main Menu");
    JButton btnRhombusAnswer = new JButton("Answer");
    double aRS = 0;
    double pR = 0;
    double qR = 0;
    double rhombusPerimeterAns = 0;
    double rhombusAreaAns = 0;
    String sRtaS = "";
    String sRtp = "";
    String sRtq = "";
    String strRhombusPerimeterAns = "";
    String strRhombusAreaAns = "";

    //Trapezium
    JLabel jlbTrapeziumEnterASide = new JLabel("Enter A Side: ");
    JLabel jlbTrapeziumEnterBSide = new JLabel("Enter B Side: ");
    JLabel jlbTrapeziumEnterCSide = new JLabel("Enter C Side: ");
    JLabel jlbTrapeziumEnterDSide = new JLabel("Enter D Side: ");
    JLabel jlbTrapeziumEnterHeight = new JLabel("Enter Height: ");
    JTextField jtfTrapeziumASide = new JTextField();
    JTextField jtfTrapeziumBSide = new JTextField();
    JTextField jtfTrapeziumCSide = new JTextField();
    JTextField jtfTrapeziumDSide = new JTextField();
    JTextField jtfTrapeziumHeight = new JTextField();
    JLabel jlbTrapeziumPerimeter = new JLabel("Trapezium Perimeter: ");
    JLabel jlbTrapeziumArea = new JLabel("Trapezium Area: ");
    JLabel jlbTrapeziumPerimeterAnswer = new JLabel();
    JLabel jlbTrapeziumAreaAnswer = new JLabel();
    JButton btnTrapeziumClear = new JButton("Clear");
    JButton btnMainMenu7 = new JButton("Main Menu");
    JButton btnTrapeziumAnswer = new JButton("Answer");
    double aSTrapezium = 0;
    double bSTrapezium = 0;
    double cSTrapezium = 0;
    double dSTrapezium = 0;
    double hsTrapezium = 0;
    double trapeziumPerimeterAns = 0;
    double trapeziumAreaAns = 0;
    String sTrapeziumAS = "";
    String sTrapeziumBS = "";
    String sTrapeziumCS = "";
    String sTrapeziumDS = "";
    String sTrapeziumHS = "";
    String strTrapeziumPerimeterAns = "";
    String strTrapeziumAreaAns = "";

    public MainCode(){
        main.setTitle("Perimeter & Area Finder");
        main.setSize(400,600);
        main.setVisible(true);
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.getContentPane().setBackground(new Color(27, 28, 27, 255));
        main.setLayout(null);

        //MainMenu Panel
        jplMain.setSize(400,600);
        jplMain.setVisible(true);
        jplMain.setLayout(null);
        jplMain.setBackground(new Color(27, 28, 27, 255));

        //Panels
        jplSquare.setSize(400,600);
        jplSquare.setVisible(false);
        jplSquare.setBackground(new Color(193, 175, 215, 255));
        jplSquare.setLayout(null);

        jplRectangle.setSize(400,600);
        jplRectangle.setVisible(false);
        jplRectangle.setBackground(new Color(193, 175, 215, 255));
        jplRectangle.setLayout(null);

        jplCircle.setSize(400,600);
        jplCircle.setVisible(false);
        jplCircle.setLayout(null);
        jplCircle.setBackground(new Color(193, 175, 215, 255));

        jplTriangle.setSize(400,600);
        jplTriangle.setVisible(false);
        jplTriangle.setBackground(new Color(193, 175, 215, 255));
        jplTriangle.setLayout(null);

        jplParallelogram.setSize(400,600);
        jplParallelogram.setVisible(false);
        jplParallelogram.setBackground(new Color(193, 175, 215, 255));
        jplParallelogram.setLayout(null);

        jplRhombus.setSize(400,600);
        jplRhombus.setVisible(false);
        jplRhombus.setBackground(new Color(193, 175, 215, 255));
        jplRhombus.setLayout(null);

        jplTrapezium.setSize(400,600);
        jplTrapezium.setVisible(false);
        jplTrapezium.setBackground(new Color(193, 175, 215, 255));
        jplTrapezium.setLayout(null);

        main.add(jplMain);
        main.add(jplSquare);
        main.add(jplRectangle);
        main.add(jplCircle);
        main.add(jplTriangle);
        main.add(jplParallelogram);
        main.add(jplRhombus);
        main.add(jplTrapezium);

        //Main Menu Buttons
        jplMain.add(btnSquare);
        jplMain.add(btnRectangle);
        jplMain.add(btnCircle);
        jplMain.add(btnTriangle);
        jplMain.add(btnParallelogram);
        jplMain.add(btnRhombus);
        jplMain.add(btnTrapezium);

        //Square
        jplSquare.add(jlbEnterSide);
        jplSquare.add(jtfSide);
        jplSquare.add(jlbSquarePerimeter);
        jplSquare.add(jlbSquareArea);
        jplSquare.add(jlbSquarePerimeterAnswer);
        jplSquare.add(jlbSquareAreaAnswer);
        jplSquare.add(btnSquareClear);
        jplSquare.add(btnSquareAnswer);
        jplSquare.add(btnMainMenu2);

        //Rectangle
        jplRectangle.add(jlbEnterLength);
        jplRectangle.add(jlbEnterWidth);
        jplRectangle.add(jtfLength);
        jplRectangle.add(jtfWidth);
        jplRectangle.add(jlbRectanglePerimeter);
        jplRectangle.add(jlbRectangleArea);
        jplRectangle.add(jlbRectanglePerimeterAnswer);
        jplRectangle.add(jlbRectangleAreaAnswer);
        jplRectangle.add(btnRectangleClear);
        jplRectangle.add(btnRectangleAnswer);
        jplRectangle.add(btnMainMenu3);

        //Circle
        jplCircle.add(jlbEnterRadius);
        jplCircle.add(jtfRadius);
        jplCircle.add(jlbCirclePerimeter);
        jplCircle.add(jlbCircleArea);
        jplCircle.add(jlbCirclePerimeterAnswer);
        jplCircle.add(jlbCircleAreaAnswer);
        jplCircle.add(btnCircleClear);
        jplCircle.add(btnCircleAnswer);
        jplCircle.add(btnMainMenu);

        //Triangle
        jplTriangle.add(jlbEnterASide);
        jplTriangle.add(jlbEnterBase);
        jplTriangle.add(jlbEnterCSide);
        jplTriangle.add(jlbEnterHeight);
        jplTriangle.add(jtfASide);
        jplTriangle.add(jtfBase);
        jplTriangle.add(jtfCSide);
        jplTriangle.add(jtfHeight);
        jplTriangle.add(jlbTrianglePerimeter);
        jplTriangle.add(jlbTriangleArea);
        jplTriangle.add(jlbTrianglePerimeterAnswer);
        jplTriangle.add(jlbTriangleAreaAnswer);
        jplTriangle.add(btnTriangleClear);
        jplTriangle.add(btnTriangleAnswer);
        jplTriangle.add(btnMainMenu4);

        //Parallelogram
        jplParallelogram.add(jlbParaEnterASide);
        jplParallelogram.add(jlbParaEnterBase);
        jplParallelogram.add(jlbParaEnterHeight);
        jplParallelogram.add(jtfParaASide);
        jplParallelogram.add(jtfParaBase);
        jplParallelogram.add(jtfParaHeight);
        jplParallelogram.add(jlbParaPerimeter);
        jplParallelogram.add(jlbParaArea);
        jplParallelogram.add(jlbParaPerimeterAnswer);
        jplParallelogram.add(jlbParaAreaAnswer);
        jplParallelogram.add(btnParaClear);
        jplParallelogram.add(btnParaAnswer);
        jplParallelogram.add(btnMainMenu5);

        //Rhombus
        jplRhombus.add(jlbRhombusEnterASide);
        jplRhombus.add(jlbRhombusEnterP);
        jplRhombus.add(jlbRhombusEnterQ);
        jplRhombus.add(jtfRhombusASide);
        jplRhombus.add(jtfRhombusP);
        jplRhombus.add(jtfRhombusQ);
        jplRhombus.add(jlbRhombusPerimeter);
        jplRhombus.add(jlbRhombusArea);
        jplRhombus.add(jlbRhombusPerimeterAnswer);
        jplRhombus.add(jlbRhombusAreaAnswer);
        jplRhombus.add(btnRhombusClear);
        jplRhombus.add(btnRhombusAnswer);
        jplRhombus.add(btnMainMenu6);

        //Trapezium
        jplTrapezium.add(jlbTrapeziumEnterASide);
        jplTrapezium.add(jlbTrapeziumEnterBSide);
        jplTrapezium.add(jlbTrapeziumEnterCSide);
        jplTrapezium.add(jlbTrapeziumEnterDSide);
        jplTrapezium.add(jlbTrapeziumEnterHeight);
        jplTrapezium.add(jtfTrapeziumASide);
        jplTrapezium.add(jtfTrapeziumBSide);
        jplTrapezium.add(jtfTrapeziumCSide);
        jplTrapezium.add(jtfTrapeziumDSide);
        jplTrapezium.add(jtfTrapeziumHeight);
        jplTrapezium.add(jlbTrapeziumPerimeter);
        jplTrapezium.add(jlbTrapeziumArea);
        jplTrapezium.add(jlbTrapeziumPerimeterAnswer);
        jplTrapezium.add(jlbTrapeziumAreaAnswer);
        jplTrapezium.add(btnTrapeziumClear);
        jplTrapezium.add(btnTrapeziumAnswer);
        jplTrapezium.add(btnMainMenu7);

        //Square Panel
        btnSquare.setSize(200,50);
        btnSquare.setLocation(100,70);
        btnSquare.setBackground(Color.GREEN);
        btnSquare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplSquare.setVisible(true);
            }
        });
        jlbEnterSide.setSize(170,30);
        jlbEnterSide.setLocation(30,50);

        jtfSide.setSize(180,30);
        jtfSide.setLocation(170,50);

        jlbSquarePerimeter.setSize(170,30);
        jlbSquarePerimeter.setLocation(30,170);

        jlbSquareArea.setSize(170,30);
        jlbSquareArea.setLocation(30,270);

        jlbSquarePerimeterAnswer.setSize(180,30);
        jlbSquarePerimeterAnswer.setLocation(170,170);
        jlbSquarePerimeterAnswer.setBorder(BorderFactory.createEtchedBorder());

        jlbSquareAreaAnswer.setSize(180,30);
        jlbSquareAreaAnswer.setLocation(170,270);
        jlbSquareAreaAnswer.setBorder(BorderFactory.createEtchedBorder());

        btnSquareClear.setSize(100,30);
        btnSquareClear.setLocation(250,500);
        btnSquareClear.setBackground(Color.RED);
        btnSquareClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jtfSide.setText(null);
                jlbSquarePerimeterAnswer.setText(null);
                jlbSquareAreaAnswer.setText(null);
            }
        });
        btnMainMenu2.setSize(100,30);
        btnMainMenu2.setLocation(30,500);
        btnMainMenu2.setBackground(Color.WHITE);
        btnMainMenu2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                jplSquare.setVisible(false);
                jplMain.setVisible(true);
            }
        });
        btnSquareAnswer.setSize(100,30);
        btnSquareAnswer.setLocation(250,100);
        btnSquareAnswer.setBackground(Color.green);
        btnSquareAnswer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                sta = jtfSide.getText();
                a = Double.parseDouble(sta);

                squarePerimeterAns = 4 * a;
                squareAreaAns = a * a;

                strSquarePerimeterAns = Double.toString(squarePerimeterAns);
                strSquareAreaAns = Double.toString(squareAreaAns);

                jlbSquarePerimeterAnswer.setText(strSquarePerimeterAns);
                jlbSquareAreaAnswer.setText(strSquareAreaAns);
            }
        });

        //Rectangle Panel
        btnRectangle.setSize(200,50);
        btnRectangle.setLocation(100,130);
        btnRectangle.setBackground(Color.GREEN);
        btnRectangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplRectangle.setVisible(true);
            }
        });
        jlbEnterLength.setSize(170,30);
        jlbEnterLength.setLocation(30,50);

        jlbEnterWidth.setSize(170,30);
        jlbEnterWidth.setLocation(30,90);

        jtfLength.setSize(180,30);
        jtfLength.setLocation(170,50);

        jtfWidth.setSize(180,30);
        jtfWidth.setLocation(170,90);

        jlbRectanglePerimeter.setSize(170,30);
        jlbRectanglePerimeter.setLocation(30,200);

        jlbRectangleArea.setSize(170,30);
        jlbRectangleArea.setLocation(30,300);

        jlbRectanglePerimeterAnswer.setSize(180,30);
        jlbRectanglePerimeterAnswer.setLocation(170,200);
        jlbRectanglePerimeterAnswer.setBorder(BorderFactory.createEtchedBorder());

        jlbRectangleAreaAnswer.setSize(180,30);
        jlbRectangleAreaAnswer.setLocation(170,300);
        jlbRectangleAreaAnswer.setBorder(BorderFactory.createEtchedBorder());

        btnRectangleClear.setSize(100,30);
        btnRectangleClear.setLocation(250,500);
        btnRectangleClear.setBackground(Color.RED);
        btnRectangleClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jtfLength.setText(null);
                jtfWidth.setText(null);
                jlbRectanglePerimeterAnswer.setText(null);
                jlbRectangleAreaAnswer.setText(null);
            }
        });
        btnMainMenu3.setSize(100,30);
        btnMainMenu3.setLocation(30,500);
        btnMainMenu3.setBackground(Color.WHITE);
        btnMainMenu3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                jplRectangle.setVisible(false);
                jplMain.setVisible(true);
            }
        });
        btnRectangleAnswer.setSize(100,30);
        btnRectangleAnswer.setLocation(250,140);
        btnRectangleAnswer.setBackground(Color.green);
        btnRectangleAnswer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                stl = jtfLength.getText();
                l = Double.parseDouble(stl);

                stw = jtfWidth.getText();
                w = Double.parseDouble(stw);

                rectanglePerimeterAns = (l + w) * 2;
                rectangleAreaAns = l * w;

                strRectanglePerimeterAns = Double.toString(rectanglePerimeterAns);
                strRectangleAreaAns = Double.toString(rectangleAreaAns);

                jlbRectanglePerimeterAnswer.setText(strRectanglePerimeterAns);
                jlbRectangleAreaAnswer.setText(strRectangleAreaAns);
            }
        });

        //Circle panel
        btnCircle.setSize(200,50);
        btnCircle.setLocation(100,190);
        btnCircle.setBackground(Color.GREEN);
        btnCircle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplCircle.setVisible(true);
            }
        });
        jlbEnterRadius.setSize(170,30);
        jlbEnterRadius.setLocation(30,50);

        jtfRadius.setSize(180,30);
        jtfRadius.setLocation(170,50);

        jlbCirclePerimeter.setSize(170,30);
        jlbCirclePerimeter.setLocation(30,170);

        jlbCircleArea.setSize(170,30);
        jlbCircleArea.setLocation(30,270);

        jlbCirclePerimeterAnswer.setSize(180,30);
        jlbCirclePerimeterAnswer.setLocation(170,170);
        jlbCirclePerimeterAnswer.setBorder(BorderFactory.createEtchedBorder());

        jlbCircleAreaAnswer.setSize(180,30);
        jlbCircleAreaAnswer.setLocation(170,270);
        jlbCircleAreaAnswer.setBorder(BorderFactory.createEtchedBorder());

        btnCircleClear.setSize(100,30);
        btnCircleClear.setLocation(250,500);
        btnCircleClear.setBackground(Color.RED);
        btnCircleClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jtfRadius.setText(null);
                jlbCirclePerimeterAnswer.setText(null);
                jlbCircleAreaAnswer.setText(null);
            }
        });
        btnMainMenu.setSize(100,30);
        btnMainMenu.setLocation(30,500);
        btnMainMenu.setBackground(Color.WHITE);
        btnMainMenu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                jplCircle.setVisible(false);
                jplMain.setVisible(true);
            }
        });
        btnCircleAnswer.setSize(100,30);
        btnCircleAnswer.setLocation(250,100);
        btnCircleAnswer.setBackground(Color.green);
        btnCircleAnswer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                str = jtfRadius.getText();
                r = Double.parseDouble(str);

                circlePerimeterAns = 2 * 3.14 * r;
                circleAreaAns = 3.14 * r * r;

                strCirclePerimeterAns = Double.toString(circlePerimeterAns);
                strCircleAreaAns = Double.toString(circleAreaAns);

                jlbCirclePerimeterAnswer.setText(strCirclePerimeterAns);
                jlbCircleAreaAnswer.setText(strCircleAreaAns);
            }
        });

        //Triangle Panel
        btnTriangle.setSize(200,50);
        btnTriangle.setLocation(100,250);
        btnTriangle.setBackground(Color.GREEN);
        btnTriangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplTriangle.setVisible(true);
            }
        });
        jlbEnterASide.setSize(170,30);
        jlbEnterASide.setLocation(30,50);

        jlbEnterBase.setSize(170,30);
        jlbEnterBase.setLocation(30,90);

        jlbEnterCSide.setSize(170,30);
        jlbEnterCSide.setLocation(30,130);

        jlbEnterHeight.setSize(170,30);
        jlbEnterHeight.setLocation(30,170);

        jtfASide.setSize(180,30);
        jtfASide.setLocation(170,50);

        jtfBase.setSize(180,30);
        jtfBase.setLocation(170,90);

        jtfCSide.setSize(180,30);
        jtfCSide.setLocation(170,130);

        jtfHeight.setSize(180,30);
        jtfHeight.setLocation(170,170);

        jlbTrianglePerimeter.setSize(170,30);
        jlbTrianglePerimeter.setLocation(30,270);

        jlbTriangleArea.setSize(170,30);
        jlbTriangleArea.setLocation(30,370);

        jlbTrianglePerimeterAnswer.setSize(180,30);
        jlbTrianglePerimeterAnswer.setLocation(170,270);
        jlbTrianglePerimeterAnswer.setBorder(BorderFactory.createEtchedBorder());

        jlbTriangleAreaAnswer.setSize(180,30);
        jlbTriangleAreaAnswer.setLocation(170,370);
        jlbTriangleAreaAnswer.setBorder(BorderFactory.createEtchedBorder());

        btnTriangleClear.setSize(100,30);
        btnTriangleClear.setLocation(250,500);
        btnTriangleClear.setBackground(Color.RED);
        btnTriangleClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jtfASide.setText(null);
                jtfBase.setText(null);
                jtfCSide.setText(null);
                jtfHeight.setText(null);
                jlbTrianglePerimeterAnswer.setText(null);
                jlbTriangleAreaAnswer.setText(null);
            }
        });
        btnMainMenu4.setSize(100,30);
        btnMainMenu4.setLocation(30,500);
        btnMainMenu4.setBackground(Color.WHITE);
        btnMainMenu4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                jplTriangle.setVisible(false);
                jplMain.setVisible(true);
            }
        });
        btnTriangleAnswer.setSize(100,30);
        btnTriangleAnswer.setLocation(250,210);
        btnTriangleAnswer.setBackground(Color.green);
        btnTriangleAnswer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                staS = jtfASide.getText();
                aS = staS.isEmpty() ? 0 : Double.parseDouble(staS);

                stb = jtfBase.getText();
                b = stb.isEmpty() ? 0 : Double.parseDouble(stb);

                stcS = jtfCSide.getText();
                cS = stcS.isEmpty() ? 0 : Double.parseDouble(stcS);

                sth = jtfHeight.getText();
                h = sth.isEmpty() ? 0 : Double.parseDouble(sth);

                if (!staS.isEmpty() && !stb.isEmpty() && !stcS.isEmpty()) {
                    trianglePerimeterAns = aS + b + cS;
                    strTrianglePerimeterAns = Double.toString(trianglePerimeterAns);
                    jlbTrianglePerimeterAnswer.setText(strTrianglePerimeterAns);
                }
                if (!sth.isEmpty() && !stb.isEmpty()) {
                    triangleAreaAns = 0.5 * b * h;
                    strTriangleAreaAns = Double.toString(triangleAreaAns);
                    jlbTriangleAreaAnswer.setText(strTriangleAreaAns);
                }
            }
        });

        //Parallelogram Panel
        btnParallelogram.setSize(200,50);
        btnParallelogram.setLocation(100,310);
        btnParallelogram.setBackground(Color.GREEN);
        btnParallelogram.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplParallelogram.setVisible(true);
            }
        });
        jlbParaEnterASide.setSize(170,30);
        jlbParaEnterASide.setLocation(30,50);

        jlbParaEnterBase.setSize(170,30);
        jlbParaEnterBase.setLocation(30,90);

        jlbParaEnterHeight.setSize(170,30);
        jlbParaEnterHeight.setLocation(30,130);

        jtfParaASide.setSize(180,30);
        jtfParaASide.setLocation(170,50);

        jtfParaBase.setSize(180,30);
        jtfParaBase.setLocation(170,90);

        jtfParaHeight.setSize(180,30);
        jtfParaHeight.setLocation(170,130);

        jlbParaPerimeter.setSize(170,30);
        jlbParaPerimeter.setLocation(30,270);

        jlbParaArea.setSize(170,30);
        jlbParaArea.setLocation(30,370);

        jlbParaPerimeterAnswer.setSize(170,30);
        jlbParaPerimeterAnswer.setLocation(180,270);
        jlbParaPerimeterAnswer.setBorder(BorderFactory.createEtchedBorder());

        jlbParaAreaAnswer.setSize(170,30);
        jlbParaAreaAnswer.setLocation(180,370);
        jlbParaAreaAnswer.setBorder(BorderFactory.createEtchedBorder());

        btnParaClear.setSize(100,30);
        btnParaClear.setLocation(250,500);
        btnParaClear.setBackground(Color.RED);
        btnParaClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jtfParaASide.setText(null);
                jtfParaBase.setText(null);
                jtfParaHeight.setText(null);
                jlbParaPerimeterAnswer.setText(null);
                jlbParaAreaAnswer.setText(null);
            }
        });
        btnMainMenu5.setSize(100,30);
        btnMainMenu5.setLocation(30,500);
        btnMainMenu5.setBackground(Color.WHITE);
        btnMainMenu5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                jplParallelogram.setVisible(false);
                jplMain.setVisible(true);
            }
        });
        btnParaAnswer.setSize(100,30);
        btnParaAnswer.setLocation(250,170);
        btnParaAnswer.setBackground(Color.green);
        btnParaAnswer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                sPtaS = jtfParaASide.getText();
                aPS = sPtaS.isEmpty() ? 0 : Double.parseDouble(sPtaS);

                sPtb = jtfParaBase.getText();
                bP = sPtb.isEmpty() ? 0 : Double.parseDouble(sPtb);

                sPth = jtfParaHeight.getText();
                hP = sPth.isEmpty() ? 0 : Double.parseDouble(sPth);

                if (!sPtaS.isEmpty() && !sPtb.isEmpty()) {
                    paraPerimeterAns = 2 * (aPS + bP);
                    strParaPerimeterAns = Double.toString(paraPerimeterAns);
                    jlbParaPerimeterAnswer.setText(strParaPerimeterAns);
                }
                if (!sPth.isEmpty() && !sPtb.isEmpty()) {
                    paraAreaAns = bP * hP;
                    strParaAreaAns = Double.toString(paraAreaAns);
                    jlbParaAreaAnswer.setText(strParaAreaAns);
                }
            }
        });

        //Rhombus Panel
        btnRhombus.setSize(200,50);
        btnRhombus.setLocation(100,370);
        btnRhombus.setBackground(Color.GREEN);
        btnRhombus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplRhombus.setVisible(true);
            }
        });
        jlbRhombusEnterASide.setSize(170,30);
        jlbRhombusEnterASide.setLocation(30,50);

        jlbRhombusEnterP.setSize(170,30);
        jlbRhombusEnterP.setLocation(30,90);

        jlbRhombusEnterQ.setSize(170,30);
        jlbRhombusEnterQ.setLocation(30,130);

        jtfRhombusASide.setSize(180,30);
        jtfRhombusASide.setLocation(170,50);

        jtfRhombusP.setSize(180,30);
        jtfRhombusP.setLocation(170,90);

        jtfRhombusQ.setSize(180,30);
        jtfRhombusQ.setLocation(170,130);

        jlbRhombusPerimeter.setSize(170,30);
        jlbRhombusPerimeter.setLocation(30,270);

        jlbRhombusArea.setSize(170,30);
        jlbRhombusArea.setLocation(30,370);

        jlbRhombusPerimeterAnswer.setSize(180,30);
        jlbRhombusPerimeterAnswer.setLocation(170,270);
        jlbRhombusPerimeterAnswer.setBorder(BorderFactory.createEtchedBorder());

        jlbRhombusAreaAnswer.setSize(180,30);
        jlbRhombusAreaAnswer.setLocation(170,370);
        jlbRhombusAreaAnswer.setBorder(BorderFactory.createEtchedBorder());

        btnRhombusClear.setSize(100,30);
        btnRhombusClear.setLocation(250,500);
        btnRhombusClear.setBackground(Color.RED);
        btnRhombusClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jtfRhombusASide.setText(null);
                jtfRhombusP.setText(null);
                jtfRhombusQ.setText(null);
                jlbRhombusPerimeterAnswer.setText(null);
                jlbRhombusAreaAnswer.setText(null);
            }
        });
        btnMainMenu6.setSize(100,30);
        btnMainMenu6.setLocation(30,500);
        btnMainMenu6.setBackground(Color.WHITE);
        btnMainMenu6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                jplRhombus.setVisible(false);
                jplMain.setVisible(true);
            }
        });
        btnRhombusAnswer.setSize(100,30);
        btnRhombusAnswer.setLocation(250,170);
        btnRhombusAnswer.setBackground(Color.green);
        btnRhombusAnswer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                sRtaS = jtfRhombusASide.getText();
                aRS = sRtaS.isEmpty() ? 0 : Double.parseDouble(sRtaS);

                sRtp = jtfRhombusP.getText();
                pR = sRtp.isEmpty() ? 0 : Double.parseDouble(sRtp);

                sRtq = jtfRhombusQ.getText();
                qR = sRtq.isEmpty() ? 0 : Double.parseDouble(sRtq);

                if (!sRtaS.isEmpty()) {
                    rhombusPerimeterAns = 4 * (aRS);
                    strRhombusPerimeterAns = Double.toString(rhombusPerimeterAns);
                    jlbRhombusPerimeterAnswer.setText(strRhombusPerimeterAns);
                }
                if (!sRtp.isEmpty() && !sRtq.isEmpty()) {
                    rhombusAreaAns = (pR * qR) / 2;
                    strRhombusAreaAns = Double.toString(rhombusAreaAns);
                    jlbRhombusAreaAnswer.setText(strRhombusAreaAns);
                }
            }
        });

        btnTrapezium.setSize(200,20);
        btnTrapezium.setLocation(100,280);
        btnTrapezium.setBackground(Color.GREEN);
        btnTrapezium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplTrapezium.setVisible(true);
            }
        });

        //Trapezium Panel
        btnTrapezium.setSize(200,50);
        btnTrapezium.setLocation(100,430);
        btnTrapezium.setBackground(Color.GREEN);
        btnTrapezium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jplMain.setVisible(false);
                jplTrapezium.setVisible(true);
            }
        });
        jlbTrapeziumEnterASide.setSize(170,30);
        jlbTrapeziumEnterASide.setLocation(30,50);

        jlbTrapeziumEnterBSide.setSize(170,30);
        jlbTrapeziumEnterBSide.setLocation(30,90);

        jlbTrapeziumEnterCSide.setSize(170,30);
        jlbTrapeziumEnterCSide.setLocation(30,130);

        jlbTrapeziumEnterDSide.setSize(170,30);
        jlbTrapeziumEnterDSide.setLocation(30,170);

        jlbTrapeziumEnterHeight.setSize(170,30);
        jlbTrapeziumEnterHeight.setLocation(30,210);

        jtfTrapeziumASide.setSize(180,30);
        jtfTrapeziumASide.setLocation(170,50);

        jtfTrapeziumBSide.setSize(180,30);
        jtfTrapeziumBSide.setLocation(170,90);

        jtfTrapeziumCSide.setSize(180,30);
        jtfTrapeziumCSide.setLocation(170,130);

        jtfTrapeziumDSide.setSize(180,30);
        jtfTrapeziumDSide.setLocation(170,170);

        jtfTrapeziumHeight.setSize(180,30);
        jtfTrapeziumHeight.setLocation(170,210);

        jlbTrapeziumPerimeter.setSize(170,30);
        jlbTrapeziumPerimeter.setLocation(30,310);

        jlbTrapeziumArea.setSize(170,30);
        jlbTrapeziumArea.setLocation(30,400);

        jlbTrapeziumPerimeterAnswer.setSize(180,30);
        jlbTrapeziumPerimeterAnswer.setLocation(170,310);
        jlbTrapeziumPerimeterAnswer.setBorder(BorderFactory.createEtchedBorder());

        jlbTrapeziumAreaAnswer.setSize(180,30);
        jlbTrapeziumAreaAnswer.setLocation(170,400);
        jlbTrapeziumAreaAnswer.setBorder(BorderFactory.createEtchedBorder());

        btnTrapeziumClear.setSize(100,30);
        btnTrapeziumClear.setLocation(250,500);
        btnTrapeziumClear.setBackground(Color.RED);
        btnTrapeziumClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jtfTrapeziumASide.setText(null);
                jtfTrapeziumBSide.setText(null);
                jtfTrapeziumCSide.setText(null);
                jtfTrapeziumDSide.setText(null);
                jtfTrapeziumHeight.setText(null);
                jlbTrapeziumPerimeterAnswer.setText(null);
                jlbTrapeziumAreaAnswer.setText(null);
            }
        });
        btnMainMenu7.setSize(100,30);
        btnMainMenu7.setLocation(30,500);
        btnMainMenu7.setBackground(Color.WHITE);
        btnMainMenu7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                jplTrapezium.setVisible(false);
                jplMain.setVisible(true);
            }
        });
        btnTrapeziumAnswer.setSize(100,30);
        btnTrapeziumAnswer.setLocation(250,250);
        btnTrapeziumAnswer.setBackground(Color.green);
        btnTrapeziumAnswer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                sTrapeziumAS = jtfTrapeziumASide.getText();
                aSTrapezium = sTrapeziumAS.isEmpty() ? 0 : Double.parseDouble(sTrapeziumAS);

                sTrapeziumBS = jtfTrapeziumBSide.getText();
                bSTrapezium = sTrapeziumBS.isEmpty() ? 0 : Double.parseDouble(sTrapeziumBS);

                sTrapeziumCS = jtfTrapeziumCSide.getText();
                cSTrapezium = sTrapeziumCS.isEmpty() ? 0 : Double.parseDouble(sTrapeziumCS);

                sTrapeziumDS = jtfTrapeziumDSide.getText();
                dSTrapezium = sTrapeziumDS.isEmpty() ? 0 : Double.parseDouble(sTrapeziumDS);

                sTrapeziumHS = jtfTrapeziumHeight.getText();
                hsTrapezium = sTrapeziumHS.isEmpty() ? 0 : Double.parseDouble(sTrapeziumHS);


                if (!sTrapeziumAS.isEmpty() && !sTrapeziumBS.isEmpty() && !sTrapeziumCS.isEmpty() && !sTrapeziumDS.isEmpty()) {
                    trapeziumPerimeterAns = aSTrapezium + bSTrapezium + cSTrapezium + dSTrapezium;
                    strTrapeziumPerimeterAns = Double.toString(trapeziumPerimeterAns);
                    jlbTrapeziumPerimeterAnswer.setText(strTrapeziumPerimeterAns);
                }
                if (!sTrapeziumAS.isEmpty() && !sTrapeziumBS.isEmpty() && !sTrapeziumHS.isEmpty()) {
                    trapeziumAreaAns = (aSTrapezium + bSTrapezium) /2 * (hsTrapezium);
                    strTrapeziumAreaAns = Double.toString(trapeziumAreaAns);
                    jlbTrapeziumAreaAnswer.setText(strTrapeziumAreaAns);
                }
            }
        });
    }
    public static void main(String args[]){
        new MainCode();
    }
}