package ConversorUnidades;


public class Moneda {

     public enum Tipo{
        colon_dolar,dolar_colon;
    }

    public Tipo tipo;
    public double valor;


    public double convertir(Tipo tipo, double valor){
        this.valor=valor;
        this.tipo=tipo;

        double resultado=0;
        if (valor>=0){
        try{
        if (tipo==Tipo.colon_dolar){
            resultado=valor*ValoresConversion.COLON_A_DOLAR;
        }

        if (tipo==Tipo.dolar_colon){
            resultado=valor*ValoresConversion.DOLAR_A_COLON;
        }
        }catch(Exception e) {
            System.out.println("Eleccion inválida");

        } return resultado;
        }else{
           throw new IllegalArgumentException("Valores mayores que 0");
        }

    }
}




