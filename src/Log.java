import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Log {
    private JPanel panel1;
    private JLabel JIniciarSecion;
    private JLabel LUsuario;
    private JTextField TIngreseUsuario;
    private JLabel LContrasenia;
    private JButton BIngresar;
    private JPasswordField contraseñaPasswordField;
    private JLabel ImgIcono;
    private JLabel LEmpresa;
    private JLabel LAstronauta;
    private JRadioButton RBSi;
    private JRadioButton RBNo;
    private JLabel LGuardarPassw;

    String contrasenia;
    String usuario;
    int cont1=0;
    int cont2=0;

    public Log() {
        BIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario=TIngreseUsuario.getText();
                contrasenia=contraseñaPasswordField.getToolTipText();
                System.out.println("Usuario: "+usuario);
                System.out.println("Contrasenia: "+contrasenia);
            }
        });
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
        contraseñaPasswordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (cont2==0) {
                    contraseñaPasswordField.setText("");
                    cont2++;
                }
            }
        });
    }

    public static void main(String[] args){
        JFrame frame= new JFrame("Log");
        frame.setContentPane(new Log().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        /*Para centrar la pantalla utilizo set locationRelative*/
        frame.setLocationRelativeTo(null);
        /*Para descativar las modificaciones de tamanio de pantalla */
        frame.setResizable(false);
    }


}