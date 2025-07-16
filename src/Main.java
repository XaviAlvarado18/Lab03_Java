//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * =====================================================
 *                    Laboratorio #03
 * =====================================================
 * Nombre(s):   Javier Alvarado, Daniel Velasquez
 * Curso:       Curso de aprendizaje Spring Boot ADA
 * Grupo:       2
 * Fecha:       15-07-2025
 * =====================================================
 */


public class Main {
    public static void main(String[] args) {

        // Creación de objeto desarrollador
        Desarrollador dev = new Desarrollador("Alice", 30, 50000, "Java");
        dev.trabajar();
        dev.trabajar(8);
        dev.trabajar("Proyecto X");

        // Creación de objeto tester
        Tester tester = new Tester("Bob", 28, 40000, "Automatizadas");
        tester.trabajar();                       // Override dinámico
        tester.trabajar(6);                      // Overload estático
        tester.trabajar("Selenium", "Proyecto Y"); // Overload estático específico de Tester

        System.out.println("\n");
        System.out.println("---- Polimorfismo por sustitución ----");
        System.out.println("\n");

        // Creación de objetos empleados
        Empleado emp1 = new Desarrollador("Carlos", 25, 45000, "JavaScript");
        emp1.trabajar();
        emp1.trabajar(4);

        // Se hace un casting
        if (emp1 instanceof Desarrollador) {
            ((Desarrollador) emp1).trabajar("Proyecto Z");
        }

        // Creación del segundo objketo Empleado
        Empleado emp2 = new Tester("Diana", 32, 42000, "Funcionales");
        emp2.trabajar();
        emp2.trabajar(5);
        // Para acceder al método trabajar(String, String):
        if (emp2 instanceof Tester) {
            ((Tester) emp2).trabajar("JUnit", "Proyecto W");
        }
    }
}