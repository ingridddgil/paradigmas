import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto empleadoCompleto1 = new EmpleadoTiempoCompleto(1805, "Juan", 1500.0, 160);
        EmpleadoTiempoParcial empleadoParcial2 = new EmpleadoTiempoParcial(2203, "Ana", 18.0, 15);

        System.out.println("Salario de " + empleadoCompleto1.getNombre() + ": $" + empleadoCompleto1.calcularSalario() + ", más incentivo: $" + empleadoCompleto1.calcularIncentivo());
        System.out.println("Salario de " + empleadoParcial2.getNombre() + ": $" + empleadoParcial2.calcularSalario() + ", más incentivo: $" + empleadoParcial2.calcularIncentivo());
    }
}