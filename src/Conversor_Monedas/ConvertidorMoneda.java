
package Conversor_Monedas;

public class ConvertidorMoneda { //Clase
	
	//Atributos
	
	double tipoCambioDolar = 4.190;  // Tipo de cambio de tu país a Dólar
    double tipoCambioEuro = 4.601;  // Tipo de cambio de tu país a Euro
    double tipoCambioLibra = 0.00019;  // Tipo de cambio de tu país a Libra Esterlina
    double tipoCambioYen = 0.034;  // Tipo de cambio de tu país a Yen Japonés
    double tipoCambioWon = 0.31;  // Tipo de cambio de tu país a Won sur-coreano
    

  // Metodos  	
    public double convertirADolar(double cantidad) {
        return cantidad * tipoCambioDolar;
    }

    public double convertirAEuro(double cantidad) {
        return cantidad * tipoCambioEuro;
    }

    public double convertirALibra(double cantidad) {
        return cantidad * tipoCambioLibra;
    }

    public double convertirAYen(double cantidad) {
        return cantidad * tipoCambioYen;
    }

    public double convertirAWon(double cantidad) {
        return cantidad * tipoCambioWon;
    }
}

class ConvertidorTemperatura {
    public double convertirACelsius(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }

    public double convertirAFahrenheit(double temperatura) {
        return (temperatura * 9 / 5) + 32;
    }
}