//librerias
import javax.swing.JOptionPane;

public class CostoLlamada{

    //Variables
    private int credito = 1000, os;
    private float n = 0.5f, li = 0.6f, c = 0.2f;
    private double ad;
    private long numcel;
    private String tex, s;

    public void CL(){
        s = JOptionPane.showInputDialog("Bienvenido a Sebcel \n Selecciona la opcion de tu conveniencia \n 1.- Consultar credito \n 2.- Depositar credito \n 3.- Restar llamadas");
        os = Integer.parseInt(s);

        switch(os){
            //Lugar donde estara el metodo
            case 1:
                CC();
                break;
            case 2:
                DC();
                break;
            case 3:
                RC();
            default:
            break;
        }
        
    }

    //Metodos
    public void CC(){              //CC=Consultar credito

        tex = JOptionPane.showInputDialog("Ingrese su numero celular");
        numcel = Long.parseLong(tex);
        JOptionPane.showMessageDialog(null,"Usted tiene un credito de $1000");

    } 
    public void DC(){             //DC=Depositar credito
        JOptionPane.showMessageDialog(null,"A seleccionado depositar credito a su cuenta");
        tex = JOptionPane.showInputDialog("Deposite el dinero que quiera agregar, recuerde que no puede ser menos de $50 ni exceder los $200");
        ad = Double.parseDouble(tex);
            if (ad<50 | ad>200){
                tex = JOptionPane.showInputDialog("No puede depositar menos de $50 ni mas de $200, intente de nuevo");
                ad = Double.parseDouble(tex);
            }
        credito = credito+(int)ad;
        JOptionPane.showMessageDialog(null,"Su credito actual es de: "+credito);
    }
    public void RC(){             //RC=Restar credito
        JOptionPane.showMessageDialog(null,"A seleccionado restar credito a su cuenta");
        tex = JOptionPane.showInputDialog("Ingrese el numero de llamadas NACIONALES");
        n = Float.parseFloat(tex);
        tex = JOptionPane.showInputDialog("Ingrese el numero de llamadas LOCALES INTERNACIONALES");
        li = Float.parseFloat(tex);
        tex = JOptionPane.showInputDialog("Ingrese el numero de llamadas CELULARES");
        c = Float.parseFloat(tex);
        credito = credito - ((int)n+(int)li+(int)c);
        JOptionPane.showMessageDialog(null,"Su credito actual es de: $"+credito);
    } 


}