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
    // Metodos
    public int comprobarIndice(double nota) {
        for (int i = 0; i < 10;i++) {
            if (notas[i] == nota) {
                return i;
            }
        }
        return -1;
    }
    public void agregarNota(int nota) {
        int indice = comprobarIndice(0.0);
        if (indice == -1) {
            System.out.println("No se puede agregar la nota");
        }
        notas[indice] = (double) nota;
    }
    public void agregarNota(double nota) {
        int indice = comprobarIndice(0.0);
        if (indice == -1) {
            System.out.println("No se puede agregar la nota");
        }
        notas[indice] = nota;
    }
    public void eliminarNota(double nota) {
        int indice = comprobarIndice(nota);
        if (indice == -1) {
            System.out.println("La nota no existe");
            return;
        }
        notas[indice] = 0.0;
    }
    public void calcularPromedio() {
        double sumatoria = 0.0;
        int contador = 0;
        for (int i = 0; i < 10;i++) {
            if (notas[i] != 0.0) {
                sumatoria = sumatoria + notas[i];
                contador++;
            }
        }
        System.out.println("El promedio es: " + (sumatoria / contador));
    }
}