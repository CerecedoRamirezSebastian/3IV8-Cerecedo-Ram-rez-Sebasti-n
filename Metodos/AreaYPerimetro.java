//Se manda llamar la libreria

import javax.swing.JOptionPane;

//Nombre de la clase
public class AreaYPerimetro{

    //Variables
    private double a1, a2, a3, a4, p1, p2, p3, p4, l1, l2, l3, l4, lc, r, lr1, lr2;
    private int op;
    private String sele, tx;


    //Metodo para conseguir areas y perimetros
    public void AP(){
        sele = JOptionPane.showInputDialog("Areas y perimetros \n Selecciona una opcion del menu \n 1.- Triangulo \n 2.- Cuadrado \n 3.- Circulo \n 4.- Rectangulo");
        op = Integer.parseInt(sele);

        switch(op){
            case 1:                
                Triangulo();
                break;
            case 2:
                Cuadrado();                
                break;
            case 3:
                Circulo();
                break;
            case 4:
                Rectangulo();
                //Como mi programa no acepta negativos por razones obvias por eso está el if
            default:  
            break;
        }
    }//Metodos separados que contienen las indicaciones para cada figura 
    public void Triangulo(){
        
        JOptionPane.showMessageDialog(null,"Area y perimetro de un triangulo");
        tx = JOptionPane.showInputDialog("Ingrese la base");
        l1 = Double.parseDouble(tx);
        if (l1<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            l1 = Double.parseDouble(tx);
        }
        tx = JOptionPane.showInputDialog("Ingrese la altura");
        l2 = Double.parseDouble(tx);
        if (l2<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            l2 = Double.parseDouble(tx);
        }
        a1 = (l1*l2)/2;
        tx = JOptionPane.showInputDialog("Ingrese un lado");
        l3 = Double.parseDouble(tx);
        if (l3<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            l3 = Double.parseDouble(tx);
        }
        tx = JOptionPane.showInputDialog("Ingrese el ultimo lado");
        l4 = Double.parseDouble(tx);
        if (l4<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            l4 = Double.parseDouble(tx);
        }
        p1 = l1+l3+l4;
        JOptionPane.showMessageDialog(null,"Su area es de" +a1+"u^2 y su perimettro es de " +p1+ " u");
    }

    public void Cuadrado(){

        JOptionPane.showMessageDialog(null,"Area y perimetro de un cuadrado");
        tx = JOptionPane.showInputDialog("Ingrese un lado");
        lc = Double.parseDouble(tx);
        if (lc<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            lc = Double.parseDouble(tx);
        }
        a2 = lc*lc;
        p2 = lc*4;
        JOptionPane.showMessageDialog(null,"Su area es de" +a2+"u^2 y su perimettro es de " +p2+ " u");  
    }    
    public void Circulo(){

        JOptionPane.showMessageDialog(null,"Area y perimetro de un circulo");
        tx = JOptionPane.showInputDialog("Ingrese el radio");
        r = Double.parseDouble(tx);
        if (r<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            r = Double.parseDouble(tx);
        }
        a3 = 3.1416*(r*r);
        p3 = 3.1416*(r*2);
        JOptionPane.showMessageDialog(null,"Su area es de" +a3+"u^2 y su perimettro es de " +p3+ " u");
    } 
    public void Rectangulo(){
        JOptionPane.showMessageDialog(null,"Area y perimetro de un rectangulo");
        tx = JOptionPane.showInputDialog("Ingrese la altura");
        lr1 = Double.parseDouble(tx);
        if (lr1<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            lr1 = Double.parseDouble(tx);
        } 
        tx = JOptionPane.showInputDialog("Ingrese la base");
        lr2 = Double.parseDouble(tx);
        if (lr2<=0){
            tx = JOptionPane.showInputDialog("Ingrese un valor positivo");
            lr2 = Double.parseDouble(tx);
        }   
        a4 = lr1*lr2;
        p4 = (lr1 + lr2)*2;
        JOptionPane.showMessageDialog(null,"Su area es de" +a4+"u^2 y su perimettro es de " +p4+ " u");
    }                   
}   