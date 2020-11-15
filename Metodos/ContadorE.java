//Librerias
import javax.swing.JOptionPane;
public class ContadorE{
    //Variables
    private int ano, ano2, edad, edad2;
    private String texto; 
    
    //Metodo para dar a conocer la edad del usuareio
    public void Vejez(){
        JOptionPane.showMessageDialog(null,"Bienvenido para saber que tan viejo eres");    
        texto = JOptionPane.showInputDialog("Ingrese su ano de nacimiento");
        ano = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog("Ingrese el ano actual");
        ano2 = Integer.parseInt(texto);
        if (ano2<=ano){
            texto = JOptionPane.showInputDialog("Numero no valido, no puedes nacer antes de vivir, ni que fueras Marti McFly");
            ano2 = Integer.parseInt(texto);
        }
        edad = ano2-ano;
        edad2 = edad-1;
        JOptionPane.showMessageDialog(null,"Usted tiene entre " +edad+ " y " +edad2+ " anos de antiguedad");
    } 
}