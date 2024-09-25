public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado {

    private int horasTrabajadas;

    public EmpleadoTiempoCompleto(int ID, String nombre, double salario, int horasTrabajadas) {
        super(ID, nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * horasTrabajadas;
    }

    @Override
    public double calcularIncentivo(){
        return calcularSalario() * 0.05;
    }
}
