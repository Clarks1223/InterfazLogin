import javax.swing.*;

public class Pagina1 extends Ventanas{
    private JPanel Pag1;
    private JLabel LRol;
    private JLabel LMensaje;
    private JLabel LNombre;
    private JLabel LEdad;
    private JLabel LCorreo;
    private JLabel LExperiencia;
    private JLabel LMensajes;
    private JLabel LPerfil;
    private JLabel LIngreso;
    private JLabel LsetNombre;
    private JLabel LsetEdad;
    private JLabel LsetMail;
    private JLabel LsetExp;
    private JLabel LsetNumMens;
    private JLabel LsetDateLog;
    private JLabel LLogo;

    public Pagina1( String rol,String nom, String edad, String mail, String exp, String sms, String ultimoingreso){
        LRol.setText(rol);
        LsetNombre.setText(nom);
        LsetEdad.setText(edad);
        LsetMail.setText(mail);
        LsetExp.setText(exp);
        LsetNumMens.setText(sms);
        LsetDateLog.setText(ultimoingreso);
    }

    @Override
    public JFrame abrirVentana(){
        JFrame frame= new JFrame("");
        frame.setContentPane(new Pagina1(LRol.getText(), "ING."+LsetNombre.getText(),LsetEdad.getText()+" años", LsetMail.getText(),LsetExp.getText()+" años",LsetNumMens.getText()+" nuevos",LsetDateLog.getText()).Pag1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        /*Para centrar la pantalla utilizo set locationRelative*/
        frame.setLocationRelativeTo(null);
        /*Para descativar las modificaciones de tamanio de pantalla */
        frame.setResizable(false);
        return frame;
    }
    @Override
    public void cerrarVentana(){

    }

}
