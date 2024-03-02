package Conversor.Model;

public class Temperatura {
  public enum Tipo{
      Celsius_Farenheit("Celsius a Farenheit"),
      Farenheit_Celsius("Farenheit a Celsius"),
      Kelvin_Farenheit("Kelvin a Farenheit"),
      Farenheit_Kelvin("Farenheit a Kelvin"),
      Celsius_Kelvin("Celsius a Kelvin"),
      Kelvin_Celsius("Kelvin a Celsius");
	  
	  private final String name;

	  private Tipo(String nameString) { //Genero un Constructor para adjudicarle un valor de nombre a los enums
		  this.name = nameString;
	
	}

	  @Override
	  public String toString() { // Le da una representacion al valor de cada constante
        return this.name;
    }
	}
  Tipo tipo;
  double valor;

  public double convertir(Tipo tipo, double valor) {
    if (valor < 0) {
        throw new IllegalArgumentException("El valor debe ser mayor o igual a 0");
    }

    double resultado = 0;

    switch (tipo) {
        case Celsius_Farenheit:
            resultado = (valor * 9/5) + 32;
            break;
        case Farenheit_Celsius:
            resultado = (valor - 32) * 5/9;
            break;
        case Celsius_Kelvin:
            resultado = valor + 273.15;
            break;
        case Kelvin_Celsius:
            resultado = valor - 273.15;
            break;
        case Farenheit_Kelvin:
            resultado = (valor - 32) * 5/9 + 273.15;
            break;
        case Kelvin_Farenheit:
            resultado = (valor - 273.15) * 9/5 + 32;
            break;
        default:
            throw new IllegalArgumentException("Elección inválida");
    }

    return resultado;
}




	
}
