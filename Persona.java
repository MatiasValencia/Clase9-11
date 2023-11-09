public class Persona {
    private String nombre;
    private int edad;
    private String rut;
    // Constructor
    public Persona() {}
    public Persona(String nombre, int edad, String rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
    }
    // Getters
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public String getRut() {return rut;}
    // Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setRut(String rut) {this.rut = rut;}
}