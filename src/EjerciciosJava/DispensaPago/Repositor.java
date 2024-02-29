package EjerciciosJava.DispensaPago;

public class Repositor extends Empleado{
    public Repositor(String nombre, String puesto, double salario) {
        super(nombre, puesto, salario);
    }

    @Override
    public double salario(double salario) {
        return salario+salario*0.1;
    }
}
