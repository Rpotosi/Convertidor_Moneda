
package Convertidor_Monedas;

public class ConvertidorMoneda { //Clase
	
	//Atributos
	
	double tipoCambioDolar = 4.196;  // Tipo de cambio de tu país a Dólar
    double tipoCambioEuro = 4.601;  // Tipo de cambio de tu país a Euro
    double tipoCambioLibra = 5.385;  // Tipo de cambio de tu país a Libra Esterlina
    double tipoCambioYen = 29.82;  // Tipo de cambio de tu país a Yen Japonés
    double tipoCambioWon = 3.25;  // Tipo de cambio de tu país a Won sur-coreano
    
    double tipoCambioPesoD = 0.00024;
    double tipoCambioPesoE = 0.00022;
    double tipoCambioPesoL = 0.00019;
    double tipoCambioPesoY = 0.033;
    double tipoCambioPesoW = 0.31;// Tipo de cambio de tu país a Dólar
 

  // Metodos  	
    public double convertirADolar(double cantidad) {
        return cantidad * tipoCambioDolar;
        
    }
    
    public double convertirPesosDolar(double cantidad) {
		return cantidad * tipoCambioPesoD; 
	}

    public double convertirAEuro(double cantidad) {
        return cantidad * tipoCambioEuro;
    }
    public double convertirPesosEuro(double cantidad) {
        return cantidad * tipoCambioPesoE;
    }

    public double convertirALibra(double cantidad) {
        return cantidad * tipoCambioLibra;
    }
    
    public double convertirPesosLibra(double cantidad) {
        return cantidad * tipoCambioPesoL;
    }

    public double convertirAYen(double cantidad) {
        return cantidad * tipoCambioYen;
    }
    public double convertirPesosYen(double cantidad) {
        return cantidad * tipoCambioPesoY;
    }

    public double convertirAWon(double cantidad) {
        return cantidad * tipoCambioWon;
    }
    
    public double convertirPesosW(double cantidad) {
        return cantidad * tipoCambioPesoW;
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