import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log extends Ventanas {
    private JPanel panel1;
    private JLabel JIniciarSecion;
    private JLabel LUsuario;
    private JTextField TIngreseUsuario;
    private JLabel LContrasenia;
    private JButton BIngresar;
    private JPasswordField Pass;
    private JLabel ImgIcono;
    private JLabel LEmpresa;
    private JLabel LAstronauta;
    private JRadioButton RBSi;
    private JRadioButton RBNo;
    private JLabel LGuardarPassw;
    private String contrasenia="";
    private String usuario;
    int cont1=0;
    int cont2=0;
    int intentos=3;
    static JFrame frame= new JFrame("Log");

    //Constructor
    public Log() {
        //Boton ingresar al sistema
        BIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario=TIngreseUsuario.getText();
                usuario=usuario.toLowerCase();

                char [] password = Pass.getPassword();
                for (int x=0; x<password.length; x++){
                    contrasenia+=password[x];
                }

                if(usuario.equals("pablo.uchuari@epn.edu.ec")) {
                    if (contrasenia.equals("1234")) {
                        Pagina1 pag1 = new Pagina1("Gerente General",
                                "Pablo Uchuari", "24", "pablo.uchuari@epn.edu.ec",
                                "2", "3", calfecha());
                        pag1.abrirVentana();
                        cerrarVentana();
                    }
                    else {
                        intentos--;
                        JOptionPane.showMessageDialog(null,"Contrasenia incorrecta, tiene "+intentos+" intentos");
                        if (intentos == 0 ){
                            System.exit(0);
                        }
                    }
                }
                else if(usuario.equals("melani.molina@epn.edu.ec")) {
                    if (contrasenia.equals("12345")) {
                        Pagina1 pag2 = new Pagina1("Administrador",
                                "Melani Molina", "20", "melani.molina@epn.edu.ec",
                                "1", "1", calfecha());
                        pag2.abrirVentana();
                        cerrarVentana();
                    }
                    else{
                        intentos--;
                        JOptionPane.showMessageDialog(null,"El contrasenia incorrecta, tiene "+intentos+" intentos");
                        if (intentos == 0 ){
                            System.exit(0);
                        }
                    }
                }
                else if (usuario.equals("josue.salazar@epn.edu.ec")){
                    if (contrasenia.equals("123456")){
                        Pagina1 pag3 = new Pagina1("Corrdinador","Josue Salazar",
                                "21","josue.salazar@epn.edu.ec","2","1",calfecha());
                        pag3.abrirVentana();
                        cerrarVentana();
                    }
                    else{
                        intentos--;
                        JOptionPane.showMessageDialog(null,"El contrasenia incorrecta, tiene "+intentos+" intentos");
                        if (intentos == 0 ) {
                            System.exit(0);
                        }
                    }
                }
                else{
                    intentos--;
                    JOptionPane.showMessageDialog(null,"El correo no existe, tiene "+intentos+" intentos");
                    if (intentos == 0 ){
                        System.exit(0);
                    }
                }
                contrasenia="";
            }
        });
        //Dar click en el campo ingrese usuario
        TIngreseUsuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(cont1==0) {
                    TIngreseUsuario.setText("");
                    cont1++;
                }
            }
        });
        //Dar click en el campo ingrese contasenia
        Pass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (cont2==0) {
                    Pass.setText("");
                    cont2++;
                }
            }
        });
    }
    // Metodos
    @Override
    public void abrirVentana(){
        frame.setContentPane(new Log().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        /*Para centrar la pantalla utilizo set locationRelative*/
        frame.setLocationRelativeTo(null);
        /*Para descativar las modificaciones de tamanio de pantalla */
        frame.setResizable(false);
        frame.setVisible(true);
    }
    @Override
    public void cerrarVentana(){
        frame.setVisible(false);
    }
    public String calfecha(){
        String fecha;
        Date date=new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/YYYY");
        fecha=formato.format(date);
        return fecha;
    }
}