public class Animal{
    private String nombre, raza;
    private int tipo_alimento, edad;

    public Animal(){
    }

    public Animal(String nombre, String raza, int tipo_alimento, int edad){
           this.nombre = nombre;
           this.raza = raza;
           this.tipo_alimento = tipo_alimento;
           this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public int getTipoAlimento(){
        return tipo_alimento;
    }

    public void setTipoAlimento(int tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}