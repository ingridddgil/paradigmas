public abstract class Empleado {
    private int ID;
    private String nombre;
    private double salario;

    public Empleado(int ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

}
