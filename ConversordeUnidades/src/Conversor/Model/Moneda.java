package Conversor.Model;

public class Moneda {

    public enum Tipo{
       colon_dolar("Colón a Dólar"),dolar_colon("Dólar a colon"), colon_yenjapon("Colón a Yen Japonés"),
       colon_libraesterlina("Colón a Libra esterlina"),colon_euro("Colón a Euro"),
       colon_wonsurCoreano("Colón a WonSurcoreano"),
       euro_colon("Euro a Colón"),
       yenjapon_colon("Yen Japonés a Colón"),
       libraesterlina_colon("Libra esterlina a Colón"),
       wonsurCoreano_colon("WonSurCoreano a Colón");
    	private final String name;

  	  private Tipo(String nameString) {
  		  this.name = nameString;
  	
  	}

  	  @Override
  	  public String toString() {
          
  		  return this.name;
      }
    	
    	
   }

   public Tipo tipo;
   public double valor;

   public double convertir(Tipo tipo, double valor) {
    if (valor < 0) {
        throw new IllegalArgumentException("El valor debe ser mayor o igual a 0");
    }

    this.valor = valor;
    this.tipo = tipo;
    double resultado = 0;

    switch (tipo) {
        case colon_dolar:
            resultado = valor * ValoresConversionMonedas.COLON_A_DOLAR;
            break;
        case dolar_colon:
            resultado = valor * ValoresConversionMonedas.DOLAR_A_COLON;
            break;
        case colon_libraesterlina:
            resultado = valor * ValoresConversionMonedas.COLON_A_LIBRA;
            break;
        case libraesterlina_colon:
            resultado = valor * ValoresConversionMonedas.LIBRA_A_COLON;
            break;
        case euro_colon:
            resultado = valor * ValoresConversionMonedas.EURO_A_COLON;
            break;
        case colon_euro:
            resultado = valor * ValoresConversionMonedas.COLON_A_EURO;
            break;
        case wonsurCoreano_colon:
            resultado = valor * ValoresConversionMonedas.WONSURCOREA_A_COLON;
            break;
        case colon_wonsurCoreano:
            resultado = valor * ValoresConversionMonedas.COLON_A_WONSURCOREA;
            break;
        case colon_yenjapon:
            resultado = valor * ValoresConversionMonedas.COLON_A_YEN;
            break;
        case yenjapon_colon:
            resultado = valor * ValoresConversionMonedas.YEN_A_COLON;
            break;
        default:
            throw new IllegalArgumentException("Elección inválida");
    }

    return resultado;
}



}