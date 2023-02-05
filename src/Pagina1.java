import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

public class Pagina1 extends Ventanas{
    DecimalFormat dcf=new DecimalFormat("#.00");
    private JPanel Pag1;
    private JLabel LRol;
    private JLabel LMensaje;
    private JLabel LNombre;
    private JLabel LEdad;
    private JLabel LCorreo;
    private JLabel LExperiencia;
    private JLabel LMensajes;
    private JLabel LIngreso;
    private JLabel LsetNombre;
    private JLabel LsetEdad;
    private JLabel LsetMail;
    private JLabel LsetExp;
    private JLabel LsetNumMens;
    private JLabel LsetDateLog;
    private JLabel LLogo;
    private JLabel LConversonDivisas;
    private JTextField TFIngresarDolares;
    private JButton BCalcularEuros;
    private JLabel LResultadoEuros;
    private JLabel LConversorDivisas;
    private JLabel LPerfil;
    private JButton BVover;
    static JFrame frame= new JFrame();
    public Pagina1( String rol,String nom, String edad, String mail, String exp, String sms, String ultimoingreso){
        LRol.setText(rol);
        LsetNombre.setText(nom);
        LsetEdad.setText(edad);
        LsetMail.setText(mail);
        LsetExp.setText(exp);
        LsetNumMens.setText(sms);
        LsetDateLog.setText(ultimoingreso);
        TFIngresarDolares.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                TFIngresarDolares.setText("");
            }
        });
        BCalcularEuros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos="";
                double origin=Double.parseDouble(TFIngresarDolares.getText()), tot=0;
                tot=origin*0.92;
                datos=dcf.format(tot)+"€";
                LResultadoEuros.setText(datos);
            }
        });
        BVover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarVentana();
                Log venlog = new Log();
                venlog.abrirVentana();
            }
        });
    }

    @Override
    public void abrirVentana(){
        frame.setContentPane(new Pagina1(LRol.getText(), "ING."+LsetNombre.getText(),
                LsetEdad.getText()+" años", LsetMail.getText(),LsetExp.getText()+" años",
                LsetNumMens.getText()+" nuevos",LsetDateLog.getText()).Pag1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        /*Para centrar la pantalla utilizo set locationRelative*/
        frame.setLocationRelativeTo(null);
        /*Para descativar las modificaciones de tamanio de pantalla */
        frame.setResizable(false);
    }
    @Override
    public void cerrarVentana(){
        frame.setVisible(false);
    }

}
