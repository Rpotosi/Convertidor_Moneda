package Conversor_Monedas;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        boolean ejecutar = true;

        while (ejecutar) {
            String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura", "Salir" };
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
                    "Seleccione una opción", "Bienvenidos a Convertidor de Monedas", JOptionPane.QUESTION_MESSAGE, null,
                    opciones, opciones[0]);
            
            

            if (opcionSeleccionada.equals("Salir")) {
                ejecutar = false;
                continue;
            }

            if (opcionSeleccionada.equals("Conversor de Moneda")) {
                ConvertidorMoneda convertidorMoneda = new ConvertidorMoneda();

                String[] opcionesMoneda = { "Dólar a pesos", "Euro a pesos", "Libra Esterlina a pesos", "Yen Japonés a pesos", "Won sur-coreano a pesos",
                		"De pesos a Dólar", "De pesos a Euro", "De pesos Libra Esterlinas", "De pesos a Yen Japonés", "De pesos a Won sur-coreano" };
                String opcionMonedaSeleccionada = (String) JOptionPane.showInputDialog(null,
                        "Seleccione la moneda de conversión", "Convertidor", JOptionPane.QUESTION_MESSAGE, null,
                        opcionesMoneda, opcionesMoneda[0]);

                double cantidad = obtenerCantidad("Ingresa la cantidad de moneda a convertir:");

                if (cantidad == 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor que no sea 0");
                    continue;
                }

                double resultadoMoneda = 0;

                switch (opcionMonedaSeleccionada) {
                    case "Dólar a pesos":
                        resultadoMoneda = convertidorMoneda.convertirADolar(cantidad);
                        break;
                    case "Euro a pesos":
                        resultadoMoneda = convertidorMoneda.convertirAEuro(cantidad);
                        break;
                    case "Libra Esterlina a pesos":
                        resultadoMoneda = convertidorMoneda.convertirALibra(cantidad);
                        break;
                    case "Yen Japonés a pesos":
                        resultadoMoneda = convertidorMoneda.convertirAYen(cantidad);
                        break;
                    case "Won sur-coreano a pesos":
                        resultadoMoneda = convertidorMoneda.convertirAWon(cantidad);
                        break;
                        
                   case "De pesos a Dólar":
                       resultadoMoneda = convertidorMoneda.convertirPesosDolar(cantidad);
                       break;
                   case "De pesos a Euro":
                       resultadoMoneda = convertidorMoneda.convertirPesosEuro(cantidad);
                       break;
                   case "De pesos a Libra Esterlina":
                       resultadoMoneda = convertidorMoneda.convertirPesosLibra(cantidad);
                       break;
                   case "De pesos a Yen Japonés":
                       resultadoMoneda = convertidorMoneda.convertirPesosYen(cantidad);
                       break;
                   case "De pesos Won sur-coreano":
                       resultadoMoneda = convertidorMoneda.convertirPesosW(cantidad);
                       break;     
                        
                }
   

                JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + resultadoMoneda);
                
                                          
                int opcionConfirmacion = JOptionPane.showConfirmDialog(null, "Desea Continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (opcionConfirmacion == JOptionPane.NO_OPTION) {
                    ejecutar = false;
                }
              
                
                

            } else if (opcionSeleccionada.equals("Conversor de Temperatura")) {
                ConvertidorTemperatura convertidorTemperatura = new ConvertidorTemperatura();

                String[] opcionesTemperatura = { "Celsius", "Fahrenheit" };
                String opcionTemperaturaSeleccionada = (String) JOptionPane.showInputDialog(null,
                        "Seleccione la escala de temperatura", "Convertidor de Temperatura",
                        JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]);

                double temperatura = obtenerCantidad("Ingresa la temperatura:");

                double resultadoTemperatura = 0;

                switch (opcionTemperaturaSeleccionada) {
                    case "Celsius":
                        resultadoTemperatura = convertidorTemperatura.convertirACelsius(temperatura);
                        break;
                    case "Fahrenheit":
                        resultadoTemperatura = convertidorTemperatura.convertirAFahrenheit(temperatura);
                        break;
                }

                JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + resultadoTemperatura);
                
            }
        }
    }
  

    private static double obtenerCantidad(String mensaje) {
        while (true) {
            String inputCantidad = JOptionPane.showInputDialog(null, mensaje);

            try {
                double cantidad = Double.parseDouble(inputCantidad);
                return cantidad;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido");
            }
        }
    }
}
