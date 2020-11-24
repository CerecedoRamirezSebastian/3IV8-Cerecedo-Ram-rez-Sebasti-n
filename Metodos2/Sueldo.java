/*Para saber el sueldo se pregunta primero se tiene que saber el puesto que ocupa dentro de la empresa.
Si es un empleado se pedirá que ingrese las horas extra trabajadas (tanto diurnas, como matutinas);
por otro lado, si se es supervisor, el sueldo se mostrará automáticamente descontando los impuestos. En ambos
casos se imprime en un método distinto el sueldo en conjunto con el identificador del empleado y su apellido
(datos solicitados previos al puesto).
*/
import javax.swing.JOptionPane;

public class Sueldo{
    int id, puesto, extradia, extranoc;
    double gastos, sueldo, sueldoe = 5000, sueldos = 8000;
    double isr = 16, info = 8, med = 12.8;
    String ape;

    public void Dinero(){
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID."));
        ape = JOptionPane.showInputDialog("Ingrese su apellido:");
        puesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su puesto (1, empleado; 2, supervisor):"));
        
        do{
            puesto = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un puesto v\u00e1lido (1, empleado; 2, supervisor):"));
        }while((puesto > 2) || (puesto < 1));
        
        if(puesto == 1){
            DineroE();
        }
        else{
            DineroS();
        }
    }
    
    public void DineroE(){
        extradia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cu\u00e1ntas horas extra diurnas ha trabajado:"));
        extranoc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cu\u00e1ntas horas extra nocturnas ha trabajado:"));

        sueldo = sueldoe + extradia + extranoc;

        DineroR();
    }

    public void DineroS(){
        gastos = isr + info + med;
        sueldo = sueldos - gastos;

        DineroR();
    }

    public void DineroR(){
        JOptionPane.showMessageDialog(null, "Vuestro sueldo, (" +  id + ") " + ape + ", ser\u00e1 de: " + sueldo + " $ esta quincena.");
    }
}
