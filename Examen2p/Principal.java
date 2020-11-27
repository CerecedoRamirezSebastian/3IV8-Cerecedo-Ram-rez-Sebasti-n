import java.io.*;
import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args){
        int op, kobieta;
        cpu mecpu = new cpu();
        mj memj = new mj();
        ganar pomaranczowy = new ganar("estimado usuario:", "gato o tres en raya.", "Esperamos que la pase bien.");
        
        do{
        JOptionPane.showMessageDialog(null, "ESTE PROGRAMA FUE ELABORADO POR:"
                                            + "\nCerecedo Ramirez Sebastian "
                                            + "DEL GRUPO 3IV8.");
        pomaranczowy.mostrarGanar();
        op = Integer.parseInt(JOptionPane.showInputDialog("Elija un modo de juego:"
                                                            + "\n\u2014 CPU (1);\n\u2014 dos jugadores (2)."));
        switch(op){
            case 1:
                do{
                try{
                    mecpu.jugar();
                }catch(IOException io){
                System.out.println("Error " + io.getMessage() + ".");
                }
                kobieta = Integer.parseInt(JOptionPane.showInputDialog("Si desea repetir el juego, digite \u00ab1\u00bb; para salir, digite \u00ab2\u00bb."));
                }while(kobieta == 1);
            break;

            case 2:
                do{
                try{
                    memj.jugar2();
                }catch(IOException io){
                System.out.println("Error " + io.getMessage() + ".");
                }
                kobieta = Integer.parseInt(JOptionPane.showInputDialog("Si desea repetir el juego, digite \u00ab1\u00bb; para salir, digite \u00ab2\u00bb."));
                }while(kobieta == 1);
            break;
        }

        kobieta = Integer.parseInt(JOptionPane.showInputDialog("Si desea volver al men\u00fa, digite \u00ab1\u00bb; para cerrar el programa, digite \u00ab2\u00bb."));
        }while(kobieta == 1);
    }
}
