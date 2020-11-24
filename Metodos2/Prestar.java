import javax.swing.JOptionPane;

public class Prestar{
    public void Prestado(){
        Principal meprincipal = new Principal();
        Pilar mepilar = new Pilar();
        int numo;

        numo = Integer.parseInt(JOptionPane.showInputDialog("\nSi desea retirar alg\u00fan libro, digite el n\u00famero asignado a este."));

        do{
            numo = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor, digite un t\u00edtulo existente y con existencias."));
        }while(numo != 3);

        JOptionPane.showMessageDialog(null,"\nHa usted extra\u00eddo con \u00e9xito Un casco para mi almohada, de Sledge, E.");
        numo = Integer.parseInt(JOptionPane.showInputDialog("\u00bfDesea devolver el libro o extraer otro?\nDigite 1 para devolver o 2 para extraer otro."));

        if(numo == 1){
            JOptionPane.showMessageDialog(null,"\nDevoluci\u00f3n realizada con \u00e9xito.");
            meprincipal.Libreria();
        }
        else if(numo == 2){
            numo = Integer.parseInt(JOptionPane.showInputDialog("\nError. No se cuentan con existencias suficientes para un pr\u00e9stamo."
                                                                + "\nDevuelva el libro con el que cuenta actualmente digitando 1 o digite 2 para huir."));
                if(numo == 1){
                    meprincipal.Libreria();
                }
        }
    }
}