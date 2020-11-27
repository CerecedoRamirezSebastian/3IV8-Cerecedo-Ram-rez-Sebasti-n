import javax.swing.JOptionPane;

public class ganar extends datos{
    private String dzien;

    public ganar(){
    }

    public ganar(String witaj, String mensaje, String dzien){
        super(witaj, mensaje);
        this.dzien = dzien;
    }

    public String getDzien(){
        return dzien;
    }

    public void setDzien(String dzien){
        this.dzien = dzien;
    }

    public void mostrarGanar(){
        JOptionPane.showMessageDialog(null,"\nSaludos, " + getWitaj()
                                            + "\nBienvenido al juego de " + getMensaje()
                                            + "\n" + getDzien());
    }
}