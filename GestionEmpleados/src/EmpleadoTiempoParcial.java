import java.io.Serializable;

public class EmpleadoTiempoParcial extends Empleado implements IEmpleado{
    private int horasPorSemana;

    public EmpleadoTiempoParcial(int ID, String nombre, double salario, int horasPorSemana) {
        super(ID, nombre, salario);
        this.horasPorSemana = horasPorSemana;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * horasPorSemana;
    }

    @Override
    public double calcularIncentivo(){
        return calcularSalario() * 0.03;
    }
}
