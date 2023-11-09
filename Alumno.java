public class Alumno extends Persona {
    private double[] notas = new double[10];
    private String curso;
    // Constructor
    public Alumno() {super();}
    public Alumno(String nombre, int edad, String rut, String curso) {
        super(nombre, edad, rut);
        this.curso = curso;
    }
    //Getter
    public double[] getNotas() {return notas;}
    public String getCurso() {return curso;}
    //Setter
    public void setNotas(double[] notas) {this.notas = notas;}
    public void setCurso(String curso) {this.curso = curso;}
    // Metodo
    public void agregarNota(double nota) {
        for (int i = 0;i < notas.length;i++) {
            if (notas[i] < 10) {
                notas[i] = nota;
            }
            if (notas[i] == 10) {
                System.out.println("No se puede agregar notas.");
            }
        }
    }
    public void agregarNota(int nota) {
        for (int i = 0; i < notas.length;i++) {
            if (notas[i] < 10) {
                double notaDouble = nota;
                notas[i] = notaDouble;
            }
            if (notas[i] == 10) {
                System.out.println("No se puede agregar notas.");
            }
        }
    }
}