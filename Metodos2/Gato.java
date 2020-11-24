public class Gato extends Animal{
    private String alerte;
    
    public Gato(){
    }

    public Gato(String nombre, String raza, int tipo_alimento, int edad, String alerte){
        super(nombre, raza, tipo_alimento, edad);
        this.alerte = alerte;
    }

    public String getalerte(){
        return alerte;
    }

    public void setalerte(String alerte){
        this.alerte = alerte;
    }

    public void mostrarGato(){
        System.out.println("\nLibro 2:\n\u00ab" + getNombre() + "\u00bb"
                            + ", de " + getRaza()
                            + "\nEjemplares disponibles: " + getTipoAlimento() + "."
                            + "\nEjemplares prestados: " + getEdad() + ".\n"
                            + getalerte());
    }
}