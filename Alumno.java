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
    public int comprobarIndice() {
        for (int i = 0; i < 10;i++) {
            if (notas[i] == 0.0) {
                return i;
            }
        }
        return -1;
    }
    public void agregarNota(int nota) {
        int indice = comprobarIndice();
        if (indice == -1) {
            System.out.println("No se puede agregar la nota");
        }
        notas[indice] = (double) nota;
    }
    public void agregarNota(double nota) {
        int indice = comprobarIndice();
        if (indice == -1) {
            System.out.println("No se puede agregar la nota");
        }
        notas[indice] = nota;
    }
}