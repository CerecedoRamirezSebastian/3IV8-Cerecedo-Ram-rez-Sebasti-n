//autor: Cerecedo Ramirez Sebastian
//libreria
import javax.swing.JOptionPane;
//Comandos es mi principal
public class Comandos{

    ContadorE CE = new ContadorE();
    AreaYPerimetro AP = new AreaYPerimetro();
    CostoLlamada CL = new CostoLlamada();

    //Funcion principal
    public static void main (String[]args){

        //Funcion principal
        //Comandos
        Comandos menup = new Comandos();
        //Variables
        int opcion;
        String texto;
        //Bucle
        do{
            menup.menuP();
            texto = JOptionPane.showInputDialog("Si desea repetir el programa pulse 1, si no pulse 2");
            opcion = Integer.parseInt(texto);
        }while(opcion == 1);
        

    }
    //Metodo para elegir la opcion del menu
    public void menuP(){
        
        int opcion1;
        String selec;

        selec = JOptionPane.showInputDialog("Cerecedo Ramirez Sebastian \n Selecciona una opcion del menu \n 1.-Contador de edad \n 2.-Area y perimetro \n 3.-Costo de llamada");
        opcion1 = Integer.parseInt(selec);

        switch(opcion1){
            case 1:
                CE.Vejez();
                break;
            case 2:
                AP.AP();
                break;
            case 3:
                CL.CL();
            default:
            break;
             
        }
    }
}