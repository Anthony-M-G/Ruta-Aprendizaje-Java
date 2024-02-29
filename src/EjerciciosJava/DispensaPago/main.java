package EjerciciosJava.DispensaPago;

public class main {
    public static void main(String[] args) {
        Repositor rep= new Repositor("Anthony","Repositor",450000);


        System.out.println("El se llama"+rep.Nombre+"Puesto: "+rep.Puesto+"Con un salario de: "+rep.salario(rep.Salario));


    }
}
