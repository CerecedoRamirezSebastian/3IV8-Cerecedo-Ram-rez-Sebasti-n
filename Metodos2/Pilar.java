import java.util.Scanner;
import javax.swing.JOptionPane;

//Clase donde se mandan a llamar a las distintas operaciones que realizará el programa.
public class Pilar{
    //Creación del método «menu».
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char letra;

        Sueldo meSueldo = new Sueldo();
        Proveedores meProveedores = new Proveedores();
        Principal meprincipal = new Principal();

        do{
        String texto = JOptionPane.showInputDialog("\nEste programa fue elaborado por: Cerecedo Ramirez Sebastian."
                                                    + "\n\nSeleccione el programa que desea ejecutar:\n\u2014 calculadora de sueldo (1);"
                                                    + "\n\u2014 c\u00e1lculo mercantil (2);\n\u2014 librer\u00eda (3).");

        int op = Integer.parseInt(texto);

        //Se crea un «switch» presentando los programas disponibles.
        switch(op){
            case 1:
                //Se mandan a llamar a los métodos donde se
                //solicitan los datos y donde se imprime la edad.
                do{
                meSueldo.Dinero();
                //Se pregunta si se desea repetir el programa
                //o volver al menú principal.
                System.out.println("\nSi desea volver al men\u00fa principal, digite \u00abm\u00bb; si desea repetir el programa, digite \u00abr\u00bb.");
                letra = entrada.next().charAt(0);
                }while(letra == 'r');
            break;

            case 2:
                do{
                meProveedores.Negocio();
                System.out.println("\nSi desea volver al men\u00fa principal, digite \u00abm\u00bb; si desea repetir el programa, digite \u00abr\u00bb.");
                letra = entrada.next().charAt(0);
                }while(letra == 'r');
            break;

            case 3:
                do{
                meprincipal.Libreria();
                System.out.println("\nSi desea volver al men\u00fa principal, digite \u00abm\u00bb; si desea repetir el programa, digite \u00abr\u00bb.");
                letra = entrada.next().charAt(0);
                }while(letra == 'r');
            break;
        }

        //Se brinda la opción para volver al menú o cerrar el programa.
        System.out.println("\nDigite \u00abm\u00bb de nuevo para volver al men\u00fa principal. \nSi desea cerrar el programa, digite \u00abx\u00bb.");
        letra = entrada.next().charAt(0);
        }while(letra == 'm');
    }
}