import javax.swing.*;

public class Pagina1{
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


    public static void main(String[] args){
        JFrame frame= new JFrame("");
        frame.setContentPane(new Pagina1().Pag1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        /*Para centrar la pantalla utilizo set locationRelative*/
        frame.setLocationRelativeTo(null);
        /*Para descativar las modificaciones de tamanio de pantalla */
        frame.setResizable(false);
    }

}
