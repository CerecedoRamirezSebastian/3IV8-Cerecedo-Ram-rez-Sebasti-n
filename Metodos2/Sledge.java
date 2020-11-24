public class Sledge extends Animal{
    private String alerti;
    
    public Sledge(){
    }

    public Sledge(String nombre, String raza, int tipo_alimento, int edad, String alerti){
        super(nombre, raza, tipo_alimento, edad);
        this.alerti = alerti;
    }

    public String getalerti(){
        return alerti;
    }

    public void setalerti(String alerti){
        this.alerti = alerti;
    }

    public void mostrarJordi(){
        System.out.println("\nLibro 3:\n\u00ab" + getNombre() + "\u00bb"
                            + ", de " + getRaza()
                            + "\nEjemplares disponibles: " + getTipoAlimento() + "."
                            + "\nEjemplares prestados: " + getEdad() + ".\n"
                            + getalerti());
    }
}