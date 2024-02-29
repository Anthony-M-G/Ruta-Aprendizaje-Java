package EjerciciosJava.DispensaPago;

public class Empleado {
    String Nombre;
    String Puesto;

    double Salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.Nombre = nombre;
        this.Puesto = puesto;
        this.Salario = salario;
    }
    public double salario(double salario){
        this.Salario=salario;
        return 0;
    }

}
