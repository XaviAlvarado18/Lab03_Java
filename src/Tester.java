// Subclase Tester
public class Tester extends Empleado {
    private String tipoPruebas;

    public Tester(String nombre, int edad, double salario, String tipoPruebas) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    // Override del método abstracto
    @Override
    public void trabajar() {
        System.out.println(nombre + " está realizando pruebas de tipo " + tipoPruebas);
    }

    // Sobrecarga del método trabajar
    public void trabajar(String herramienta, String proyecto) {
        System.out.println(
                nombre + " está probando el proyecto \""
                        + proyecto + "\" con la herramienta " + herramienta
        );
    }
}
