// Clase abstracta Empleado
public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Método abstracto con polimorfismo
    public abstract void trabajar();

    // Método normal sobrecargado
    public void trabajar(int horas) {
        System.out.println(nombre + " ha trabajado " + horas + " horas");
    }
}
