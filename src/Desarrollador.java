// Subclase Desarrollador
public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    // Override del método abstracto
    @Override
    public void trabajar() {
        System.out.println(nombre + " está programando en " + lenguajeProgramacion);
    }

    // Sobrecarga del método trabajar
    public void trabajar(String proyecto) {
        System.out.println(
                nombre + " está trabajando en el proyecto \""
                        + proyecto + "\" usando " + lenguajeProgramacion
        );
    }
}
