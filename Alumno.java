public class Alumno extends Persona {
    private double[] notas;
    // Constructor
    public Alumno() {super();}
    //Getter
    public double[] getNotas() {return notas;}
    //Setter
    public void setNotas(double[] notas) {this.notas = new double[10];}
}